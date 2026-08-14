/**
 */
package org.nasdanika.models.seal;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.iam.AccessControlled;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sealed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Sealed elements ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.SealedElement#getEncryptedFeatures <em>Encrypted Features</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.SealedElement#getVariantFeatures <em>Variant Features</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.SealedElement#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getSealedElement()
 * @model abstract="true"
 * @generated
 */
public interface SealedElement extends AccessControlled {
	/**
	 * Returns the value of the '<em><b>Encrypted Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.EncryptedFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Features</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getSealedElement_EncryptedFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<EncryptedFeature> getEncryptedFeatures();

	/**
	 * Returns the value of the '<em><b>Variant Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.VariantFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Features</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getSealedElement_VariantFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariantFeature> getVariantFeatures();

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getSealedElement_Signatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // SealedElement
