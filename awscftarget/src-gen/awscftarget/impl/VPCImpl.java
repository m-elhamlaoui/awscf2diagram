/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.Subnet;
import awscftarget.VPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.VPCImpl#getCidrBlock <em>Cidr Block</em>}</li>
 *   <li>{@link awscftarget.impl.VPCImpl#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link awscftarget.impl.VPCImpl#getSubnets <em>Subnets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VPCImpl extends ResourceImpl implements VPC {
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
	 * The default value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected String vpcId = VPC_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnet> subnets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.VPC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.VPC__CIDR_BLOCK, oldCidrBlock,
					cidrBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpcId() {
		return vpcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpcId(String newVpcId) {
		String oldVpcId = vpcId;
		vpcId = newVpcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.VPC__VPC_ID, oldVpcId, vpcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subnet> getSubnets() {
		if (subnets == null) {
			subnets = new EObjectContainmentEList<Subnet>(Subnet.class, this, AwscftargetPackage.VPC__SUBNETS);
		}
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwscftargetPackage.VPC__SUBNETS:
			return ((InternalEList<?>) getSubnets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwscftargetPackage.VPC__CIDR_BLOCK:
			return getCidrBlock();
		case AwscftargetPackage.VPC__VPC_ID:
			return getVpcId();
		case AwscftargetPackage.VPC__SUBNETS:
			return getSubnets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwscftargetPackage.VPC__CIDR_BLOCK:
			setCidrBlock((String) newValue);
			return;
		case AwscftargetPackage.VPC__VPC_ID:
			setVpcId((String) newValue);
			return;
		case AwscftargetPackage.VPC__SUBNETS:
			getSubnets().clear();
			getSubnets().addAll((Collection<? extends Subnet>) newValue);
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
		case AwscftargetPackage.VPC__CIDR_BLOCK:
			setCidrBlock(CIDR_BLOCK_EDEFAULT);
			return;
		case AwscftargetPackage.VPC__VPC_ID:
			setVpcId(VPC_ID_EDEFAULT);
			return;
		case AwscftargetPackage.VPC__SUBNETS:
			getSubnets().clear();
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
		case AwscftargetPackage.VPC__CIDR_BLOCK:
			return CIDR_BLOCK_EDEFAULT == null ? cidrBlock != null : !CIDR_BLOCK_EDEFAULT.equals(cidrBlock);
		case AwscftargetPackage.VPC__VPC_ID:
			return VPC_ID_EDEFAULT == null ? vpcId != null : !VPC_ID_EDEFAULT.equals(vpcId);
		case AwscftargetPackage.VPC__SUBNETS:
			return subnets != null && !subnets.isEmpty();
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
		result.append(", VpcId: ");
		result.append(vpcId);
		result.append(')');
		return result.toString();
	}

} //VPCImpl
