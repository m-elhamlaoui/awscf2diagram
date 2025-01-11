/**
 */
package awscftarget;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.Template#getAWSTemplateFormatVersion <em>AWS Template Format Version</em>}</li>
 *   <li>{@link awscftarget.Template#getDescription <em>Description</em>}</li>
 *   <li>{@link awscftarget.Template#getParameters <em>Parameters</em>}</li>
 *   <li>{@link awscftarget.Template#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link awscftarget.Template#getConditions <em>Conditions</em>}</li>
 *   <li>{@link awscftarget.Template#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject {
	/**
	 * Returns the value of the '<em><b>AWS Template Format Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AWS Template Format Version</em>' attribute.
	 * @see #setAWSTemplateFormatVersion(String)
	 * @see awscftarget.AwscftargetPackage#getTemplate_AWSTemplateFormatVersion()
	 * @model
	 * @generated
	 */
	String getAWSTemplateFormatVersion();

	/**
	 * Sets the value of the '{@link awscftarget.Template#getAWSTemplateFormatVersion <em>AWS Template Format Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AWS Template Format Version</em>' attribute.
	 * @see #getAWSTemplateFormatVersion()
	 * @generated
	 */
	void setAWSTemplateFormatVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see awscftarget.AwscftargetPackage#getTemplate_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link awscftarget.Template#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getTemplate_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getTemplate_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getTemplate_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getTemplate_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // Template
