/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link awscftarget.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link awscftarget.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link awscftarget.impl.ParameterImpl#getAllowedValues <em>Allowed Values</em>}</li>
 *   <li>{@link awscftarget.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link awscftarget.impl.ParameterImpl#getConstraintDescription <em>Constraint Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getAllowedValues() <em>Allowed Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValues()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedValues() <em>Allowed Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValues()
	 * @generated
	 * @ordered
	 */
	protected String allowedValues = ALLOWED_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraintDescription() <em>Constraint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintDescription() <em>Constraint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDescription()
	 * @generated
	 * @ordered
	 */
	protected String constraintDescription = CONSTRAINT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.PARAMETER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.PARAMETER__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedValues() {
		return allowedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedValues(String newAllowedValues) {
		String oldAllowedValues = allowedValues;
		allowedValues = newAllowedValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.PARAMETER__ALLOWED_VALUES,
					oldAllowedValues, allowedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.PARAMETER__DEFAULT_VALUE,
					oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraintDescription() {
		return constraintDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintDescription(String newConstraintDescription) {
		String oldConstraintDescription = constraintDescription;
		constraintDescription = newConstraintDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.PARAMETER__CONSTRAINT_DESCRIPTION,
					oldConstraintDescription, constraintDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwscftargetPackage.PARAMETER__NAME:
			return getName();
		case AwscftargetPackage.PARAMETER__TYPE:
			return getType();
		case AwscftargetPackage.PARAMETER__DESCRIPTION:
			return getDescription();
		case AwscftargetPackage.PARAMETER__ALLOWED_VALUES:
			return getAllowedValues();
		case AwscftargetPackage.PARAMETER__DEFAULT_VALUE:
			return getDefaultValue();
		case AwscftargetPackage.PARAMETER__CONSTRAINT_DESCRIPTION:
			return getConstraintDescription();
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
		case AwscftargetPackage.PARAMETER__NAME:
			setName((String) newValue);
			return;
		case AwscftargetPackage.PARAMETER__TYPE:
			setType((String) newValue);
			return;
		case AwscftargetPackage.PARAMETER__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AwscftargetPackage.PARAMETER__ALLOWED_VALUES:
			setAllowedValues((String) newValue);
			return;
		case AwscftargetPackage.PARAMETER__DEFAULT_VALUE:
			setDefaultValue((String) newValue);
			return;
		case AwscftargetPackage.PARAMETER__CONSTRAINT_DESCRIPTION:
			setConstraintDescription((String) newValue);
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
		case AwscftargetPackage.PARAMETER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AwscftargetPackage.PARAMETER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AwscftargetPackage.PARAMETER__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AwscftargetPackage.PARAMETER__ALLOWED_VALUES:
			setAllowedValues(ALLOWED_VALUES_EDEFAULT);
			return;
		case AwscftargetPackage.PARAMETER__DEFAULT_VALUE:
			setDefaultValue(DEFAULT_VALUE_EDEFAULT);
			return;
		case AwscftargetPackage.PARAMETER__CONSTRAINT_DESCRIPTION:
			setConstraintDescription(CONSTRAINT_DESCRIPTION_EDEFAULT);
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
		case AwscftargetPackage.PARAMETER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AwscftargetPackage.PARAMETER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case AwscftargetPackage.PARAMETER__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AwscftargetPackage.PARAMETER__ALLOWED_VALUES:
			return ALLOWED_VALUES_EDEFAULT == null ? allowedValues != null
					: !ALLOWED_VALUES_EDEFAULT.equals(allowedValues);
		case AwscftargetPackage.PARAMETER__DEFAULT_VALUE:
			return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
		case AwscftargetPackage.PARAMETER__CONSTRAINT_DESCRIPTION:
			return CONSTRAINT_DESCRIPTION_EDEFAULT == null ? constraintDescription != null
					: !CONSTRAINT_DESCRIPTION_EDEFAULT.equals(constraintDescription);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Type: ");
		result.append(type);
		result.append(", Description: ");
		result.append(description);
		result.append(", AllowedValues: ");
		result.append(allowedValues);
		result.append(", DefaultValue: ");
		result.append(defaultValue);
		result.append(", constraintDescription: ");
		result.append(constraintDescription);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
