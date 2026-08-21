
```drawio-resource
../seal.drawio
```

An [Ecore](https://ecore.models.nasdanika.org/) micro-model of confidentiality and provenance: keys, sealed values, per-reader variants, and signatures attachable to any model element in any model above.
Ten types, and not one line of cryptography of its own - the algorithms belong to the providers.

[TOC levels=6]

## Scope, and what the name promises

A seal in the old sense is wax over a fold.
It closed the letter *and* told the recipient who closed it, and if it arrived broken you knew.
Confidentiality and attestation in one act, carried by the artifact rather than by the courier - which is exactly the pair of halves this model types: `EncryptedFeature` and `Signature`, over the same element, in the same file.

What the name does not promise, and the model deliberately excludes, is the cryptography itself.
There are no algorithm implementations here, no key generation, no rotation mechanics, no certificate or PKI lifecycle, and above all no private keys: `Key` carries public material or a `location` URI pointing at a keyring entry, a KMS key, or a keyserver, and the private counterpart never enters the model at all.
That exclusion is what makes a sealed model safe to commit and publish as it stands.
`algorithm` and `canonicalization` are provider-interpreted strings rather than enumerations, and the provider behind them - BouncyCastle and OpenPGP by default, an enterprise KMS, HSM, or PKI where one is mandated - is resolved through the [capability framework](https://docs.nasdanika.org/capability/).

The alternatives were worse.
"Encryption" loses the provenance half, which is the half that gets used first; "signature" loses the confidentiality half; "crypto" names the implementation this model refuses to contain; "security" is too broad, and "protection" was already spoken for one floor down.
There is a namesake worth acknowledging - Bitnami's Sealed Secrets, which encrypts Kubernetes secrets to a specific cluster - and the metaphor is borrowed from the same place rather than from them.

## Position in the tower

The aspect spine of the [Nasdanika model tower](https://nasdanika.com/models.html) runs

> [nxcore](https://nxcore.models.nasdanika.org/) < [role](https://role.models.nasdanika.org/) < [iam](https://iam.models.nasdanika.org/) < **seal** < [lifecycle](https://lifecycle.models.nasdanika.org/) < [accounting](https://accounting.models.nasdanika.org/) < [decision analysis](https://analysis.decision.models.nasdanika.org/) < [decision binding](https://binding.decision.models.nasdanika.org) < [governance](https://governance.models.nasdanika.org/) < [work](https://work.models.nasdanika.org/) < [requirements](https://requirements.models.nasdanika.org/) < [architecture](https://architecture.models.nasdanika.org/) < [threat](https://threat.models.nasdanika.org/)

and the enterprise branch continues off the top of it into [capability](https://capability.models.nasdanika.org/), [product management](https://product-management.models.nasdanika.org/), and [org design](https://org-design.models.nasdanika.org/).

This is the fourth floor, and its dependency is two lines long: everything extends nxcore's `ModelElement`, and `SealedElement` extends the [IAM model](https://iam.models.nasdanika.org/)'s `AccessControlled` while `Key.subject`, `Variant.subjects`, and `Author.subject` refer to IAM `Subject`s.
That is all of it.
In exchange, everything above - a sojourn, a ledger entry, an expert judgment, a control, a work item, an architecture element, an asset, an agent's record of what it did - arrives already sealable and already signable.

**Above IAM, because cryptography enforces a policy rather than being one.**
Encryption answers *how* a restriction is made unbreakable outside the system that authored it; it cannot answer *what* the restriction is or *for whom*, and that has to exist first.
So this floor adds material rather than semantics: a `Group` one floor down becomes the unit of key distribution, which makes group membership the key distribution graph; `Signature.features` mirrors `AccessControlEntry.features`, so what is restricted, what is sealed, and what is signed share one coordinate system; and `SealedElement extends AccessControlled` says plainly that a seal enforces a visibility somebody else defined.
Where the IAM floor's move is to decide access *before publication*, so that a confidential element is absent from a generated artifact rather than hidden behind a check a misconfigured route might skip, this floor takes the same idea one step further: keep one artifact, ship it everywhere, and let the reader's keys decide what reifies.

**Below lifecycle, because a sign-off has to ride on the record that needed it.**
`Staged extends SealedElement`, so a `Sojourn` - a dated period in a stage, attributed to the subject who moved the element - is signable, and an approval gate becomes a transition guard demanding a signed sojourn rather than a workflow state asserting that an approval happened somewhere.

**Independent of everything above, deliberately.**
Signing execution as well as content is a natural extension - binding a change set to the span that produced it - but a signed span would live on a higher floor, so the coupling points upward: a telemetry or work model references a `Signature`, never the reverse.

Being this low imposes the discipline every low floor accepts: whatever this floor costs, every floor above pays.
Hence `SealedElement` adds three containment features, all empty by default.
An element with no sealed features, no variants, and no signatures is simply unprotected, so the aspect costs nothing until the moment somebody decides to share.

## Protection that travels with the artifact

Almost everything in the landscape below protects a *channel* or a *store*: TLS on the wire, a private bucket, a repository ACL, a rights-management server that has to be reachable at the moment of opening.
The center of gravity here is different, and it is the point of the model.

The unit of protection is the **feature**, not the file, and the protection is part of the artifact.
A sealed feature has its plaintext slot unset, because a ciphertext rarely fits a typed slot such as a number or a date, and the `EncryptedFeature` record beside it says what was sealed, under which algorithm, and for whom.
Because that record is a modeled sibling rather than a wrapper format, a protected model is still a valid model: a reader without keys loads it, gets the public part, and is not handed a broken document.
A reader with keys loads the same file and gets more of it.
There is no server in the loop, no round trip, and no moment at which a misconfigured route can serve the confidential projection to the wrong audience, because the audiences differ by what they can decrypt rather than by which endpoint they reach.

The consequence for provenance is symmetrical.
A detached `Signature` over a canonical form of an element - or of named features of it - travels in the same file as the thing it attests, so "who asserted this, on whose authority, and has it been altered" is answered by the artifact and not by a CI log that will be rotated away or a wiki page that outlived the system it described.
A signature checked today is checkable in a decade with open tools and no live account, which is a different property from being able to look it up while the vendor is still in business.

## Competitive landscape

Six camps, several of which are complements routinely misread as competitors, and one of which is a second copy of the document.

**Whole-file encryption.** Password-protected PDF, encrypted Office documents, encrypted zip, [age](https://age-encryption.org/), PGP and GPG.
The everyday baseline, and in the case of age and PGP the source of this model's recipient handling: a content key wrapped to each recipient's public key is exactly their construct, borrowed on purpose.
The limit is granularity.
The unit is the file or the message, so a summary cannot stay readable while the detail stays sealed, and people respond by over-sharing or over-restricting.
This model uses an OpenPGP provider for the cryptography and the same recipient model, then adds sub-file granularity, signed elements, and format independence on top.

**Secrets in version control.** [SOPS](https://github.com/getsops/sops), git-crypt, Bitnami Sealed Secrets, and the various encrypting Git filters.
The nearest tools in spirit, and SOPS is the strongest existing analog: encrypt selected values inside a structured file, leave the rest readable, distribute by public key.
The differences are the ones this model is about.
None of them treat provenance as first class, none project different views of one artifact to different audiences by key, none follow a protected value through a transformation from a diagram to Markdown to a typed model, and all of them operate on a configuration file rather than on a domain model whose features already carry types, documentation, and access control entries.
SOPS is what a skeptic reaches for, and it remains the right answer for a `values.yaml`.

**Element-granular document security standards.** XML Encryption and XML Signature, and the JOSE family - JWS and JWE.
XML Encryption and XML Signature are the closest conceptual ancestors - element granularity, detached signatures, documents mixing public and confidential parts - and the limitation is in the name.
They are bound to XML, they do not follow content out of it, and they carry the canonicalization and wrapping-attack complexity the XML security stack is known for.
JOSE is mature, correct, and protects a payload as a unit, which makes it a fine wire format inside a provider and not an artifact model: there is no partial disclosure within one object and no multi-party provenance accumulating over time.

**Supply-chain and media provenance.** [Sigstore](https://www.sigstore.dev/) with cosign, Rekor, and Fulcio; in-toto and SLSA attestations; [C2PA](https://c2pa.org/) Content Credentials.
The current center of gravity for artifact provenance, and complementary rather than competing: they sign artifacts as units and record the fact publicly, with no story about confidentiality at all.
A publisher can anchor a boundary roll-up signature in a transparency log and lose nothing by it.
C2PA is the closest analog to rolling signatures up at a trust boundary, aimed at images, video, and audio rather than at structured models.
Where these optimize for public auditability of a whole artifact, this model optimizes for fine-grained, partly confidential, multi-party documents.

**Enterprise rights management.** Microsoft Purview and Azure Information Protection, Seclore, Vera.
The camp with the most functional overlap: per-document and sometimes per-section policy, audience scoping, revocation.
The price is a proprietary, server-anchored runtime.
Enforcement depends on a live service and a specific ecosystem, federation across organizations is weak, and long-term verifiability is at the vendor's discretion.
Here enforcement is open primitives carried by the artifact, so it federates and stays verifiable without an account - at the cost of doing key distribution explicitly, which is the honest trade.

**Key and entitlement infrastructure.** HashiCorp Vault, cloud KMS and HSM services, entitlement platforms, Stripe.
Providers, not rivals.
They manage keys and gate access to secrets; they do not model a protected, signed, progressively revealable artifact.
The capability framework binds them behind `Key.location` and the signing provider, and a group key distributed through the billing system is what makes an entitlement and the ability to decrypt one fact rather than two systems to reconcile.

**The real competitor, as always: the second copy of the document.** A redacted deck and a full deck, a public folder and an internal one, a demo build and a commercial build, plus an e-mail with the numbers.
Cheaper than any model for producing one answer once.
The wedge is everything after the first answer - the two copies diverging on the first hurried release, the redaction that turned out to be a black rectangle over live text, the recipient who now needs a third variant, and the question a year later of which copy the customer actually received.

The position this model takes is the diagonal none of the six occupy: **confidentiality and provenance as typed data attached to the protected feature, in the same artifact and the same version control as the thing it protects, resolved on the consumer side by the keys the reader holds, and uniform across every model in the tower at once.**

## What a typed model adds

**The protected unit is a named feature.** `EncryptedFeature.feature` and `Signature.features` name structural features of the protected element, in the same coordinate system as `AccessControlEntry.features` one floor down.
A ticket summary stays public while its comments, attachments, and risk rating are sealed, inside one element, and the restriction, the seal, and the attestation over that feature line up instead of living in three vocabularies.

**Algorithms are data and providers are capabilities.** `algorithm`, `canonicalization`, and `fingerprint` are provider-interpreted strings, not enumerations.
This is the move the tower makes everywhere - [lifecycle](https://lifecycle.models.nasdanika.org/) with stages, [work](https://work.models.nasdanika.org/) with `WorkType`, [IAM](https://iam.models.nasdanika.org/) with `Action` - applied to cryptography: a suite change is a data change, an organization binds the provider it is required to use, and two organizations with incompatible crypto stacks assemble into one model without either surrendering theirs.

**Only public material is modeled.** `Key` holds a fingerprint, optional inline public material or a `location` URI, plus `expires` and `revoked`.
The sealed artifact and its keyring are therefore publishable as they stand, and verification can ask the question that actually matters - was this key valid at `Signature.timestamp` - rather than only whether the bytes check out today.
`Keyring` aligns with an IAM `Realm`, so an organization keyring and a public keyring of subscription-tier group keys are one construct at two scopes.

**Adding a recipient is a rewrap, not a re-encrypt.** One `EncryptedValue` holds the ciphertext under a symmetric content key; a `WrappedKey` per recipient holds that content key wrapped to a public key.
Distribution scales with the number of recipients rather than with the size of the payload, and "for whom was this encrypted" is a modeled list rather than an operational recollection.

**Group membership is the key distribution graph.** Because `Key.subject` is an IAM `Subject`, a key belongs to a principal, a group, or a role - so a subscription tier, a review board, or a trust domain boundary is a key, with no bespoke entitlement infrastructure to stand up.
The billing system distributes the group key, and entitlement and decryptability stop being two records that drift.

**Cardinality is a separate secret from contents, and `bundled` says which one you keep.** A consumer shown an empty list learns nothing; a consumer shown ten sealed entries learns there are ten things they may not open, and sometimes that count is the leak.
Element-level sealing - `bundled` false - shows the entries as proxies and opens the subset the reader holds keys for.
Feature-level sealing - `bundled` true - puts the elements in an encrypted sub-resource, so without the key the feature reifies as a schema-valid empty list and the number is hidden along with the contents.
The two compose: an outer bundle hides the size from outsiders while inner element-level seals enforce per-element access among insiders.

**Variant features are encryption turned inside out.** Where a sealed value is one ciphertext and many keys, a `VariantFeature` is many values and one selector: `Variant.subjects` matches an IAM group, role, or principal, `Variant.condition` is an ABAC expression over the reading principal, and the reader resolves the one value that applies.
This answers a question progressive disclosure cannot.
The sales tax in St. Johns County is 6.75% and in Duval County it is 7%; neither is a redaction of the other and no projection turns one into the other.
Variants need not be encrypted at all - a jurisdictional rate is public - but each carries its own `signatures`, so the value a reader resolves is still attributable and tamper-evident.

**A variant value can be behavior.** Because behavior is a form of data, `Variant.value` may be a Groovy script resolved through the capability framework, which makes per-reader logic a modeled, sealable, signable value: polymorphism at the granularity of a single feature, and confidential logic encrypted to the principals entitled to run it.

**Signer and authors are different parties, exactly as in Git.** `Signature.key.subject` is who recorded and cryptographically attests the entry; `Signature.authors` is who owns the decision, in Git author form - `name`, `identity`, and an optional link to a modeled `Subject` - and authors need not hold keys.
A pipeline action signs what a risk council decided, and the record says so.
The `Co-authored-by` convention needs no new mechanism, and a delegated change records its true origin instead of collapsing into whoever happened to hold the key.

**`comment` is a commit message at feature granularity.** A risk rating does not merely read `HIGH`; it reads `HIGH`, set because the upstream vendor has no SOC 2 and the data is regulated, by Jane Doe and the Risk Council, recorded by the pipeline signer, on a date, verifiably.
Every value becomes blamable the way a line of code is - and because the comment is itself a feature of a `SealedElement`, the rationale can be confidential while the value is public: reviewers see why, the public sees what.

**Partial and multi-party signing is the default, not a mode.** `Signature.features` left empty means the whole element; naming features means those features.
An artifact can therefore be signed by several parties over different parts, accumulated over time, and verified per element with no trusted server and no expectation that one signature covers everything.
At a trust boundary a publisher signs under a boundary key and either preserves the inner signatures or deliberately drops them - which matters when the internal reviewers and role names are themselves the sensitive part.

**Keys, seals, and signatures are documented model elements.** They extend nxcore's `ModelElement`, so they carry documentation, markers, and `uris` merge anchors: a key or a signature has a permalink back to the line and the commit that asserted it, and a keyring authored by one team converges with another's by URI rather than through a registry that has to exist first.

## Applications

### One artifact, many audiences

The flagship.
A published model whose overview is open and whose detail is reserved for subscribers is one file, not a community fork and a commercial fork that diverge on the first hurried release.
Tiers are IAM `Group`s, groups are keys, and the consumer reifies whatever their keys open - the demo projection or the full one, from the same bytes, with no server round trip to enforce the difference.
This is the sealed counterpart of identity-scoped generation on the [IAM](https://iam.models.nasdanika.org/) floor: generate separate artifacts where the audiences never meet, seal one artifact where they do.

### Licensing captured expertise: the metamodel itself

Ecore is metacircular, so a metamodel is a model, and its `EClass`es, structural features, and enumerations seal and sign with no new mechanism at all.
That matters because the metamodel is frequently where the value sits: an instance is data, a metamodel is the worked-out answer to what the entities are and which constraints hold, which is why database schemas have been licensed for serious money.
Core elements of an Azure metamodel stay open - subscription, resource group, resource - while rich SKU enumerations and pricing-tier constraints are sealed to the subscriber group keys.
The constraint is a modeling one as much as a cryptographic one: the free projection has to remain a *valid* metamodel, so premium features are optional, a withheld class leaves no dangling references, and where it would, the cardinality-hiding bundled form applies.
Signing closes the other half - a consumer building against a published definition can verify it is the authentic one, which is the schema counterpart of checking a dependency's signature.

### Curated catalogs and a content marketplace

A paid, attributable evaluation of providers against criteria is the Gartner and Forrester product, and the [capability model](https://capability.models.nasdanika.org/) expresses such a catalog natively.
This floor is what makes it deliverable: the free tier is a real, valid, usable model - a subset of providers, criteria without weights - and the paid tier unseals the rest in place.
Element-level signatures are what make the evaluation worth buying, because an analyst's rating has value precisely in being attributable and unforgeable, while a signature over the published artifact covers the bundle as a unit.
Several parties can publish partial evaluations over the same model and a consumer federates them, each contribution signed, each subscription opening a different region of one model.

### Architecture as code, with provenance

Snapshots pulled from Jira, Confluence, and similar systems are committed as XML, YAML, or JSON, signed with the extractor key, and selectively sealed: summaries open, comments and attachments and risk ratings sealed to the people entitled to them.
Later contributors add cloud resource identifiers and review notes under their own keys and signatures, without necessarily being able to read everything they contribute to.
An unauthorized edit fails verification and is rejected rather than silently merged, so the artifact accumulates trust as it accumulates hands.

### Artifacts as workflow state for agents

A signed, selectively sealed artifact in version control is durable shared state: read it, validate the signatures, decide whether there is enough information to act, act, update features, re-sign, commit - and the commit triggers the next step, which proceeds only when its own preconditions hold and the upstream signatures verify.
For multi-agent and human-agent workflows this is how participants trust contributions they did not produce, with no central broker.
The [IAM](https://iam.models.nasdanika.org/) floor bounds what an agent may reach; this floor records what it actually wrote, under a key, with a rationale and a named human author who remains accountable for the decision.

### Approval gates and attestations

Compose with [lifecycle](https://lifecycle.models.nasdanika.org/), [role](https://role.models.nasdanika.org/), and [governance](https://governance.models.nasdanika.org/).
`Staged extends SealedElement`, so an approval is a signed `Sojourn`: the transition guard demands a signature by a subject engaged as approver on the date of signing, and segregation of duties is the constraint that the author's subject is not the signer's.
Because sojourns and grants accumulate rather than being overwritten, both are answerable retrospectively - and a signed sojourn is exactly the evidence a governance control wants to cite.

### Shared ledgers outside your own storage

With [accounting](https://accounting.models.nasdanika.org/) two floors up, a household or association ledger lives in ordinary cloud storage without the storage having to be trusted: IAM says which role sees which accounts, seal makes the parts nobody outside should see unreadable to the provider as well, and correspondent entries exchanged between parties are signed rather than merely asserted.
Feature-level bundling earns its keep here too, because the number of accounts in an estate can be as sensitive as their balances.

### Values that differ by jurisdiction, tenant, or reader

Variant features carry per-jurisdiction rates, per-tenant configuration and pricing, per-audience rationale, and per-reader behavior, from one artifact.
A multi-tenant deployment stops maintaining a configuration copy per tenant, each variant is signed by whoever set it, and a boundary transform can collapse a variant feature to the single value an external audience should see - a deliberate, signed act rather than a filtering accident.

### Retrieval that respects the fence

Retrieval-augmented generation over sealed artifacts inherits the per-feature boundary, so the index does not become the hole in it.
The chunks a retriever can build are the chunks its keys open, and an answer can cite the signature and the rationale behind a value instead of paraphrasing it out of its provenance.

## Operating a sealed model

Seals and signatures are produced and consumed at the resource loading and saving boundary, which is what keeps them format-independent:

* **Providers through the capability framework.** BouncyCastle and OpenPGP, GPG-backed, as the default an individual or a small team is unlikely to need to replace; a KMS, HSM, or PKI bound as an alternative provider with no change to the model or the artifacts.
* **Keys from wherever they already live.** Inline public material for the simple case, `location` URIs for a keyring entry, a KMS key, or a keyserver, and group keys distributed through the billing system for subscription tiers.
* **CLI command chains.** [Nasdanika CLI](https://docs.nasdanika.org/nsd-cli/) encrypt, decrypt, sign, and validate over a document, a directory tree, or a diagram, so protection composes into Git hooks and CI pipelines.
* **A VS Code feature extension** over the CLI base extension, surfacing the same four operations as editor actions, with the CLI remaining the single implementation.
* **The same model across formats.** Ecore models, [Markdown](https://markdown.models.nasdanika.org/) - attributes on headers and fenced divs - and draw.io diagrams, so protection follows content through a transformation instead of lapsing at each conversion.

Three limits are worth stating rather than discovering.
Canonicalization is the hard part of cross-format signing, and a signature is only as portable as the canonical form both ends compute.
Cardinality hiding is not free of side channels - proxy URIs can disclose type or identity, and ciphertext length is a coarse proxy for count, so hiding even the approximate size means padding to bucket sizes.
And revocation is a distribution problem the model records but does not solve: `revoked` and `expires` state the fact, while re-keying a group when a subscription lapses is an operational act underneath the artifact.

## Model overview

| Area | Types |
|---|---|
| Extension point | `SealedElement` (extends IAM `AccessControlled`; contains `encryptedFeatures`, `variantFeatures`, `signatures`, all empty by default) |
| Keys | `Key` (`algorithm`, `fingerprint`, `material`, `location`, `subject`, `expires`, `revoked` - public material only), `Keyring` (a directory, typically aligned with a `Realm`) |
| Encryption | `EncryptedValue` (`algorithm`, `ciphertext`, `recipients`), `WrappedKey` (one content key wrapped to one recipient), `EncryptedFeature` (`feature`, `bundled` - element-level or cardinality-hiding) |
| Variants | `VariantFeature` (`feature`), `Variant` (`subjects`, `condition`, `value` and/or `encrypted`, own `signatures`; the value may be a script) |
| Provenance | `Signature` (`algorithm`, `canonicalization`, `value`, `timestamp`, `key`, `features`, `comment`, `authors`), `Author` (`name`, `identity`, optional `subject`) |
| Reused, not redefined | nxcore `ModelElement`, documentation, `Marker`s, and `uris` merge anchors; IAM `Subject`, `Group`, `Realm`, `AccessControlled`, and the `features` coordinate system |

## What sits on top

[Lifecycle](https://lifecycle.models.nasdanika.org/) sits directly above and is the first consumer: `Staged extends SealedElement`, which makes every `Sojourn` signable and turns an approval gate into a typed dependency rather than a convention.

Above that, protection arrives by inheritance rather than by declaration.
[Accounting](https://accounting.models.nasdanika.org/) gets signed correspondent entries and a ledger that is safe in storage it does not control.
[Decision analysis](https://analysis.decision.models.nasdanika.org/) can seal individual judgments, so a Delphi panel's anonymity becomes a modeled property, and [decision binding](https://binding.decision.models.nasdanika.org) records who signed the binding.
[Governance](https://governance.models.nasdanika.org/) reads a signature as evidence with provenance rather than as a screenshot of an approval.
[Work](https://work.models.nasdanika.org/), [requirements](https://requirements.models.nasdanika.org/), [architecture](https://architecture.models.nasdanika.org/), and [threat](https://threat.models.nasdanika.org/) inherit the aspect without declaring anything - and on the threat floor keys, keyrings, and trust boundaries become part of the surface being analyzed rather than only the mechanism protecting it.
[Capability](https://capability.models.nasdanika.org/), [product management](https://product-management.models.nasdanika.org/), and [org design](https://org-design.models.nasdanika.org/) get tiered publication of one artifact, which is what turns a catalog into something deliverable to subscribers.

## Resources

* [Sources on GitHub](https://github.com/Nasdanika-Models/seal)
* [Nasdanika model tower](https://nasdanika.com/models.html)
* [IAM model](https://iam.models.nasdanika.org/) - the floor directly below, where visibility is defined before it is enforced
* [Lifecycle model](https://lifecycle.models.nasdanika.org/) - the floor directly above, where a signed sojourn becomes an approval
* [Role model](https://role.models.nasdanika.org/) - engagement, and the accountability a signature's authors point back to
* [NxCore model](https://nxcore.models.nasdanika.org/) - identity, documentation, provenance, and time
* [Markdown model](https://markdown.models.nasdanika.org/) - one of the formats the same seals and signatures apply to
* [Architecture model](https://architecture.models.nasdanika.org/) - the tower ordering and the rules that govern it
