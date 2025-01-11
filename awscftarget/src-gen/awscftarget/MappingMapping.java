/**
 */
package awscftarget;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.MappingMapping#getKey <em>Key</em>}</li>
 *   <li>{@link awscftarget.MappingMapping#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getMappingMapping()
 * @model
 * @generated
 */
public interface MappingMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see awscftarget.AwscftargetPackage#getMappingMapping_Key()
	 * @model default=""
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link awscftarget.MappingMapping#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link awscftarget.MappingEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see awscftarget.AwscftargetPackage#getMappingMapping_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingEntry> getValue();

} // MappingMapping
