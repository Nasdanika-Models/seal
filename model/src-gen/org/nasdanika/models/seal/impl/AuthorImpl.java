/**
 */
package org.nasdanika.models.seal.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.iam.Subject;

import org.nasdanika.models.seal.Author;
import org.nasdanika.models.seal.SealPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.seal.impl.AuthorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.AuthorImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.nasdanika.models.seal.impl.AuthorImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorImpl extends MinimalEObjectImpl.Container implements Author {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SealPackage.Literals.AUTHOR;
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
	public String getName() {
		return (String)eDynamicGet(SealPackage.AUTHOR__NAME, SealPackage.Literals.AUTHOR__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(SealPackage.AUTHOR__NAME, SealPackage.Literals.AUTHOR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentity() {
		return (String)eDynamicGet(SealPackage.AUTHOR__IDENTITY, SealPackage.Literals.AUTHOR__IDENTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentity(String newIdentity) {
		eDynamicSet(SealPackage.AUTHOR__IDENTITY, SealPackage.Literals.AUTHOR__IDENTITY, newIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subject getSubject() {
		return (Subject)eDynamicGet(SealPackage.AUTHOR__SUBJECT, SealPackage.Literals.AUTHOR__SUBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject basicGetSubject() {
		return (Subject)eDynamicGet(SealPackage.AUTHOR__SUBJECT, SealPackage.Literals.AUTHOR__SUBJECT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Subject newSubject) {
		eDynamicSet(SealPackage.AUTHOR__SUBJECT, SealPackage.Literals.AUTHOR__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SealPackage.AUTHOR__NAME:
				return getName();
			case SealPackage.AUTHOR__IDENTITY:
				return getIdentity();
			case SealPackage.AUTHOR__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
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
			case SealPackage.AUTHOR__NAME:
				setName((String)newValue);
				return;
			case SealPackage.AUTHOR__IDENTITY:
				setIdentity((String)newValue);
				return;
			case SealPackage.AUTHOR__SUBJECT:
				setSubject((Subject)newValue);
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
			case SealPackage.AUTHOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SealPackage.AUTHOR__IDENTITY:
				setIdentity(IDENTITY_EDEFAULT);
				return;
			case SealPackage.AUTHOR__SUBJECT:
				setSubject((Subject)null);
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
			case SealPackage.AUTHOR__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SealPackage.AUTHOR__IDENTITY:
				return IDENTITY_EDEFAULT == null ? getIdentity() != null : !IDENTITY_EDEFAULT.equals(getIdentity());
			case SealPackage.AUTHOR__SUBJECT:
				return basicGetSubject() != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthorImpl
