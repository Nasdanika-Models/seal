/**
 */
package org.nasdanika.models.seal;

import java.util.Date;

import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Keys (the distribution graph) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.Key#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Key#getFingerprint <em>Fingerprint</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Key#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Key#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Key#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Key#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Key#isRevoked <em>Revoked</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Algorithm/format identifier, e.g. "openpgp", "rsa-4096", "x25519"; interpreted by the bound provider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.nasdanika.models.seal.SealPackage#getKey_Algorithm()
	 * @model unique="false"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Key#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Provider-format fingerprint used to match keys without inlining material.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fingerprint</em>' attribute.
	 * @see #setFingerprint(String)
	 * @see org.nasdanika.models.seal.SealPackage#getKey_Fingerprint()
	 * @model unique="false"
	 * @generated
	 */
	String getFingerprint();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Key#getFingerprint <em>Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fingerprint</em>' attribute.
	 * @see #getFingerprint()
	 * @generated
	 */
	void setFingerprint(String value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Optional inline public material, e.g. ASCII-armored OpenPGP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' attribute.
	 * @see #setMaterial(String)
	 * @see org.nasdanika.models.seal.SealPackage#getKey_Material()
	 * @model unique="false"
	 * @generated
	 */
	String getMaterial();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Key#getMaterial <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' attribute.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URI of an external key source when material is not inline: a keyring entry, a KMS key, a keyserver. Resolved via the capability framework.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.models.seal.SealPackage#getKey_Location()
	 * @model unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Key#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Whose key this is: recipient when wrapping, signer when signing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Subject)
	 * @see org.nasdanika.models.seal.SealPackage#getKey_Subject()
	 * @model
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Key#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(Date)
	 * @see org.nasdanika.models.seal.SealPackage#getKey_Expires()
	 * @model unique="false"
	 * @generated
	 */
	Date getExpires();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Key#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(Date value);

	/**
	 * Returns the value of the '<em><b>Revoked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revoked</em>' attribute.
	 * @see #setRevoked(boolean)
	 * @see org.nasdanika.models.seal.SealPackage#getKey_Revoked()
	 * @model unique="false"
	 * @generated
	 */
	boolean isRevoked();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Key#isRevoked <em>Revoked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revoked</em>' attribute.
	 * @see #isRevoked()
	 * @generated
	 */
	void setRevoked(boolean value);

} // Key
