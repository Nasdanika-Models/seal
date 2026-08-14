/**
 */
package org.nasdanika.models.seal;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.models.nxcore.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A directory of keys, typically aligned with an IAM Realm: an
 * organization keyring, a public keyring of subscription-tier group keys.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.Keyring#getKeys <em>Keys</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.seal.SealPackage#getKeyring()
 * @model
 * @generated
 */
public interface Keyring extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.seal.Key}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' containment reference list.
	 * @see org.nasdanika.models.seal.SealPackage#getKeyring_Keys()
	 * @model containment="true"
	 * @generated
	 */
	EList<Key> getKeys();

} // Keyring
