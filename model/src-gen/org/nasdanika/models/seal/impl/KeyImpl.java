/**
 */
package org.nasdanika.models.seal.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.nxcore.impl.ModelElementImpl;

import org.nasdanika.models.seal.Key;
import org.nasdanika.models.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.KeyImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.KeyImpl#getFingerprint <em>Fingerprint</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.KeyImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.KeyImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.KeyImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.KeyImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.KeyImpl#isRevoked <em>Revoked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyImpl extends ModelElementImpl implements Key {
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
	 * The default value of the '{@link #getFingerprint() <em>Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerprint()
	 * @generated
	 * @ordered
	 */
	protected static final String FINGERPRINT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRevoked() <em>Revoked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRevoked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVOKED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return (String)eDynamicGet(SealPackage.KEY__ALGORITHM, SealPackage.Literals.KEY__ALGORITHM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		eDynamicSet(SealPackage.KEY__ALGORITHM, SealPackage.Literals.KEY__ALGORITHM, newAlgorithm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFingerprint() {
		return (String)eDynamicGet(SealPackage.KEY__FINGERPRINT, SealPackage.Literals.KEY__FINGERPRINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFingerprint(String newFingerprint) {
		eDynamicSet(SealPackage.KEY__FINGERPRINT, SealPackage.Literals.KEY__FINGERPRINT, newFingerprint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaterial() {
		return (String)eDynamicGet(SealPackage.KEY__MATERIAL, SealPackage.Literals.KEY__MATERIAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaterial(String newMaterial) {
		eDynamicSet(SealPackage.KEY__MATERIAL, SealPackage.Literals.KEY__MATERIAL, newMaterial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(SealPackage.KEY__LOCATION, SealPackage.Literals.KEY__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(SealPackage.KEY__LOCATION, SealPackage.Literals.KEY__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subject getSubject() {
		return (Subject)eDynamicGet(SealPackage.KEY__SUBJECT, SealPackage.Literals.KEY__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject basicGetSubject() {
		return (Subject)eDynamicGet(SealPackage.KEY__SUBJECT, SealPackage.Literals.KEY__SUBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Subject newSubject) {
		eDynamicSet(SealPackage.KEY__SUBJECT, SealPackage.Literals.KEY__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpires() {
		return (Date)eDynamicGet(SealPackage.KEY__EXPIRES, SealPackage.Literals.KEY__EXPIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(Date newExpires) {
		eDynamicSet(SealPackage.KEY__EXPIRES, SealPackage.Literals.KEY__EXPIRES, newExpires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRevoked() {
		return (Boolean)eDynamicGet(SealPackage.KEY__REVOKED, SealPackage.Literals.KEY__REVOKED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevoked(boolean newRevoked) {
		eDynamicSet(SealPackage.KEY__REVOKED, SealPackage.Literals.KEY__REVOKED, newRevoked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SealPackage.KEY__ALGORITHM:
				return getAlgorithm();
			case SealPackage.KEY__FINGERPRINT:
				return getFingerprint();
			case SealPackage.KEY__MATERIAL:
				return getMaterial();
			case SealPackage.KEY__LOCATION:
				return getLocation();
			case SealPackage.KEY__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case SealPackage.KEY__EXPIRES:
				return getExpires();
			case SealPackage.KEY__REVOKED:
				return isRevoked();
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
			case SealPackage.KEY__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case SealPackage.KEY__FINGERPRINT:
				setFingerprint((String)newValue);
				return;
			case SealPackage.KEY__MATERIAL:
				setMaterial((String)newValue);
				return;
			case SealPackage.KEY__LOCATION:
				setLocation((String)newValue);
				return;
			case SealPackage.KEY__SUBJECT:
				setSubject((Subject)newValue);
				return;
			case SealPackage.KEY__EXPIRES:
				setExpires((Date)newValue);
				return;
			case SealPackage.KEY__REVOKED:
				setRevoked((Boolean)newValue);
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
			case SealPackage.KEY__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case SealPackage.KEY__FINGERPRINT:
				setFingerprint(FINGERPRINT_EDEFAULT);
				return;
			case SealPackage.KEY__MATERIAL:
				setMaterial(MATERIAL_EDEFAULT);
				return;
			case SealPackage.KEY__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case SealPackage.KEY__SUBJECT:
				setSubject((Subject)null);
				return;
			case SealPackage.KEY__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case SealPackage.KEY__REVOKED:
				setRevoked(REVOKED_EDEFAULT);
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
			case SealPackage.KEY__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? getAlgorithm() != null : !ALGORITHM_EDEFAULT.equals(getAlgorithm());
			case SealPackage.KEY__FINGERPRINT:
				return FINGERPRINT_EDEFAULT == null ? getFingerprint() != null : !FINGERPRINT_EDEFAULT.equals(getFingerprint());
			case SealPackage.KEY__MATERIAL:
				return MATERIAL_EDEFAULT == null ? getMaterial() != null : !MATERIAL_EDEFAULT.equals(getMaterial());
			case SealPackage.KEY__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case SealPackage.KEY__SUBJECT:
				return basicGetSubject() != null;
			case SealPackage.KEY__EXPIRES:
				return EXPIRES_EDEFAULT == null ? getExpires() != null : !EXPIRES_EDEFAULT.equals(getExpires());
			case SealPackage.KEY__REVOKED:
				return isRevoked() != REVOKED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //KeyImpl
