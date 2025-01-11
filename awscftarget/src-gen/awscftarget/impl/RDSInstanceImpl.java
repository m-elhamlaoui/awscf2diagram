/**
 */
package awscftarget.impl;

import awscftarget.AwscftargetPackage;
import awscftarget.RDSInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDS Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awscftarget.impl.RDSInstanceImpl#getDBInstanceClass <em>DB Instance Class</em>}</li>
 *   <li>{@link awscftarget.impl.RDSInstanceImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link awscftarget.impl.RDSInstanceImpl#getAllocatedStorage <em>Allocated Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDSInstanceImpl extends ResourceImpl implements RDSInstance {
	/**
	 * The default value of the '{@link #getDBInstanceClass() <em>DB Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_INSTANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDBInstanceClass() <em>DB Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected String dbInstanceClass = DB_INSTANCE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected String engine = ENGINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocatedStorage() <em>Allocated Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int ALLOCATED_STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAllocatedStorage() <em>Allocated Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedStorage()
	 * @generated
	 * @ordered
	 */
	protected int allocatedStorage = ALLOCATED_STORAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDSInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwscftargetPackage.Literals.RDS_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDBInstanceClass() {
		return dbInstanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDBInstanceClass(String newDBInstanceClass) {
		String oldDBInstanceClass = dbInstanceClass;
		dbInstanceClass = newDBInstanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.RDS_INSTANCE__DB_INSTANCE_CLASS,
					oldDBInstanceClass, dbInstanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(String newEngine) {
		String oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.RDS_INSTANCE__ENGINE, oldEngine,
					engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAllocatedStorage() {
		return allocatedStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedStorage(int newAllocatedStorage) {
		int oldAllocatedStorage = allocatedStorage;
		allocatedStorage = newAllocatedStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwscftargetPackage.RDS_INSTANCE__ALLOCATED_STORAGE,
					oldAllocatedStorage, allocatedStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwscftargetPackage.RDS_INSTANCE__DB_INSTANCE_CLASS:
			return getDBInstanceClass();
		case AwscftargetPackage.RDS_INSTANCE__ENGINE:
			return getEngine();
		case AwscftargetPackage.RDS_INSTANCE__ALLOCATED_STORAGE:
			return getAllocatedStorage();
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
		case AwscftargetPackage.RDS_INSTANCE__DB_INSTANCE_CLASS:
			setDBInstanceClass((String) newValue);
			return;
		case AwscftargetPackage.RDS_INSTANCE__ENGINE:
			setEngine((String) newValue);
			return;
		case AwscftargetPackage.RDS_INSTANCE__ALLOCATED_STORAGE:
			setAllocatedStorage((Integer) newValue);
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
		case AwscftargetPackage.RDS_INSTANCE__DB_INSTANCE_CLASS:
			setDBInstanceClass(DB_INSTANCE_CLASS_EDEFAULT);
			return;
		case AwscftargetPackage.RDS_INSTANCE__ENGINE:
			setEngine(ENGINE_EDEFAULT);
			return;
		case AwscftargetPackage.RDS_INSTANCE__ALLOCATED_STORAGE:
			setAllocatedStorage(ALLOCATED_STORAGE_EDEFAULT);
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
		case AwscftargetPackage.RDS_INSTANCE__DB_INSTANCE_CLASS:
			return DB_INSTANCE_CLASS_EDEFAULT == null ? dbInstanceClass != null
					: !DB_INSTANCE_CLASS_EDEFAULT.equals(dbInstanceClass);
		case AwscftargetPackage.RDS_INSTANCE__ENGINE:
			return ENGINE_EDEFAULT == null ? engine != null : !ENGINE_EDEFAULT.equals(engine);
		case AwscftargetPackage.RDS_INSTANCE__ALLOCATED_STORAGE:
			return allocatedStorage != ALLOCATED_STORAGE_EDEFAULT;
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
		result.append(" (DBInstanceClass: ");
		result.append(dbInstanceClass);
		result.append(", Engine: ");
		result.append(engine);
		result.append(", AllocatedStorage: ");
		result.append(allocatedStorage);
		result.append(')');
		return result.toString();
	}

} //RDSInstanceImpl
