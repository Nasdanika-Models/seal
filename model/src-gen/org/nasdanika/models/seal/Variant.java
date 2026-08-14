/**
 */
package org.nasdanika.models.seal;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One candidate value. Applies when the reader matches `subjects` (an IAM
 * Group, Role, or Principal) and/or `condition` (ABAC over the reading
 * principal). A literal value, a sealed value, or both may be present;
 * value may be a Groovy script when different readers get different
 * behavior rather than different data (draw-first, execute-later at
 * feature granularity).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.Variant#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Variant#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Variant#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Variant#getEncrypted <em>Encrypted</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Variant#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getVariant()
 * @model
 * @generated
 */
public interface Variant extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.iam.Subject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjects</em>' reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getVariant_Subjects()
	 * @model
	 * @generated
	 */
	EList<Subject> getSubjects();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Boolean expression over the reading principal's attributes and properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.nasdanika.models.seal.SealPackage#getVariant_Condition()
	 * @model unique="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Variant#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.models.seal.SealPackage#getVariant_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Variant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Encrypted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted</em>' containment reference.
	 * @see #setEncrypted(EncryptedValue)
	 * @see org.nasdanika.models.seal.SealPackage#getVariant_Encrypted()
	 * @model containment="true"
	 * @generated
	 */
	EncryptedValue getEncrypted();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Variant#getEncrypted <em>Encrypted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted</em>' containment reference.
	 * @see #getEncrypted()
	 * @generated
	 */
	void setEncrypted(EncryptedValue value);

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.Signature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getVariant_Signatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // Variant
