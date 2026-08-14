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

import org.nasdanika.models.seal.EncryptedValue;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.WrappedKey;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encrypted Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.EncryptedValueImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.EncryptedValueImpl#getCiphertext <em>Ciphertext</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.EncryptedValueImpl#getRecipients <em>Recipients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncryptedValueImpl extends ModelElementImpl implements EncryptedValue {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCiphertext() <em>Ciphertext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiphertext()
	 * @generated
	 * @ordered
	 */
	protected static final String CIPHERTEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncryptedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.ENCRYPTED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return (String)eDynamicGet(SealPackage.ENCRYPTED_VALUE__ALGORITHM, SealPackage.Literals.ENCRYPTED_VALUE__ALGORITHM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		eDynamicSet(SealPackage.ENCRYPTED_VALUE__ALGORITHM, SealPackage.Literals.ENCRYPTED_VALUE__ALGORITHM, newAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCiphertext() {
		return (String)eDynamicGet(SealPackage.ENCRYPTED_VALUE__CIPHERTEXT, SealPackage.Literals.ENCRYPTED_VALUE__CIPHERTEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiphertext(String newCiphertext) {
		eDynamicSet(SealPackage.ENCRYPTED_VALUE__CIPHERTEXT, SealPackage.Literals.ENCRYPTED_VALUE__CIPHERTEXT, newCiphertext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WrappedKey> getRecipients() {
		return (EList<WrappedKey>)eDynamicGet(SealPackage.ENCRYPTED_VALUE__RECIPIENTS, SealPackage.Literals.ENCRYPTED_VALUE__RECIPIENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SealPackage.ENCRYPTED_VALUE__RECIPIENTS:
				return ((InternalEList<?>)getRecipients()).basicRemove(otherEnd, msgs);
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
			case SealPackage.ENCRYPTED_VALUE__ALGORITHM:
				return getAlgorithm();
			case SealPackage.ENCRYPTED_VALUE__CIPHERTEXT:
				return getCiphertext();
			case SealPackage.ENCRYPTED_VALUE__RECIPIENTS:
				return getRecipients();
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
			case SealPackage.ENCRYPTED_VALUE__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case SealPackage.ENCRYPTED_VALUE__CIPHERTEXT:
				setCiphertext((String)newValue);
				return;
			case SealPackage.ENCRYPTED_VALUE__RECIPIENTS:
				getRecipients().clear();
				getRecipients().addAll((Collection<? extends WrappedKey>)newValue);
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
			case SealPackage.ENCRYPTED_VALUE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case SealPackage.ENCRYPTED_VALUE__CIPHERTEXT:
				setCiphertext(CIPHERTEXT_EDEFAULT);
				return;
			case SealPackage.ENCRYPTED_VALUE__RECIPIENTS:
				getRecipients().clear();
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
			case SealPackage.ENCRYPTED_VALUE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? getAlgorithm() != null : !ALGORITHM_EDEFAULT.equals(getAlgorithm());
			case SealPackage.ENCRYPTED_VALUE__CIPHERTEXT:
				return CIPHERTEXT_EDEFAULT == null ? getCiphertext() != null : !CIPHERTEXT_EDEFAULT.equals(getCiphertext());
			case SealPackage.ENCRYPTED_VALUE__RECIPIENTS:
				return !getRecipients().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EncryptedValueImpl
