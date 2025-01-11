/**
 */
package awscftarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.Subnet#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link awscftarget.Subnet#getSubnetId <em>Subnet Id</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getSubnet()
 * @model
 * @generated
 */
public interface Subnet extends EObject {
	/**
	 * Returns the value of the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Block</em>' attribute.
	 * @see #setCidrBlock(String)
	 * @see awscftarget.AwscftargetPackage#getSubnet_CidrBlock()
	 * @model
	 * @generated
	 */
	String getCidrBlock();

	/**
	 * Sets the value of the '{@link awscftarget.Subnet#getCidrBlock <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Block</em>' attribute.
	 * @see #getCidrBlock()
	 * @generated
	 */
	void setCidrBlock(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Id</em>' attribute.
	 * @see #setSubnetId(String)
	 * @see awscftarget.AwscftargetPackage#getSubnet_SubnetId()
	 * @model
	 * @generated
	 */
	String getSubnetId();

	/**
	 * Sets the value of the '{@link awscftarget.Subnet#getSubnetId <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Id</em>' attribute.
	 * @see #getSubnetId()
	 * @generated
	 */
	void setSubnetId(String value);

} // Subnet
