/**
 */
package org.nasdanika.models.seal.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.seal.EncryptedFeature;
import org.nasdanika.models.seal.EncryptedValue;
import org.nasdanika.models.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encrypted Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.EncryptedFeatureImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.EncryptedFeatureImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.EncryptedFeatureImpl#isBundled <em>Bundled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncryptedFeatureImpl extends ModelElementImpl implements EncryptedFeature {
	/**
	 * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isBundled() <em>Bundled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBundled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUNDLED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.ENCRYPTED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeature() {
		return (String)eDynamicGet(SealPackage.ENCRYPTED_FEATURE__FEATURE, SealPackage.Literals.ENCRYPTED_FEATURE__FEATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(String newFeature) {
		eDynamicSet(SealPackage.ENCRYPTED_FEATURE__FEATURE, SealPackage.Literals.ENCRYPTED_FEATURE__FEATURE, newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedValue getValue() {
		return (EncryptedValue)eDynamicGet(SealPackage.ENCRYPTED_FEATURE__VALUE, SealPackage.Literals.ENCRYPTED_FEATURE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(EncryptedValue newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, SealPackage.ENCRYPTED_FEATURE__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(EncryptedValue newValue) {
		eDynamicSet(SealPackage.ENCRYPTED_FEATURE__VALUE, SealPackage.Literals.ENCRYPTED_FEATURE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBundled() {
		return (Boolean)eDynamicGet(SealPackage.ENCRYPTED_FEATURE__BUNDLED, SealPackage.Literals.ENCRYPTED_FEATURE__BUNDLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundled(boolean newBundled) {
		eDynamicSet(SealPackage.ENCRYPTED_FEATURE__BUNDLED, SealPackage.Literals.ENCRYPTED_FEATURE__BUNDLED, newBundled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SealPackage.ENCRYPTED_FEATURE__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SealPackage.ENCRYPTED_FEATURE__FEATURE:
				return getFeature();
			case SealPackage.ENCRYPTED_FEATURE__VALUE:
				return getValue();
			case SealPackage.ENCRYPTED_FEATURE__BUNDLED:
				return isBundled();
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
			case SealPackage.ENCRYPTED_FEATURE__FEATURE:
				setFeature((String)newValue);
				return;
			case SealPackage.ENCRYPTED_FEATURE__VALUE:
				setValue((EncryptedValue)newValue);
				return;
			case SealPackage.ENCRYPTED_FEATURE__BUNDLED:
				setBundled((Boolean)newValue);
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
			case SealPackage.ENCRYPTED_FEATURE__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case SealPackage.ENCRYPTED_FEATURE__VALUE:
				setValue((EncryptedValue)null);
				return;
			case SealPackage.ENCRYPTED_FEATURE__BUNDLED:
				setBundled(BUNDLED_EDEFAULT);
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
			case SealPackage.ENCRYPTED_FEATURE__FEATURE:
				return FEATURE_EDEFAULT == null ? getFeature() != null : !FEATURE_EDEFAULT.equals(getFeature());
			case SealPackage.ENCRYPTED_FEATURE__VALUE:
				return getValue() != null;
			case SealPackage.ENCRYPTED_FEATURE__BUNDLED:
				return isBundled() != BUNDLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EncryptedFeatureImpl
