/**
 */
package awscftarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingress Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.IngressRule#getIpProtocol <em>Ip Protocol</em>}</li>
 *   <li>{@link awscftarget.IngressRule#getFromPort <em>From Port</em>}</li>
 *   <li>{@link awscftarget.IngressRule#getToPort <em>To Port</em>}</li>
 *   <li>{@link awscftarget.IngressRule#getCidrIp <em>Cidr Ip</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getIngressRule()
 * @model
 * @generated
 */
public interface IngressRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Protocol</em>' attribute.
	 * @see #setIpProtocol(String)
	 * @see awscftarget.AwscftargetPackage#getIngressRule_IpProtocol()
	 * @model
	 * @generated
	 */
	String getIpProtocol();

	/**
	 * Sets the value of the '{@link awscftarget.IngressRule#getIpProtocol <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Protocol</em>' attribute.
	 * @see #getIpProtocol()
	 * @generated
	 */
	void setIpProtocol(String value);

	/**
	 * Returns the value of the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port</em>' attribute.
	 * @see #setFromPort(String)
	 * @see awscftarget.AwscftargetPackage#getIngressRule_FromPort()
	 * @model
	 * @generated
	 */
	String getFromPort();

	/**
	 * Sets the value of the '{@link awscftarget.IngressRule#getFromPort <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' attribute.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(String value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port</em>' attribute.
	 * @see #setToPort(String)
	 * @see awscftarget.AwscftargetPackage#getIngressRule_ToPort()
	 * @model
	 * @generated
	 */
	String getToPort();

	/**
	 * Sets the value of the '{@link awscftarget.IngressRule#getToPort <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' attribute.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(String value);

	/**
	 * Returns the value of the '<em><b>Cidr Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Ip</em>' attribute.
	 * @see #setCidrIp(String)
	 * @see awscftarget.AwscftargetPackage#getIngressRule_CidrIp()
	 * @model
	 * @generated
	 */
	String getCidrIp();

	/**
	 * Sets the value of the '{@link awscftarget.IngressRule#getCidrIp <em>Cidr Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Ip</em>' attribute.
	 * @see #getCidrIp()
	 * @generated
	 */
	void setCidrIp(String value);

} // IngressRule
