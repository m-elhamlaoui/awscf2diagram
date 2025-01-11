/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.IngressRule;
import awscftarget.SecurityGroup;

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
 * An implementation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.SecurityGroupImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link awscftarget.impl.SecurityGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link awscftarget.impl.SecurityGroupImpl#getSecurityGroupIngress <em>Security Group Ingress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityGroupImpl extends ResourceImpl implements SecurityGroup {
	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurityGroupIngress() <em>Security Group Ingress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupIngress()
	 * @generated
	 * @ordered
	 */
	protected EList<IngressRule> securityGroupIngress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.SECURITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.SECURITY_GROUP__GROUP_NAME,
					oldGroupName, groupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.SECURITY_GROUP__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IngressRule> getSecurityGroupIngress() {
		if (securityGroupIngress == null) {
			securityGroupIngress = new EObjectContainmentEList<IngressRule>(IngressRule.class, this,
					AwscftargetPackage.SECURITY_GROUP__SECURITY_GROUP_INGRESS);
		}
		return securityGroupIngress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwscftargetPackage.SECURITY_GROUP__SECURITY_GROUP_INGRESS:
			return ((InternalEList<?>) getSecurityGroupIngress()).basicRemove(otherEnd, msgs);
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
		case AwscftargetPackage.SECURITY_GROUP__GROUP_NAME:
			return getGroupName();
		case AwscftargetPackage.SECURITY_GROUP__DESCRIPTION:
			return getDescription();
		case AwscftargetPackage.SECURITY_GROUP__SECURITY_GROUP_INGRESS:
			return getSecurityGroupIngress();
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
		case AwscftargetPackage.SECURITY_GROUP__GROUP_NAME:
			setGroupName((String) newValue);
			return;
		case AwscftargetPackage.SECURITY_GROUP__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AwscftargetPackage.SECURITY_GROUP__SECURITY_GROUP_INGRESS:
			getSecurityGroupIngress().clear();
			getSecurityGroupIngress().addAll((Collection<? extends IngressRule>) newValue);
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
		case AwscftargetPackage.SECURITY_GROUP__GROUP_NAME:
			setGroupName(GROUP_NAME_EDEFAULT);
			return;
		case AwscftargetPackage.SECURITY_GROUP__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AwscftargetPackage.SECURITY_GROUP__SECURITY_GROUP_INGRESS:
			getSecurityGroupIngress().clear();
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
		case AwscftargetPackage.SECURITY_GROUP__GROUP_NAME:
			return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
		case AwscftargetPackage.SECURITY_GROUP__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AwscftargetPackage.SECURITY_GROUP__SECURITY_GROUP_INGRESS:
			return securityGroupIngress != null && !securityGroupIngress.isEmpty();
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
		result.append(" (GroupName: ");
		result.append(groupName);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SecurityGroupImpl
