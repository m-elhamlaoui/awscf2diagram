/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.Condition;
import awscftarget.Output;
import awscftarget.Parameter;
import awscftarget.Resource;
import awscftarget.Template;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.TemplateImpl#getAWSTemplateFormatVersion <em>AWS Template Format Version</em>}</li>
 *   <li>{@link awscftarget.impl.TemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link awscftarget.impl.TemplateImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link awscftarget.impl.TemplateImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link awscftarget.impl.TemplateImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link awscftarget.impl.TemplateImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateImpl extends MinimalEObjectImpl.Container implements Template {
	/**
	 * The default value of the '{@link #getAWSTemplateFormatVersion() <em>AWS Template Format Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAWSTemplateFormatVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String AWS_TEMPLATE_FORMAT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAWSTemplateFormatVersion() <em>AWS Template Format Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAWSTemplateFormatVersion()
	 * @generated
	 * @ordered
	 */
	protected String awsTemplateFormatVersion = AWS_TEMPLATE_FORMAT_VERSION_EDEFAULT;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAWSTemplateFormatVersion() {
		return awsTemplateFormatVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAWSTemplateFormatVersion(String newAWSTemplateFormatVersion) {
		String oldAWSTemplateFormatVersion = awsTemplateFormatVersion;
		awsTemplateFormatVersion = newAWSTemplateFormatVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwscftargetPackage.TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION, oldAWSTemplateFormatVersion,
					awsTemplateFormatVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.TEMPLATE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					AwscftargetPackage.TEMPLATE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, AwscftargetPackage.TEMPLATE__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this,
					AwscftargetPackage.TEMPLATE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<Resource>(Resource.class, this,
					AwscftargetPackage.TEMPLATE__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwscftargetPackage.TEMPLATE__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case AwscftargetPackage.TEMPLATE__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case AwscftargetPackage.TEMPLATE__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
		case AwscftargetPackage.TEMPLATE__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
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
		case AwscftargetPackage.TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION:
			return getAWSTemplateFormatVersion();
		case AwscftargetPackage.TEMPLATE__DESCRIPTION:
			return getDescription();
		case AwscftargetPackage.TEMPLATE__PARAMETERS:
			return getParameters();
		case AwscftargetPackage.TEMPLATE__OUTPUTS:
			return getOutputs();
		case AwscftargetPackage.TEMPLATE__CONDITIONS:
			return getConditions();
		case AwscftargetPackage.TEMPLATE__RESOURCES:
			return getResources();
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
		case AwscftargetPackage.TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION:
			setAWSTemplateFormatVersion((String) newValue);
			return;
		case AwscftargetPackage.TEMPLATE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AwscftargetPackage.TEMPLATE__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case AwscftargetPackage.TEMPLATE__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		case AwscftargetPackage.TEMPLATE__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Condition>) newValue);
			return;
		case AwscftargetPackage.TEMPLATE__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends Resource>) newValue);
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
		case AwscftargetPackage.TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION:
			setAWSTemplateFormatVersion(AWS_TEMPLATE_FORMAT_VERSION_EDEFAULT);
			return;
		case AwscftargetPackage.TEMPLATE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AwscftargetPackage.TEMPLATE__PARAMETERS:
			getParameters().clear();
			return;
		case AwscftargetPackage.TEMPLATE__OUTPUTS:
			getOutputs().clear();
			return;
		case AwscftargetPackage.TEMPLATE__CONDITIONS:
			getConditions().clear();
			return;
		case AwscftargetPackage.TEMPLATE__RESOURCES:
			getResources().clear();
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
		case AwscftargetPackage.TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION:
			return AWS_TEMPLATE_FORMAT_VERSION_EDEFAULT == null ? awsTemplateFormatVersion != null
					: !AWS_TEMPLATE_FORMAT_VERSION_EDEFAULT.equals(awsTemplateFormatVersion);
		case AwscftargetPackage.TEMPLATE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AwscftargetPackage.TEMPLATE__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case AwscftargetPackage.TEMPLATE__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case AwscftargetPackage.TEMPLATE__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		case AwscftargetPackage.TEMPLATE__RESOURCES:
			return resources != null && !resources.isEmpty();
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
		result.append(" (AWSTemplateFormatVersion: ");
		result.append(awsTemplateFormatVersion);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TemplateImpl
