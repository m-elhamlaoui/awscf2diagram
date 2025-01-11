/**
 */
package awscftarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EC2 Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.EC2Instance#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link awscftarget.EC2Instance#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link awscftarget.EC2Instance#getImageId <em>Image Id</em>}</li>
 *   <li>{@link awscftarget.EC2Instance#getSecurityGroup <em>Security Group</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getEC2Instance()
 * @model
 * @generated
 */
public interface EC2Instance extends Resource {
	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see awscftarget.AwscftargetPackage#getEC2Instance_InstanceType()
	 * @model
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link awscftarget.EC2Instance#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Name</em>' attribute.
	 * @see #setKeyName(String)
	 * @see awscftarget.AwscftargetPackage#getEC2Instance_KeyName()
	 * @model
	 * @generated
	 */
	String getKeyName();

	/**
	 * Sets the value of the '{@link awscftarget.EC2Instance#getKeyName <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Name</em>' attribute.
	 * @see #getKeyName()
	 * @generated
	 */
	void setKeyName(String value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see awscftarget.AwscftargetPackage#getEC2Instance_ImageId()
	 * @model
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link awscftarget.EC2Instance#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getEC2Instance_SecurityGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGroup> getSecurityGroup();

} // EC2Instance
