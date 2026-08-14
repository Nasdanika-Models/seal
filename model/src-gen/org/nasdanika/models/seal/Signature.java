/**
 */
package org.nasdanika.models.seal;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A detached signature over a canonical form of an element's content, or
 * of named features of it. Who signed is key.subject: the signer is the
 * party that recorded and cryptographically attests the entry, distinct
 * from the authors who are responsible for it, exactly as Git separates
 * committer from author. With comment and authors, a value answers not
 * just "what" but "who, why, on whose authority, and who vouches".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.Signature#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Signature#getCanonicalization <em>Canonicalization</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Signature#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Signature#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Signature#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Signature#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Signature#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Signature#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Signature algorithm, e.g. "openpgp", "ed25519".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Algorithm()
	 * @model unique="false"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Signature#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Canonicalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Canonicalization scheme identifier the signature was computed over.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Canonicalization</em>' attribute.
	 * @see #setCanonicalization(String)
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Canonicalization()
	 * @model unique="false"
	 * @generated
	 */
	String getCanonicalization();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Signature#getCanonicalization <em>Canonicalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canonicalization</em>' attribute.
	 * @see #getCanonicalization()
	 * @generated
	 */
	void setCanonicalization(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The detached signature, base64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Signature#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Timestamp()
	 * @model unique="false"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Signature#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The signing key; the signer is key.subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(Key)
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Key()
	 * @model
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Signature#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Feature names covered; empty means the whole element. Mirrors AccessControlEntry.features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' attribute list.
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Features()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getFeatures();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Rationale: a commit message at feature granularity. May itself be a confidential feature in the enclosing element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Comment()
	 * @model unique="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Signature#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.Author}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getSignature_Authors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Author> getAuthors();

} // Signature
