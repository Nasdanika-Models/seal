/**
 */
package org.nasdanika.models.seal;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encrypted Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sealed value: ciphertext produced with a symmetric content key
 * (AES-256 GCM by default), plus that content key wrapped to each
 * recipient. Adding a recipient adds a WrappedKey; the ciphertext is
 * untouched. IVs, nonces, AAD, and padding parameters travel in
 * properties to stay provider-neutral.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.EncryptedValue#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.EncryptedValue#getCiphertext <em>Ciphertext</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.EncryptedValue#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getEncryptedValue()
 * @model
 * @generated
 */
public interface EncryptedValue extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Content encryption algorithm, e.g. "aes-256-gcm".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.nasdanika.models.seal.SealPackage#getEncryptedValue_Algorithm()
	 * @model unique="false"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.EncryptedValue#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Ciphertext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Base64 ciphertext. In the bundled (cardinality-hiding) case, the ciphertext of a serialized sub-resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ciphertext</em>' attribute.
	 * @see #setCiphertext(String)
	 * @see org.nasdanika.models.seal.SealPackage#getEncryptedValue_Ciphertext()
	 * @model unique="false"
	 * @generated
	 */
	String getCiphertext();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.EncryptedValue#getCiphertext <em>Ciphertext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ciphertext</em>' attribute.
	 * @see #getCiphertext()
	 * @generated
	 */
	void setCiphertext(String value);

	/**
	 * Returns the value of the '<em><b>Recipients</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.WrappedKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipients</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getEncryptedValue_Recipients()
	 * @model containment="true"
	 * @generated
	 */
	EList<WrappedKey> getRecipients();

} // EncryptedValue
