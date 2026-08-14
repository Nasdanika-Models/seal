/**
 */
package org.nasdanika.models.seal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.seal.EncryptedValue;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.Signature;
import org.nasdanika.models.seal.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.VariantImpl#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.VariantImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.VariantImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.VariantImpl#getEncrypted <em>Encrypted</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.VariantImpl#getSignatures <em>Signatures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantImpl extends ModelElementImpl implements Variant {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

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
	protected VariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.VARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subject> getSubjects() {
		return (EList<Subject>)eDynamicGet(SealPackage.VARIANT__SUBJECTS, SealPackage.Literals.VARIANT__SUBJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return (String)eDynamicGet(SealPackage.VARIANT__CONDITION, SealPackage.Literals.VARIANT__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		eDynamicSet(SealPackage.VARIANT__CONDITION, SealPackage.Literals.VARIANT__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(SealPackage.VARIANT__VALUE, SealPackage.Literals.VARIANT__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(SealPackage.VARIANT__VALUE, SealPackage.Literals.VARIANT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedValue getEncrypted() {
		return (EncryptedValue)eDynamicGet(SealPackage.VARIANT__ENCRYPTED, SealPackage.Literals.VARIANT__ENCRYPTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncrypted(EncryptedValue newEncrypted, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEncrypted, SealPackage.VARIANT__ENCRYPTED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncrypted(EncryptedValue newEncrypted) {
		eDynamicSet(SealPackage.VARIANT__ENCRYPTED, SealPackage.Literals.VARIANT__ENCRYPTED, newEncrypted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Signature> getSignatures() {
		return (EList<Signature>)eDynamicGet(SealPackage.VARIANT__SIGNATURES, SealPackage.Literals.VARIANT__SIGNATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SealPackage.VARIANT__ENCRYPTED:
				return basicSetEncrypted(null, msgs);
			case SealPackage.VARIANT__SIGNATURES:
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
			case SealPackage.VARIANT__SUBJECTS:
				return getSubjects();
			case SealPackage.VARIANT__CONDITION:
				return getCondition();
			case SealPackage.VARIANT__VALUE:
				return getValue();
			case SealPackage.VARIANT__ENCRYPTED:
				return getEncrypted();
			case SealPackage.VARIANT__SIGNATURES:
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
			case SealPackage.VARIANT__SUBJECTS:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Subject>)newValue);
				return;
			case SealPackage.VARIANT__CONDITION:
				setCondition((String)newValue);
				return;
			case SealPackage.VARIANT__VALUE:
				setValue((String)newValue);
				return;
			case SealPackage.VARIANT__ENCRYPTED:
				setEncrypted((EncryptedValue)newValue);
				return;
			case SealPackage.VARIANT__SIGNATURES:
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
			case SealPackage.VARIANT__SUBJECTS:
				getSubjects().clear();
				return;
			case SealPackage.VARIANT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case SealPackage.VARIANT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SealPackage.VARIANT__ENCRYPTED:
				setEncrypted((EncryptedValue)null);
				return;
			case SealPackage.VARIANT__SIGNATURES:
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
			case SealPackage.VARIANT__SUBJECTS:
				return !getSubjects().isEmpty();
			case SealPackage.VARIANT__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
			case SealPackage.VARIANT__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case SealPackage.VARIANT__ENCRYPTED:
				return getEncrypted() != null;
			case SealPackage.VARIANT__SIGNATURES:
				return !getSignatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariantImpl
