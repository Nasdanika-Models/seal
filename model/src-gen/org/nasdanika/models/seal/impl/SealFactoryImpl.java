/**
 */
package org.nasdanika.models.seal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.seal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SealFactoryImpl extends EFactoryImpl implements SealFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SealFactory init() {
		try {
			SealFactory theSealFactory = (SealFactory)EPackage.Registry.INSTANCE.getEFactory(SealPackage.eNS_URI);
			if (theSealFactory != null) {
				return theSealFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SealFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SealFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SealPackage.KEY: return createKey();
			case SealPackage.KEYRING: return createKeyring();
			case SealPackage.WRAPPED_KEY: return createWrappedKey();
			case SealPackage.ENCRYPTED_VALUE: return createEncryptedValue();
			case SealPackage.ENCRYPTED_FEATURE: return createEncryptedFeature();
			case SealPackage.VARIANT_FEATURE: return createVariantFeature();
			case SealPackage.VARIANT: return createVariant();
			case SealPackage.AUTHOR: return createAuthor();
			case SealPackage.SIGNATURE: return createSignature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Key createKey() {
		KeyImpl key = new KeyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Keyring createKeyring() {
		KeyringImpl keyring = new KeyringImpl();
		return keyring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WrappedKey createWrappedKey() {
		WrappedKeyImpl wrappedKey = new WrappedKeyImpl();
		return wrappedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedValue createEncryptedValue() {
		EncryptedValueImpl encryptedValue = new EncryptedValueImpl();
		return encryptedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncryptedFeature createEncryptedFeature() {
		EncryptedFeatureImpl encryptedFeature = new EncryptedFeatureImpl();
		return encryptedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariantFeature createVariantFeature() {
		VariantFeatureImpl variantFeature = new VariantFeatureImpl();
		return variantFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variant createVariant() {
		VariantImpl variant = new VariantImpl();
		return variant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SealPackage getSealPackage() {
		return (SealPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SealPackage getPackage() {
		return SealPackage.eINSTANCE;
	}

} //SealFactoryImpl
