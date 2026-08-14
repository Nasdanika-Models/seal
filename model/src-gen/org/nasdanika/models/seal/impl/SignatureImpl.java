/**
 */
package org.nasdanika.models.seal.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.seal.Author;
import org.nasdanika.models.seal.Key;
import org.nasdanika.models.seal.SealPackage;
import org.nasdanika.models.seal.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getCanonicalization <em>Canonicalization</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.SignatureImpl#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends ModelElementImpl implements Signature {
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
	 * The default value of the '{@link #getCanonicalization() <em>Canonicalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalization()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICALIZATION_EDEFAULT = null;

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
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return (String)eDynamicGet(SealPackage.SIGNATURE__ALGORITHM, SealPackage.Literals.SIGNATURE__ALGORITHM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		eDynamicSet(SealPackage.SIGNATURE__ALGORITHM, SealPackage.Literals.SIGNATURE__ALGORITHM, newAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCanonicalization() {
		return (String)eDynamicGet(SealPackage.SIGNATURE__CANONICALIZATION, SealPackage.Literals.SIGNATURE__CANONICALIZATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanonicalization(String newCanonicalization) {
		eDynamicSet(SealPackage.SIGNATURE__CANONICALIZATION, SealPackage.Literals.SIGNATURE__CANONICALIZATION, newCanonicalization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(SealPackage.SIGNATURE__VALUE, SealPackage.Literals.SIGNATURE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(SealPackage.SIGNATURE__VALUE, SealPackage.Literals.SIGNATURE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return (Date)eDynamicGet(SealPackage.SIGNATURE__TIMESTAMP, SealPackage.Literals.SIGNATURE__TIMESTAMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		eDynamicSet(SealPackage.SIGNATURE__TIMESTAMP, SealPackage.Literals.SIGNATURE__TIMESTAMP, newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key getKey() {
		return (Key)eDynamicGet(SealPackage.SIGNATURE__KEY, SealPackage.Literals.SIGNATURE__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetKey() {
		return (Key)eDynamicGet(SealPackage.SIGNATURE__KEY, SealPackage.Literals.SIGNATURE__KEY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(Key newKey) {
		eDynamicSet(SealPackage.SIGNATURE__KEY, SealPackage.Literals.SIGNATURE__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getFeatures() {
		return (EList<String>)eDynamicGet(SealPackage.SIGNATURE__FEATURES, SealPackage.Literals.SIGNATURE__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(SealPackage.SIGNATURE__COMMENT, SealPackage.Literals.SIGNATURE__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(SealPackage.SIGNATURE__COMMENT, SealPackage.Literals.SIGNATURE__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Author> getAuthors() {
		return (EList<Author>)eDynamicGet(SealPackage.SIGNATURE__AUTHORS, SealPackage.Literals.SIGNATURE__AUTHORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SealPackage.SIGNATURE__AUTHORS:
				return ((InternalEList<?>)getAuthors()).basicRemove(otherEnd, msgs);
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
			case SealPackage.SIGNATURE__ALGORITHM:
				return getAlgorithm();
			case SealPackage.SIGNATURE__CANONICALIZATION:
				return getCanonicalization();
			case SealPackage.SIGNATURE__VALUE:
				return getValue();
			case SealPackage.SIGNATURE__TIMESTAMP:
				return getTimestamp();
			case SealPackage.SIGNATURE__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case SealPackage.SIGNATURE__FEATURES:
				return getFeatures();
			case SealPackage.SIGNATURE__COMMENT:
				return getComment();
			case SealPackage.SIGNATURE__AUTHORS:
				return getAuthors();
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
			case SealPackage.SIGNATURE__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case SealPackage.SIGNATURE__CANONICALIZATION:
				setCanonicalization((String)newValue);
				return;
			case SealPackage.SIGNATURE__VALUE:
				setValue((String)newValue);
				return;
			case SealPackage.SIGNATURE__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case SealPackage.SIGNATURE__KEY:
				setKey((Key)newValue);
				return;
			case SealPackage.SIGNATURE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends String>)newValue);
				return;
			case SealPackage.SIGNATURE__COMMENT:
				setComment((String)newValue);
				return;
			case SealPackage.SIGNATURE__AUTHORS:
				getAuthors().clear();
				getAuthors().addAll((Collection<? extends Author>)newValue);
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
			case SealPackage.SIGNATURE__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case SealPackage.SIGNATURE__CANONICALIZATION:
				setCanonicalization(CANONICALIZATION_EDEFAULT);
				return;
			case SealPackage.SIGNATURE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SealPackage.SIGNATURE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case SealPackage.SIGNATURE__KEY:
				setKey((Key)null);
				return;
			case SealPackage.SIGNATURE__FEATURES:
				getFeatures().clear();
				return;
			case SealPackage.SIGNATURE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case SealPackage.SIGNATURE__AUTHORS:
				getAuthors().clear();
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
			case SealPackage.SIGNATURE__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? getAlgorithm() != null : !ALGORITHM_EDEFAULT.equals(getAlgorithm());
			case SealPackage.SIGNATURE__CANONICALIZATION:
				return CANONICALIZATION_EDEFAULT == null ? getCanonicalization() != null : !CANONICALIZATION_EDEFAULT.equals(getCanonicalization());
			case SealPackage.SIGNATURE__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
			case SealPackage.SIGNATURE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? getTimestamp() != null : !TIMESTAMP_EDEFAULT.equals(getTimestamp());
			case SealPackage.SIGNATURE__KEY:
				return basicGetKey() != null;
			case SealPackage.SIGNATURE__FEATURES:
				return !getFeatures().isEmpty();
			case SealPackage.SIGNATURE__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case SealPackage.SIGNATURE__AUTHORS:
				return !getAuthors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
