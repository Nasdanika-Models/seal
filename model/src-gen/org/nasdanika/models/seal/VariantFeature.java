/**
 */
package org.nasdanika.models.seal;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Variant features (which value, not how much of it) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.VariantFeature#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.VariantFeature#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getVariantFeature()
 * @model
 * @generated
 */
public interface VariantFeature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Structural feature name on the protected element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see org.nasdanika.models.seal.SealPackage#getVariantFeature_Feature()
	 * @model unique="false"
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.VariantFeature#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.Variant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getVariantFeature_Variants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variant> getVariants();

} // VariantFeature
