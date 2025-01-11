/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.EC2Instance;
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
 * An implementation of the model object '<em><b>EC2 Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.EC2InstanceImpl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link awscftarget.impl.EC2InstanceImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link awscftarget.impl.EC2InstanceImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link awscftarget.impl.EC2InstanceImpl#getSecurityGroup <em>Security Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EC2InstanceImpl extends ResourceImpl implements EC2Instance {
	/**
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected String instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyName() <em>Key Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected String keyName = KEY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected String imageId = IMAGE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecurityGroup() <em>Security Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securityGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EC2InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.EC2_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(String newInstanceType) {
		String oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.EC2_INSTANCE__INSTANCE_TYPE,
					oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyName(String newKeyName) {
		String oldKeyName = keyName;
		keyName = newKeyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.EC2_INSTANCE__KEY_NAME, oldKeyName,
					keyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageId(String newImageId) {
		String oldImageId = imageId;
		imageId = newImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.EC2_INSTANCE__IMAGE_ID, oldImageId,
					imageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGroup> getSecurityGroup() {
		if (securityGroup == null) {
			securityGroup = new EObjectContainmentEList<SecurityGroup>(SecurityGroup.class, this,
					AwscftargetPackage.EC2_INSTANCE__SECURITY_GROUP);
		}
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwscftargetPackage.EC2_INSTANCE__SECURITY_GROUP:
			return ((InternalEList<?>) getSecurityGroup()).basicRemove(otherEnd, msgs);
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
		case AwscftargetPackage.EC2_INSTANCE__INSTANCE_TYPE:
			return getInstanceType();
		case AwscftargetPackage.EC2_INSTANCE__KEY_NAME:
			return getKeyName();
		case AwscftargetPackage.EC2_INSTANCE__IMAGE_ID:
			return getImageId();
		case AwscftargetPackage.EC2_INSTANCE__SECURITY_GROUP:
			return getSecurityGroup();
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
		case AwscftargetPackage.EC2_INSTANCE__INSTANCE_TYPE:
			setInstanceType((String) newValue);
			return;
		case AwscftargetPackage.EC2_INSTANCE__KEY_NAME:
			setKeyName((String) newValue);
			return;
		case AwscftargetPackage.EC2_INSTANCE__IMAGE_ID:
			setImageId((String) newValue);
			return;
		case AwscftargetPackage.EC2_INSTANCE__SECURITY_GROUP:
			getSecurityGroup().clear();
			getSecurityGroup().addAll((Collection<? extends SecurityGroup>) newValue);
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
		case AwscftargetPackage.EC2_INSTANCE__INSTANCE_TYPE:
			setInstanceType(INSTANCE_TYPE_EDEFAULT);
			return;
		case AwscftargetPackage.EC2_INSTANCE__KEY_NAME:
			setKeyName(KEY_NAME_EDEFAULT);
			return;
		case AwscftargetPackage.EC2_INSTANCE__IMAGE_ID:
			setImageId(IMAGE_ID_EDEFAULT);
			return;
		case AwscftargetPackage.EC2_INSTANCE__SECURITY_GROUP:
			getSecurityGroup().clear();
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
		case AwscftargetPackage.EC2_INSTANCE__INSTANCE_TYPE:
			return INSTANCE_TYPE_EDEFAULT == null ? instanceType != null : !INSTANCE_TYPE_EDEFAULT.equals(instanceType);
		case AwscftargetPackage.EC2_INSTANCE__KEY_NAME:
			return KEY_NAME_EDEFAULT == null ? keyName != null : !KEY_NAME_EDEFAULT.equals(keyName);
		case AwscftargetPackage.EC2_INSTANCE__IMAGE_ID:
			return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
		case AwscftargetPackage.EC2_INSTANCE__SECURITY_GROUP:
			return securityGroup != null && !securityGroup.isEmpty();
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
		result.append(" (InstanceType: ");
		result.append(instanceType);
		result.append(", KeyName: ");
		result.append(keyName);
		result.append(", ImageId: ");
		result.append(imageId);
		result.append(')');
		return result.toString();
	}

} //EC2InstanceImpl
