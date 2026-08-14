/**
 */
package org.nasdanika.models.seal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.Variant;
import org.nasdanika.models.seal.VariantFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.VariantFeatureImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.VariantFeatureImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantFeatureImpl extends ModelElementImpl implements VariantFeature {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.VARIANT_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeature() {
		return (String)eDynamicGet(SealPackage.VARIANT_FEATURE__FEATURE, SealPackage.Literals.VARIANT_FEATURE__FEATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(String newFeature) {
		eDynamicSet(SealPackage.VARIANT_FEATURE__FEATURE, SealPackage.Literals.VARIANT_FEATURE__FEATURE, newFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Variant> getVariants() {
		return (EList<Variant>)eDynamicGet(SealPackage.VARIANT_FEATURE__VARIANTS, SealPackage.Literals.VARIANT_FEATURE__VARIANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SealPackage.VARIANT_FEATURE__VARIANTS:
				return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
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
			case SealPackage.VARIANT_FEATURE__FEATURE:
				return getFeature();
			case SealPackage.VARIANT_FEATURE__VARIANTS:
				return getVariants();
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
			case SealPackage.VARIANT_FEATURE__FEATURE:
				setFeature((String)newValue);
				return;
			case SealPackage.VARIANT_FEATURE__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
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
			case SealPackage.VARIANT_FEATURE__FEATURE:
				setFeature(FEATURE_EDEFAULT);
				return;
			case SealPackage.VARIANT_FEATURE__VARIANTS:
				getVariants().clear();
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
			case SealPackage.VARIANT_FEATURE__FEATURE:
				return FEATURE_EDEFAULT == null ? getFeature() != null : !FEATURE_EDEFAULT.equals(getFeature());
			case SealPackage.VARIANT_FEATURE__VARIANTS:
				return !getVariants().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariantFeatureImpl
