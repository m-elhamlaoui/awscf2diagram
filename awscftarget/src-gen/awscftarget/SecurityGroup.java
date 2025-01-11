/**
 */
package awscftarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.SecurityGroup#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link awscftarget.SecurityGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link awscftarget.SecurityGroup#getSecurityGroupIngress <em>Security Group Ingress</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getSecurityGroup()
 * @model
 * @generated
 */
public interface SecurityGroup extends Resource {
	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see awscftarget.AwscftargetPackage#getSecurityGroup_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link awscftarget.SecurityGroup#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see awscftarget.AwscftargetPackage#getSecurityGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link awscftarget.SecurityGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Security Group Ingress</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.IngressRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group Ingress</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getSecurityGroup_SecurityGroupIngress()
	 * @model containment="true"
	 * @generated
	 */
	EList<IngressRule> getSecurityGroupIngress();

} // SecurityGroup
