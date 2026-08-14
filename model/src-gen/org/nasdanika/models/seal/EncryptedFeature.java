/**
 */
package org.nasdanika.models.seal;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encrypted Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ties an EncryptedValue to a structural feature of the protected
 * element. The plaintext feature is unset; this record is why, and for
 * whom. For many-valued features, `bundled` selects the posture:
 * false = element-level (each value sealed on its own, siblings and count
 * visible as proxies), true = feature-level (the value decrypts to a
 * sub-resource holding the elements; without the key the feature reifies
 * as an empty list and the cardinality is hidden with the contents).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.EncryptedFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.EncryptedFeature#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.EncryptedFeature#isBundled <em>Bundled</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getEncryptedFeature()
 * @model
 * @generated
 */
public interface EncryptedFeature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Structural feature name on the protected element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see org.nasdanika.models.seal.SealPackage#getEncryptedFeature_Feature()
	 * @model unique="false"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.EncryptedFeature#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(EncryptedValue)
	 * @see org.nasdanika.models.seal.SealPackage#getEncryptedFeature_Value()
	 * @model containment="true"
	 * @generated
	 */
	EncryptedValue getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.EncryptedFeature#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EncryptedValue value);

	/**
	 * Returns the value of the '<em><b>Bundled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundled</em>' attribute.
	 * @see #setBundled(boolean)
	 * @see org.nasdanika.models.seal.SealPackage#getEncryptedFeature_Bundled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isBundled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.EncryptedFeature#isBundled <em>Bundled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundled</em>' attribute.
	 * @see #isBundled()
	 * @generated
	 */
	void setBundled(boolean value);

} // EncryptedFeature
