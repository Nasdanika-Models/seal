/**
 */
package org.nasdanika.models.seal.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.seal.Key;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.WrappedKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wrapped Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.WrappedKeyImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.WrappedKeyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WrappedKeyImpl extends MinimalEObjectImpl.Container implements WrappedKey {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrappedKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.WRAPPED_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key getKey() {
		return (Key)eDynamicGet(SealPackage.WRAPPED_KEY__KEY, SealPackage.Literals.WRAPPED_KEY__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetKey() {
		return (Key)eDynamicGet(SealPackage.WRAPPED_KEY__KEY, SealPackage.Literals.WRAPPED_KEY__KEY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(Key newKey) {
		eDynamicSet(SealPackage.WRAPPED_KEY__KEY, SealPackage.Literals.WRAPPED_KEY__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(SealPackage.WRAPPED_KEY__VALUE, SealPackage.Literals.WRAPPED_KEY__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(SealPackage.WRAPPED_KEY__VALUE, SealPackage.Literals.WRAPPED_KEY__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SealPackage.WRAPPED_KEY__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case SealPackage.WRAPPED_KEY__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SealPackage.WRAPPED_KEY__KEY:
				setKey((Key)newValue);
				return;
			case SealPackage.WRAPPED_KEY__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SealPackage.WRAPPED_KEY__KEY:
				setKey((Key)null);
				return;
			case SealPackage.WRAPPED_KEY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SealPackage.WRAPPED_KEY__KEY:
				return basicGetKey() != null;
			case SealPackage.WRAPPED_KEY__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

} //WrappedKeyImpl
