/**
 */
package awscftarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.VPC#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link awscftarget.VPC#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link awscftarget.VPC#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getVPC()
 * @model
 * @generated
 */
public interface VPC extends Resource {
	/**
	 * Returns the value of the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Block</em>' attribute.
	 * @see #setCidrBlock(String)
	 * @see awscftarget.AwscftargetPackage#getVPC_CidrBlock()
	 * @model
	 * @generated
	 */
	String getCidrBlock();

	/**
	 * Sets the value of the '{@link awscftarget.VPC#getCidrBlock <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Block</em>' attribute.
	 * @see #getCidrBlock()
	 * @generated
	 */
	void setCidrBlock(String value);

	/**
	 * Returns the value of the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc Id</em>' attribute.
	 * @see #setVpcId(String)
	 * @see awscftarget.AwscftargetPackage#getVPC_VpcId()
	 * @model
	 * @generated
	 */
	String getVpcId();

	/**
	 * Sets the value of the '{@link awscftarget.VPC#getVpcId <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc Id</em>' attribute.
	 * @see #getVpcId()
	 * @generated
	 */
	void setVpcId(String value);

	/**
	 * Returns the value of the '<em><b>Subnets</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.Subnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnets</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getVPC_Subnets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subnet> getSubnets();

} // VPC
