/**
 */
package org.nasdanika.models.seal;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.iam.Subject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  ---- Signatures (who signed, and why) ----
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.Author#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Author#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.Author#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.seal.SealPackage#getAuthor_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Author#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  External identity, typically an e-mail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see org.nasdanika.models.seal.SealPackage#getAuthor_Identity()
	 * @model unique="false"
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Author#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Subject)
	 * @see org.nasdanika.models.seal.SealPackage#getAuthor_Subject()
	 * @model
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.seal.Author#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

} // Author
