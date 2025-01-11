/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.S3Bucket;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>S3 Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.S3BucketImpl#getBucketName <em>Bucket Name</em>}</li>
 *   <li>{@link awscftarget.impl.S3BucketImpl#isVersioningConfiguration <em>Versioning Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class S3BucketImpl extends ResourceImpl implements S3Bucket {
	/**
	 * The default value of the '{@link #getBucketName() <em>Bucket Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketName() <em>Bucket Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName()
	 * @generated
	 * @ordered
	 */
	protected String bucketName = BUCKET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isVersioningConfiguration() <em>Versioning Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioningConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERSIONING_CONFIGURATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVersioningConfiguration() <em>Versioning Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVersioningConfiguration()
	 * @generated
	 * @ordered
	 */
	protected boolean versioningConfiguration = VERSIONING_CONFIGURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected S3BucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.S3_BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBucketName() {
		return bucketName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBucketName(String newBucketName) {
		String oldBucketName = bucketName;
		bucketName = newBucketName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.S3_BUCKET__BUCKET_NAME,
					oldBucketName, bucketName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVersioningConfiguration() {
		return versioningConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioningConfiguration(boolean newVersioningConfiguration) {
		boolean oldVersioningConfiguration = versioningConfiguration;
		versioningConfiguration = newVersioningConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwscftargetPackage.S3_BUCKET__VERSIONING_CONFIGURATION, oldVersioningConfiguration,
					versioningConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwscftargetPackage.S3_BUCKET__BUCKET_NAME:
			return getBucketName();
		case AwscftargetPackage.S3_BUCKET__VERSIONING_CONFIGURATION:
			return isVersioningConfiguration();
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
		case AwscftargetPackage.S3_BUCKET__BUCKET_NAME:
			setBucketName((String) newValue);
			return;
		case AwscftargetPackage.S3_BUCKET__VERSIONING_CONFIGURATION:
			setVersioningConfiguration((Boolean) newValue);
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
		case AwscftargetPackage.S3_BUCKET__BUCKET_NAME:
			setBucketName(BUCKET_NAME_EDEFAULT);
			return;
		case AwscftargetPackage.S3_BUCKET__VERSIONING_CONFIGURATION:
			setVersioningConfiguration(VERSIONING_CONFIGURATION_EDEFAULT);
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
		case AwscftargetPackage.S3_BUCKET__BUCKET_NAME:
			return BUCKET_NAME_EDEFAULT == null ? bucketName != null : !BUCKET_NAME_EDEFAULT.equals(bucketName);
		case AwscftargetPackage.S3_BUCKET__VERSIONING_CONFIGURATION:
			return versioningConfiguration != VERSIONING_CONFIGURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (BucketName: ");
		result.append(bucketName);
		result.append(", VersioningConfiguration: ");
		result.append(versioningConfiguration);
		result.append(')');
		return result.toString();
	}

} //S3BucketImpl
