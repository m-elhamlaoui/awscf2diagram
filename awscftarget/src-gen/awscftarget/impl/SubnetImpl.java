/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.Subnet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.SubnetImpl#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link awscftarget.impl.SubnetImpl#getSubnetId <em>Subnet Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetImpl extends MinimalEObjectImpl.Container implements Subnet {
	/**
	 * The default value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_BLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidrBlock() <em>Cidr Block</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidrBlock()
	 * @generated
	 * @ordered
	 */
	protected String cidrBlock = CIDR_BLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected String subnetId = SUBNET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.SUBNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidrBlock() {
		return cidrBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidrBlock(String newCidrBlock) {
		String oldCidrBlock = cidrBlock;
		cidrBlock = newCidrBlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.SUBNET__CIDR_BLOCK, oldCidrBlock,
					cidrBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetId() {
		return subnetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetId(String newSubnetId) {
		String oldSubnetId = subnetId;
		subnetId = newSubnetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.SUBNET__SUBNET_ID, oldSubnetId,
					subnetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwscftargetPackage.SUBNET__CIDR_BLOCK:
			return getCidrBlock();
		case AwscftargetPackage.SUBNET__SUBNET_ID:
			return getSubnetId();
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
		case AwscftargetPackage.SUBNET__CIDR_BLOCK:
			setCidrBlock((String) newValue);
			return;
		case AwscftargetPackage.SUBNET__SUBNET_ID:
			setSubnetId((String) newValue);
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
		case AwscftargetPackage.SUBNET__CIDR_BLOCK:
			setCidrBlock(CIDR_BLOCK_EDEFAULT);
			return;
		case AwscftargetPackage.SUBNET__SUBNET_ID:
			setSubnetId(SUBNET_ID_EDEFAULT);
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
		case AwscftargetPackage.SUBNET__CIDR_BLOCK:
			return CIDR_BLOCK_EDEFAULT == null ? cidrBlock != null : !CIDR_BLOCK_EDEFAULT.equals(cidrBlock);
		case AwscftargetPackage.SUBNET__SUBNET_ID:
			return SUBNET_ID_EDEFAULT == null ? subnetId != null : !SUBNET_ID_EDEFAULT.equals(subnetId);
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
		result.append(" (CidrBlock: ");
		result.append(cidrBlock);
		result.append(", SubnetId: ");
		result.append(subnetId);
		result.append(')');
		return result.toString();
	}

} //SubnetImpl
