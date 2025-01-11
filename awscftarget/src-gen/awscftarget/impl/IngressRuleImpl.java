/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.IngressRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingress Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.IngressRuleImpl#getIpProtocol <em>Ip Protocol</em>}</li>
 *   <li>{@link awscftarget.impl.IngressRuleImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link awscftarget.impl.IngressRuleImpl#getToPort <em>To Port</em>}</li>
 *   <li>{@link awscftarget.impl.IngressRuleImpl#getCidrIp <em>Cidr Ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngressRuleImpl extends MinimalEObjectImpl.Container implements IngressRule {
	/**
	 * The default value of the '{@link #getIpProtocol() <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpProtocol() <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpProtocol()
	 * @generated
	 * @ordered
	 */
	protected String ipProtocol = IP_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected String fromPort = FROM_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected String toPort = TO_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidrIp() <em>Cidr Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrIp()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidrIp() <em>Cidr Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrIp()
	 * @generated
	 * @ordered
	 */
	protected String cidrIp = CIDR_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngressRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.INGRESS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpProtocol() {
		return ipProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpProtocol(String newIpProtocol) {
		String oldIpProtocol = ipProtocol;
		ipProtocol = newIpProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.INGRESS_RULE__IP_PROTOCOL,
					oldIpProtocol, ipProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPort(String newFromPort) {
		String oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.INGRESS_RULE__FROM_PORT,
					oldFromPort, fromPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPort(String newToPort) {
		String oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.INGRESS_RULE__TO_PORT, oldToPort,
					toPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidrIp() {
		return cidrIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidrIp(String newCidrIp) {
		String oldCidrIp = cidrIp;
		cidrIp = newCidrIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.INGRESS_RULE__CIDR_IP, oldCidrIp,
					cidrIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwscftargetPackage.INGRESS_RULE__IP_PROTOCOL:
			return getIpProtocol();
		case AwscftargetPackage.INGRESS_RULE__FROM_PORT:
			return getFromPort();
		case AwscftargetPackage.INGRESS_RULE__TO_PORT:
			return getToPort();
		case AwscftargetPackage.INGRESS_RULE__CIDR_IP:
			return getCidrIp();
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
		case AwscftargetPackage.INGRESS_RULE__IP_PROTOCOL:
			setIpProtocol((String) newValue);
			return;
		case AwscftargetPackage.INGRESS_RULE__FROM_PORT:
			setFromPort((String) newValue);
			return;
		case AwscftargetPackage.INGRESS_RULE__TO_PORT:
			setToPort((String) newValue);
			return;
		case AwscftargetPackage.INGRESS_RULE__CIDR_IP:
			setCidrIp((String) newValue);
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
		case AwscftargetPackage.INGRESS_RULE__IP_PROTOCOL:
			setIpProtocol(IP_PROTOCOL_EDEFAULT);
			return;
		case AwscftargetPackage.INGRESS_RULE__FROM_PORT:
			setFromPort(FROM_PORT_EDEFAULT);
			return;
		case AwscftargetPackage.INGRESS_RULE__TO_PORT:
			setToPort(TO_PORT_EDEFAULT);
			return;
		case AwscftargetPackage.INGRESS_RULE__CIDR_IP:
			setCidrIp(CIDR_IP_EDEFAULT);
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
		case AwscftargetPackage.INGRESS_RULE__IP_PROTOCOL:
			return IP_PROTOCOL_EDEFAULT == null ? ipProtocol != null : !IP_PROTOCOL_EDEFAULT.equals(ipProtocol);
		case AwscftargetPackage.INGRESS_RULE__FROM_PORT:
			return FROM_PORT_EDEFAULT == null ? fromPort != null : !FROM_PORT_EDEFAULT.equals(fromPort);
		case AwscftargetPackage.INGRESS_RULE__TO_PORT:
			return TO_PORT_EDEFAULT == null ? toPort != null : !TO_PORT_EDEFAULT.equals(toPort);
		case AwscftargetPackage.INGRESS_RULE__CIDR_IP:
			return CIDR_IP_EDEFAULT == null ? cidrIp != null : !CIDR_IP_EDEFAULT.equals(cidrIp);
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
		result.append(" (IpProtocol: ");
		result.append(ipProtocol);
		result.append(", FromPort: ");
		result.append(fromPort);
		result.append(", ToPort: ");
		result.append(toPort);
		result.append(", CidrIp: ");
		result.append(cidrIp);
		result.append(')');
		return result.toString();
	}

} //IngressRuleImpl
