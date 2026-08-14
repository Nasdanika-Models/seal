/**
 */
package org.nasdanika.models.seal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.iam.AccessControlEntry;
import org.nasdanika.models.iam.IamPackage;

import org.nasdanika.models.seal.EncryptedFeature;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.SealedElement;
import org.nasdanika.models.seal.Signature;
import org.nasdanika.models.seal.VariantFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sealed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.SealedElementImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SealedElementImpl#getEncryptedFeatures <em>Encrypted Features</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SealedElementImpl#getVariantFeatures <em>Variant Features</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SealedElementImpl#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SealedElementImpl extends MinimalEObjectImpl.Container implements SealedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SealedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.SEALED_ELEMENT;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<AccessControlEntry> getAccessControl() {
		return (EList<AccessControlEntry>)eDynamicGet(SealPackage.SEALED_ELEMENT__ACCESS_CONTROL, IamPackage.Literals.ACCESS_CONTROLLED__ACCESS_CONTROL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EncryptedFeature> getEncryptedFeatures() {
		return (EList<EncryptedFeature>)eDynamicGet(SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES, SealPackage.Literals.SEALED_ELEMENT__ENCRYPTED_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<VariantFeature> getVariantFeatures() {
		return (EList<VariantFeature>)eDynamicGet(SealPackage.SEALED_ELEMENT__VARIANT_FEATURES, SealPackage.Literals.SEALED_ELEMENT__VARIANT_FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Signature> getSignatures() {
		return (EList<Signature>)eDynamicGet(SealPackage.SEALED_ELEMENT__SIGNATURES, SealPackage.Literals.SEALED_ELEMENT__SIGNATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SealPackage.SEALED_ELEMENT__ACCESS_CONTROL:
				return ((InternalEList<?>)getAccessControl()).basicRemove(otherEnd, msgs);
			case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES:
				return ((InternalEList<?>)getEncryptedFeatures()).basicRemove(otherEnd, msgs);
			case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES:
				return ((InternalEList<?>)getVariantFeatures()).basicRemove(otherEnd, msgs);
			case SealPackage.SEALED_ELEMENT__SIGNATURES:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
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
			case SealPackage.SEALED_ELEMENT__ACCESS_CONTROL:
				return getAccessControl();
			case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES:
				return getEncryptedFeatures();
			case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES:
				return getVariantFeatures();
			case SealPackage.SEALED_ELEMENT__SIGNATURES:
				return getSignatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SealPackage.SEALED_ELEMENT__ACCESS_CONTROL:
				getAccessControl().clear();
				getAccessControl().addAll((Collection<? extends AccessControlEntry>)newValue);
				return;
			case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				getEncryptedFeatures().addAll((Collection<? extends EncryptedFeature>)newValue);
				return;
			case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES:
				getVariantFeatures().clear();
				getVariantFeatures().addAll((Collection<? extends VariantFeature>)newValue);
				return;
			case SealPackage.SEALED_ELEMENT__SIGNATURES:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
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
			case SealPackage.SEALED_ELEMENT__ACCESS_CONTROL:
				getAccessControl().clear();
				return;
			case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES:
				getEncryptedFeatures().clear();
				return;
			case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES:
				getVariantFeatures().clear();
				return;
			case SealPackage.SEALED_ELEMENT__SIGNATURES:
				getSignatures().clear();
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
			case SealPackage.SEALED_ELEMENT__ACCESS_CONTROL:
				return !getAccessControl().isEmpty();
			case SealPackage.SEALED_ELEMENT__ENCRYPTED_FEATURES:
				return !getEncryptedFeatures().isEmpty();
			case SealPackage.SEALED_ELEMENT__VARIANT_FEATURES:
				return !getVariantFeatures().isEmpty();
			case SealPackage.SEALED_ELEMENT__SIGNATURES:
				return !getSignatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SealedElementImpl
