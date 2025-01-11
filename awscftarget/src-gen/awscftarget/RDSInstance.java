/**
 */
package awscftarget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDS Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.RDSInstance#getDBInstanceClass <em>DB Instance Class</em>}</li>
 *   <li>{@link awscftarget.RDSInstance#getEngine <em>Engine</em>}</li>
 *   <li>{@link awscftarget.RDSInstance#getAllocatedStorage <em>Allocated Storage</em>}</li>
 * </ul>
 *
 * @see awscftarget.AwscftargetPackage#getRDSInstance()
 * @model
 * @generated
 */
public interface RDSInstance extends Resource {
	/**
	 * Returns the value of the '<em><b>DB Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB Instance Class</em>' attribute.
	 * @see #setDBInstanceClass(String)
	 * @see awscftarget.AwscftargetPackage#getRDSInstance_DBInstanceClass()
	 * @model
	 * @generated
	 */
	String getDBInstanceClass();

	/**
	 * Sets the value of the '{@link awscftarget.RDSInstance#getDBInstanceClass <em>DB Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB Instance Class</em>' attribute.
	 * @see #getDBInstanceClass()
	 * @generated
	 */
	void setDBInstanceClass(String value);

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' attribute.
	 * @see #setEngine(String)
	 * @see awscftarget.AwscftargetPackage#getRDSInstance_Engine()
	 * @model
	 * @generated
	 */
	String getEngine();

	/**
	 * Sets the value of the '{@link awscftarget.RDSInstance#getEngine <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' attribute.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(String value);

	/**
	 * Returns the value of the '<em><b>Allocated Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Storage</em>' attribute.
	 * @see #setAllocatedStorage(int)
	 * @see awscftarget.AwscftargetPackage#getRDSInstance_AllocatedStorage()
	 * @model
	 * @generated
	 */
	int getAllocatedStorage();

	/**
	 * Sets the value of the '{@link awscftarget.RDSInstance#getAllocatedStorage <em>Allocated Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Storage</em>' attribute.
	 * @see #getAllocatedStorage()
	 * @generated
	 */
	void setAllocatedStorage(int value);

} // RDSInstance
