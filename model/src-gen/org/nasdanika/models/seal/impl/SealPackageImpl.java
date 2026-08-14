/**
 */
package org.nasdanika.models.seal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.role.RolePackage;

import org.nasdanika.models.seal.Author;
import org.nasdanika.models.seal.EncryptedFeature;
import org.nasdanika.models.seal.EncryptedValue;
import org.nasdanika.models.seal.Key;
import org.nasdanika.models.seal.Keyring;
import org.nasdanika.models.seal.SealFactory;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.SealedElement;
import org.nasdanika.models.seal.Signature;
import org.nasdanika.models.seal.Variant;
import org.nasdanika.models.seal.VariantFeature;
import org.nasdanika.models.seal.WrappedKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SealPackageImpl extends EPackageImpl implements SealPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrappedKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sealedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.seal.SealPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SealPackageImpl() {
		super(eNS_URI, SealFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SealPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SealPackage init() {
		if (isInited) return (SealPackage)EPackage.Registry.INSTANCE.getEPackage(SealPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSealPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SealPackageImpl theSealPackage = registeredSealPackage instanceof SealPackageImpl ? (SealPackageImpl)registeredSealPackage : new SealPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NxcorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		IamPackage.eINSTANCE.eClass();
		RolePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSealPackage.createPackageContents();

		// Initialize created meta-data
		theSealPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSealPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SealPackage.eNS_URI, theSealPackage);
		return theSealPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Algorithm() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Fingerprint() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Material() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Location() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKey_Subject() {
		return (EReference)keyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Expires() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKey_Revoked() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyring() {
		return keyringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKeyring_Keys() {
		return (EReference)keyringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWrappedKey() {
		return wrappedKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWrappedKey_Key() {
		return (EReference)wrappedKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWrappedKey_Value() {
		return (EAttribute)wrappedKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptedValue() {
		return encryptedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedValue_Algorithm() {
		return (EAttribute)encryptedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedValue_Ciphertext() {
		return (EAttribute)encryptedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedValue_Recipients() {
		return (EReference)encryptedValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncryptedFeature() {
		return encryptedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedFeature_Feature() {
		return (EAttribute)encryptedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEncryptedFeature_Value() {
		return (EReference)encryptedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEncryptedFeature_Bundled() {
		return (EAttribute)encryptedFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariantFeature() {
		return variantFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantFeature_Feature() {
		return (EAttribute)variantFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantFeature_Variants() {
		return (EReference)variantFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariant() {
		return variantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_Subjects() {
		return (EReference)variantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariant_Condition() {
		return (EAttribute)variantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariant_Value() {
		return (EAttribute)variantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_Encrypted() {
		return (EReference)variantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariant_Signatures() {
		return (EReference)variantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthor_Name() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthor_Identity() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthor_Subject() {
		return (EReference)authorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Algorithm() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Canonicalization() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Value() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Timestamp() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Key() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Features() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Comment() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Authors() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSealedElement() {
		return sealedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSealedElement_EncryptedFeatures() {
		return (EReference)sealedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSealedElement_VariantFeatures() {
		return (EReference)sealedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSealedElement_Signatures() {
		return (EReference)sealedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SealFactory getSealFactory() {
		return (SealFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		keyEClass = createEClass(KEY);
		createEAttribute(keyEClass, KEY__ALGORITHM);
		createEAttribute(keyEClass, KEY__FINGERPRINT);
		createEAttribute(keyEClass, KEY__MATERIAL);
		createEAttribute(keyEClass, KEY__LOCATION);
		createEReference(keyEClass, KEY__SUBJECT);
		createEAttribute(keyEClass, KEY__EXPIRES);
		createEAttribute(keyEClass, KEY__REVOKED);

		keyringEClass = createEClass(KEYRING);
		createEReference(keyringEClass, KEYRING__KEYS);

		wrappedKeyEClass = createEClass(WRAPPED_KEY);
		createEReference(wrappedKeyEClass, WRAPPED_KEY__KEY);
		createEAttribute(wrappedKeyEClass, WRAPPED_KEY__VALUE);

		encryptedValueEClass = createEClass(ENCRYPTED_VALUE);
		createEAttribute(encryptedValueEClass, ENCRYPTED_VALUE__ALGORITHM);
		createEAttribute(encryptedValueEClass, ENCRYPTED_VALUE__CIPHERTEXT);
		createEReference(encryptedValueEClass, ENCRYPTED_VALUE__RECIPIENTS);

		encryptedFeatureEClass = createEClass(ENCRYPTED_FEATURE);
		createEAttribute(encryptedFeatureEClass, ENCRYPTED_FEATURE__FEATURE);
		createEReference(encryptedFeatureEClass, ENCRYPTED_FEATURE__VALUE);
		createEAttribute(encryptedFeatureEClass, ENCRYPTED_FEATURE__BUNDLED);

		variantFeatureEClass = createEClass(VARIANT_FEATURE);
		createEAttribute(variantFeatureEClass, VARIANT_FEATURE__FEATURE);
		createEReference(variantFeatureEClass, VARIANT_FEATURE__VARIANTS);

		variantEClass = createEClass(VARIANT);
		createEReference(variantEClass, VARIANT__SUBJECTS);
		createEAttribute(variantEClass, VARIANT__CONDITION);
		createEAttribute(variantEClass, VARIANT__VALUE);
		createEReference(variantEClass, VARIANT__ENCRYPTED);
		createEReference(variantEClass, VARIANT__SIGNATURES);

		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__NAME);
		createEAttribute(authorEClass, AUTHOR__IDENTITY);
		createEReference(authorEClass, AUTHOR__SUBJECT);

		signatureEClass = createEClass(SIGNATURE);
		createEAttribute(signatureEClass, SIGNATURE__ALGORITHM);
		createEAttribute(signatureEClass, SIGNATURE__CANONICALIZATION);
		createEAttribute(signatureEClass, SIGNATURE__VALUE);
		createEAttribute(signatureEClass, SIGNATURE__TIMESTAMP);
		createEReference(signatureEClass, SIGNATURE__KEY);
		createEAttribute(signatureEClass, SIGNATURE__FEATURES);
		createEAttribute(signatureEClass, SIGNATURE__COMMENT);
		createEReference(signatureEClass, SIGNATURE__AUTHORS);

		sealedElementEClass = createEClass(SEALED_ELEMENT);
		createEReference(sealedElementEClass, SEALED_ELEMENT__ENCRYPTED_FEATURES);
		createEReference(sealedElementEClass, SEALED_ELEMENT__VARIANT_FEATURES);
		createEReference(sealedElementEClass, SEALED_ELEMENT__SIGNATURES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		IamPackage theIamPackage = (IamPackage)EPackage.Registry.INSTANCE.getEPackage(IamPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		keyEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		keyringEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		encryptedValueEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		encryptedFeatureEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		variantFeatureEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		variantEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		signatureEClass.getESuperTypes().add(theNxcorePackage.getModelElement());
		sealedElementEClass.getESuperTypes().add(theIamPackage.getAccessControlled());

		// Initialize classes, features, and operations; add parameters
		initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKey_Algorithm(), theEcorePackage.getEString(), "algorithm", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Fingerprint(), theEcorePackage.getEString(), "fingerprint", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Material(), theEcorePackage.getEString(), "material", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Location(), theEcorePackage.getEString(), "location", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKey_Subject(), theIamPackage.getSubject(), null, "subject", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Expires(), theEcorePackage.getEDate(), "expires", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKey_Revoked(), theEcorePackage.getEBoolean(), "revoked", null, 0, 1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyringEClass, Keyring.class, "Keyring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyring_Keys(), this.getKey(), null, "keys", null, 0, -1, Keyring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wrappedKeyEClass, WrappedKey.class, "WrappedKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWrappedKey_Key(), this.getKey(), null, "key", null, 0, 1, WrappedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWrappedKey_Value(), theEcorePackage.getEString(), "value", null, 0, 1, WrappedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptedValueEClass, EncryptedValue.class, "EncryptedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncryptedValue_Algorithm(), theEcorePackage.getEString(), "algorithm", null, 0, 1, EncryptedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedValue_Ciphertext(), theEcorePackage.getEString(), "ciphertext", null, 0, 1, EncryptedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedValue_Recipients(), this.getWrappedKey(), null, "recipients", null, 0, -1, EncryptedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptedFeatureEClass, EncryptedFeature.class, "EncryptedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncryptedFeature_Feature(), theEcorePackage.getEString(), "feature", null, 0, 1, EncryptedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptedFeature_Value(), this.getEncryptedValue(), null, "value", null, 0, 1, EncryptedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptedFeature_Bundled(), theEcorePackage.getEBoolean(), "bundled", null, 0, 1, EncryptedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantFeatureEClass, VariantFeature.class, "VariantFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariantFeature_Feature(), theEcorePackage.getEString(), "feature", null, 0, 1, VariantFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariantFeature_Variants(), this.getVariant(), null, "variants", null, 0, -1, VariantFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variantEClass, Variant.class, "Variant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariant_Subjects(), theIamPackage.getSubject(), null, "subjects", null, 0, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariant_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariant_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariant_Encrypted(), this.getEncryptedValue(), null, "encrypted", null, 0, 1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariant_Signatures(), this.getSignature(), null, "signatures", null, 0, -1, Variant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthor_Identity(), theEcorePackage.getEString(), "identity", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthor_Subject(), theIamPackage.getSubject(), null, "subject", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignature_Algorithm(), theEcorePackage.getEString(), "algorithm", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_Canonicalization(), theEcorePackage.getEString(), "canonicalization", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_Timestamp(), theEcorePackage.getEDate(), "timestamp", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Key(), this.getKey(), null, "key", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_Features(), theEcorePackage.getEString(), "features", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignature_Comment(), theEcorePackage.getEString(), "comment", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Authors(), this.getAuthor(), null, "authors", null, 0, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sealedElementEClass, SealedElement.class, "SealedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSealedElement_EncryptedFeatures(), this.getEncryptedFeature(), null, "encryptedFeatures", null, 0, -1, SealedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSealedElement_VariantFeatures(), this.getVariantFeature(), null, "variantFeatures", null, 0, -1, SealedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSealedElement_Signatures(), this.getSignature(), null, "signatures", null, 0, -1, SealedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (keyEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Keys (the distribution graph) ----"
		   });
		addAnnotation
		  (getKey_Algorithm(),
		   source,
		   new String[] {
			   "documentation", " Algorithm/format identifier, e.g. \"openpgp\", \"rsa-4096\", \"x25519\"; interpreted by the bound provider."
		   });
		addAnnotation
		  (getKey_Fingerprint(),
		   source,
		   new String[] {
			   "documentation", " Provider-format fingerprint used to match keys without inlining material."
		   });
		addAnnotation
		  (getKey_Material(),
		   source,
		   new String[] {
			   "documentation", " Optional inline public material, e.g. ASCII-armored OpenPGP."
		   });
		addAnnotation
		  (getKey_Location(),
		   source,
		   new String[] {
			   "documentation", " URI of an external key source when material is not inline: a keyring entry, a KMS key, a keyserver. Resolved via the capability framework."
		   });
		addAnnotation
		  (getKey_Subject(),
		   source,
		   new String[] {
			   "documentation", " Whose key this is: recipient when wrapping, signer when signing."
		   });
		addAnnotation
		  (keyringEClass,
		   source,
		   new String[] {
			   "documentation", "A directory of keys, typically aligned with an IAM Realm: an\norganization keyring, a public keyring of subscription-tier group keys."
		   });
		addAnnotation
		  (wrappedKeyEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Encryption (for whom) ----"
		   });
		addAnnotation
		  (getWrappedKey_Value(),
		   source,
		   new String[] {
			   "documentation", " The wrapped (encrypted) content key, base64."
		   });
		addAnnotation
		  (encryptedValueEClass,
		   source,
		   new String[] {
			   "documentation", "A sealed value: ciphertext produced with a symmetric content key\n(AES-256 GCM by default), plus that content key wrapped to each\nrecipient. Adding a recipient adds a WrappedKey; the ciphertext is\nuntouched. IVs, nonces, AAD, and padding parameters travel in\nproperties to stay provider-neutral."
		   });
		addAnnotation
		  (getEncryptedValue_Algorithm(),
		   source,
		   new String[] {
			   "documentation", " Content encryption algorithm, e.g. \"aes-256-gcm\"."
		   });
		addAnnotation
		  (getEncryptedValue_Ciphertext(),
		   source,
		   new String[] {
			   "documentation", " Base64 ciphertext. In the bundled (cardinality-hiding) case, the ciphertext of a serialized sub-resource."
		   });
		addAnnotation
		  (encryptedFeatureEClass,
		   source,
		   new String[] {
			   "documentation", "Ties an EncryptedValue to a structural feature of the protected\nelement. The plaintext feature is unset; this record is why, and for\nwhom. For many-valued features, `bundled` selects the posture:\nfalse = element-level (each value sealed on its own, siblings and count\nvisible as proxies), true = feature-level (the value decrypts to a\nsub-resource holding the elements; without the key the feature reifies\nas an empty list and the cardinality is hidden with the contents)."
		   });
		addAnnotation
		  (getEncryptedFeature_Feature(),
		   source,
		   new String[] {
			   "documentation", " Structural feature name on the protected element."
		   });
		addAnnotation
		  (variantFeatureEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Variant features (which value, not how much of it) ----"
		   });
		addAnnotation
		  (getVariantFeature_Feature(),
		   source,
		   new String[] {
			   "documentation", " Structural feature name on the protected element."
		   });
		addAnnotation
		  (variantEClass,
		   source,
		   new String[] {
			   "documentation", "One candidate value. Applies when the reader matches `subjects` (an IAM\nGroup, Role, or Principal) and/or `condition` (ABAC over the reading\nprincipal). A literal value, a sealed value, or both may be present;\nvalue may be a Groovy script when different readers get different\nbehavior rather than different data (draw-first, execute-later at\nfeature granularity)."
		   });
		addAnnotation
		  (getVariant_Condition(),
		   source,
		   new String[] {
			   "documentation", " Boolean expression over the reading principal\'s attributes and properties."
		   });
		addAnnotation
		  (authorEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Signatures (who signed, and why) ----"
		   });
		addAnnotation
		  (getAuthor_Identity(),
		   source,
		   new String[] {
			   "documentation", " External identity, typically an e-mail."
		   });
		addAnnotation
		  (signatureEClass,
		   source,
		   new String[] {
			   "documentation", "A detached signature over a canonical form of an element\'s content, or\nof named features of it. Who signed is key.subject: the signer is the\nparty that recorded and cryptographically attests the entry, distinct\nfrom the authors who are responsible for it, exactly as Git separates\ncommitter from author. With comment and authors, a value answers not\njust \"what\" but \"who, why, on whose authority, and who vouches\"."
		   });
		addAnnotation
		  (getSignature_Algorithm(),
		   source,
		   new String[] {
			   "documentation", " Signature algorithm, e.g. \"openpgp\", \"ed25519\"."
		   });
		addAnnotation
		  (getSignature_Canonicalization(),
		   source,
		   new String[] {
			   "documentation", " Canonicalization scheme identifier the signature was computed over."
		   });
		addAnnotation
		  (getSignature_Value(),
		   source,
		   new String[] {
			   "documentation", " The detached signature, base64."
		   });
		addAnnotation
		  (getSignature_Key(),
		   source,
		   new String[] {
			   "documentation", " The signing key; the signer is key.subject."
		   });
		addAnnotation
		  (getSignature_Features(),
		   source,
		   new String[] {
			   "documentation", " Feature names covered; empty means the whole element. Mirrors AccessControlEntry.features."
		   });
		addAnnotation
		  (getSignature_Comment(),
		   source,
		   new String[] {
			   "documentation", " Rationale: a commit message at feature granularity. May itself be a confidential feature in the enclosing element."
		   });
		addAnnotation
		  (sealedElementEClass,
		   source,
		   new String[] {
			   "documentation", " ---- Sealed elements ----"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //SealPackageImpl
