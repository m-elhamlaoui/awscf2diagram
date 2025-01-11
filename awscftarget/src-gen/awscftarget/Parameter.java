/**
 */
package awscftarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link awscftarget.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link awscftarget.Parameter#getDescription <em>Description</em>}</li>
 *   <li>{@link awscftarget.Parameter#getAllowedValues <em>Allowed Values</em>}</li>
 *   <li>{@link awscftarget.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link awscftarget.Parameter#getConstraintDescription <em>Constraint Description</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see awscftarget.AwscftargetPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link awscftarget.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see awscftarget.AwscftargetPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link awscftarget.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see awscftarget.AwscftargetPackage#getParameter_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link awscftarget.Parameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Values</em>' attribute.
	 * @see #setAllowedValues(String)
	 * @see awscftarget.AwscftargetPackage#getParameter_AllowedValues()
	 * @model
	 * @generated
	 */
	String getAllowedValues();

	/**
	 * Sets the value of the '{@link awscftarget.Parameter#getAllowedValues <em>Allowed Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Values</em>' attribute.
	 * @see #getAllowedValues()
	 * @generated
	 */
	void setAllowedValues(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see awscftarget.AwscftargetPackage#getParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link awscftarget.Parameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Constraint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Description</em>' attribute.
	 * @see #setConstraintDescription(String)
	 * @see awscftarget.AwscftargetPackage#getParameter_ConstraintDescription()
	 * @model
	 * @generated
	 */
	String getConstraintDescription();

	/**
	 * Sets the value of the '{@link awscftarget.Parameter#getConstraintDescription <em>Constraint Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Description</em>' attribute.
	 * @see #getConstraintDescription()
	 * @generated
	 */
	void setConstraintDescription(String value);

} // Parameter
