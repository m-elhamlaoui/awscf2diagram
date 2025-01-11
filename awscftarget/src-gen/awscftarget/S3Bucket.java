/**
 */
package awscftarget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S3 Bucket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.S3Bucket#getBucketName <em>Bucket Name</em>}</li>
 *   <li>{@link awscftarget.S3Bucket#isVersioningConfiguration <em>Versioning Configuration</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getS3Bucket()
 * @model
 * @generated
 */
public interface S3Bucket extends Resource {
	/**
	 * Returns the value of the '<em><b>Bucket Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Name</em>' attribute.
	 * @see #setBucketName(String)
	 * @see awscftarget.AwscftargetPackage#getS3Bucket_BucketName()
	 * @model
	 * @generated
	 */
	String getBucketName();

	/**
	 * Sets the value of the '{@link awscftarget.S3Bucket#getBucketName <em>Bucket Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Name</em>' attribute.
	 * @see #getBucketName()
	 * @generated
	 */
	void setBucketName(String value);

	/**
	 * Returns the value of the '<em><b>Versioning Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning Configuration</em>' attribute.
	 * @see #setVersioningConfiguration(boolean)
	 * @see awscftarget.AwscftargetPackage#getS3Bucket_VersioningConfiguration()
	 * @model
	 * @generated
	 */
	boolean isVersioningConfiguration();

	/**
	 * Sets the value of the '{@link awscftarget.S3Bucket#isVersioningConfiguration <em>Versioning Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning Configuration</em>' attribute.
	 * @see #isVersioningConfiguration()
	 * @generated
	 */
	void setVersioningConfiguration(boolean value);

} // S3Bucket
