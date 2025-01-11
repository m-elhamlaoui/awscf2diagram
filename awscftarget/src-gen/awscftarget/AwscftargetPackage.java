/**
 */
package awscftarget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see awscftarget.AwscftargetFactory
 * @model kind="package"
 * @generated
 */
public interface AwscftargetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "awscftarget";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/awscftarget";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "awscftarget";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AwscftargetPackage eINSTANCE = awscftarget.impl.AwscftargetPackageImpl.init();

	/**
	 * The meta object id for the '{@link awscftarget.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.TemplateImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>AWS Template Format Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CONDITIONS = 4;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__RESOURCES = 5;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.ParameterImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ALLOWED_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Constraint Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONSTRAINT_DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.ResourceImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.MappingEntryImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.OutputImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.MappingImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.MappingMappingImpl <em>Mapping Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.MappingMappingImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getMappingMapping()
	 * @generated
	 */
	int MAPPING_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MAPPING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MAPPING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Mapping Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.ConditionImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.EC2InstanceImpl <em>EC2 Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.EC2InstanceImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getEC2Instance()
	 * @generated
	 */
	int EC2_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE__PROPERTIES = RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE__INSTANCE_TYPE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE__KEY_NAME = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE__IMAGE_ID = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE__SECURITY_GROUP = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EC2 Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EC2 Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EC2_INSTANCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.IngressRuleImpl <em>Ingress Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.IngressRuleImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getIngressRule()
	 * @generated
	 */
	int INGRESS_RULE = 9;

	/**
	 * The feature id for the '<em><b>Ip Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE__IP_PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE__FROM_PORT = 1;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE__TO_PORT = 2;

	/**
	 * The feature id for the '<em><b>Cidr Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE__CIDR_IP = 3;

	/**
	 * The number of structural features of the '<em>Ingress Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ingress Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.SecurityGroupImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__PROPERTIES = RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__GROUP_NAME = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__DESCRIPTION = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security Group Ingress</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__SECURITY_GROUP_INGRESS = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.RDSInstanceImpl <em>RDS Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.RDSInstanceImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getRDSInstance()
	 * @generated
	 */
	int RDS_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDS_INSTANCE__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDS_INSTANCE__PROPERTIES = RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>DB Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDS_INSTANCE__DB_INSTANCE_CLASS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDS_INSTANCE__ENGINE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allocated Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDS_INSTANCE__ALLOCATED_STORAGE = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>RDS Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDS_INSTANCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>RDS Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDS_INSTANCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.S3BucketImpl <em>S3 Bucket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.S3BucketImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getS3Bucket()
	 * @generated
	 */
	int S3_BUCKET = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_BUCKET__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_BUCKET__PROPERTIES = RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Bucket Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_BUCKET__BUCKET_NAME = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Versioning Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_BUCKET__VERSIONING_CONFIGURATION = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>S3 Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_BUCKET_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>S3 Bucket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int S3_BUCKET_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.VPCImpl <em>VPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.VPCImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getVPC()
	 * @generated
	 */
	int VPC = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__TYPE = RESOURCE__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__PROPERTIES = RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__CIDR_BLOCK = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vpc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__VPC_ID = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subnets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__SUBNETS = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link awscftarget.impl.SubnetImpl <em>Subnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see awscftarget.impl.SubnetImpl
	 * @see awscftarget.impl.AwscftargetPackageImpl#getSubnet()
	 * @generated
	 */
	int SUBNET = 14;

	/**
	 * The feature id for the '<em><b>Cidr Block</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__CIDR_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Subnet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET__SUBNET_ID = 1;

	/**
	 * The number of structural features of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNET_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link awscftarget.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see awscftarget.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Template#getAWSTemplateFormatVersion <em>AWS Template Format Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AWS Template Format Version</em>'.
	 * @see awscftarget.Template#getAWSTemplateFormatVersion()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_AWSTemplateFormatVersion();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Template#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see awscftarget.Template#getDescription()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.Template#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see awscftarget.Template#getParameters()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.Template#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see awscftarget.Template#getOutputs()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.Template#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see awscftarget.Template#getConditions()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.Template#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see awscftarget.Template#getResources()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Resources();

	/**
	 * Returns the meta object for class '{@link awscftarget.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see awscftarget.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see awscftarget.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see awscftarget.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see awscftarget.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Parameter#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Values</em>'.
	 * @see awscftarget.Parameter#getAllowedValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_AllowedValues();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see awscftarget.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Parameter#getConstraintDescription <em>Constraint Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Description</em>'.
	 * @see awscftarget.Parameter#getConstraintDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ConstraintDescription();

	/**
	 * Returns the meta object for class '{@link awscftarget.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see awscftarget.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Resource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see awscftarget.Resource#getType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.Resource#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see awscftarget.Resource#getProperties()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Properties();

	/**
	 * Returns the meta object for class '{@link awscftarget.MappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entry</em>'.
	 * @see awscftarget.MappingEntry
	 * @generated
	 */
	EClass getMappingEntry();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.MappingEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see awscftarget.MappingEntry#getKey()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EAttribute getMappingEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.MappingEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see awscftarget.MappingEntry#getValue()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EAttribute getMappingEntry_Value();

	/**
	 * Returns the meta object for class '{@link awscftarget.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see awscftarget.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see awscftarget.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see awscftarget.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Value();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Output#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see awscftarget.Output#getDescription()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Description();

	/**
	 * Returns the meta object for class '{@link awscftarget.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see awscftarget.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Mapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see awscftarget.Mapping#getName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.Mapping#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see awscftarget.Mapping#getMappings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Mappings();

	/**
	 * Returns the meta object for class '{@link awscftarget.MappingMapping <em>Mapping Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Mapping</em>'.
	 * @see awscftarget.MappingMapping
	 * @generated
	 */
	EClass getMappingMapping();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.MappingMapping#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see awscftarget.MappingMapping#getKey()
	 * @see #getMappingMapping()
	 * @generated
	 */
	EAttribute getMappingMapping_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.MappingMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see awscftarget.MappingMapping#getValue()
	 * @see #getMappingMapping()
	 * @generated
	 */
	EReference getMappingMapping_Value();

	/**
	 * Returns the meta object for class '{@link awscftarget.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see awscftarget.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see awscftarget.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see awscftarget.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link awscftarget.EC2Instance <em>EC2 Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EC2 Instance</em>'.
	 * @see awscftarget.EC2Instance
	 * @generated
	 */
	EClass getEC2Instance();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.EC2Instance#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see awscftarget.EC2Instance#getInstanceType()
	 * @see #getEC2Instance()
	 * @generated
	 */
	EAttribute getEC2Instance_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.EC2Instance#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Name</em>'.
	 * @see awscftarget.EC2Instance#getKeyName()
	 * @see #getEC2Instance()
	 * @generated
	 */
	EAttribute getEC2Instance_KeyName();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.EC2Instance#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see awscftarget.EC2Instance#getImageId()
	 * @see #getEC2Instance()
	 * @generated
	 */
	EAttribute getEC2Instance_ImageId();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.EC2Instance#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Group</em>'.
	 * @see awscftarget.EC2Instance#getSecurityGroup()
	 * @see #getEC2Instance()
	 * @generated
	 */
	EReference getEC2Instance_SecurityGroup();

	/**
	 * Returns the meta object for class '{@link awscftarget.IngressRule <em>Ingress Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingress Rule</em>'.
	 * @see awscftarget.IngressRule
	 * @generated
	 */
	EClass getIngressRule();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.IngressRule#getIpProtocol <em>Ip Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Protocol</em>'.
	 * @see awscftarget.IngressRule#getIpProtocol()
	 * @see #getIngressRule()
	 * @generated
	 */
	EAttribute getIngressRule_IpProtocol();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.IngressRule#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Port</em>'.
	 * @see awscftarget.IngressRule#getFromPort()
	 * @see #getIngressRule()
	 * @generated
	 */
	EAttribute getIngressRule_FromPort();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.IngressRule#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Port</em>'.
	 * @see awscftarget.IngressRule#getToPort()
	 * @see #getIngressRule()
	 * @generated
	 */
	EAttribute getIngressRule_ToPort();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.IngressRule#getCidrIp <em>Cidr Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Ip</em>'.
	 * @see awscftarget.IngressRule#getCidrIp()
	 * @see #getIngressRule()
	 * @generated
	 */
	EAttribute getIngressRule_CidrIp();

	/**
	 * Returns the meta object for class '{@link awscftarget.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see awscftarget.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.SecurityGroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see awscftarget.SecurityGroup#getGroupName()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.SecurityGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see awscftarget.SecurityGroup#getDescription()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.SecurityGroup#getSecurityGroupIngress <em>Security Group Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Group Ingress</em>'.
	 * @see awscftarget.SecurityGroup#getSecurityGroupIngress()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_SecurityGroupIngress();

	/**
	 * Returns the meta object for class '{@link awscftarget.RDSInstance <em>RDS Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDS Instance</em>'.
	 * @see awscftarget.RDSInstance
	 * @generated
	 */
	EClass getRDSInstance();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.RDSInstance#getDBInstanceClass <em>DB Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DB Instance Class</em>'.
	 * @see awscftarget.RDSInstance#getDBInstanceClass()
	 * @see #getRDSInstance()
	 * @generated
	 */
	EAttribute getRDSInstance_DBInstanceClass();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.RDSInstance#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine</em>'.
	 * @see awscftarget.RDSInstance#getEngine()
	 * @see #getRDSInstance()
	 * @generated
	 */
	EAttribute getRDSInstance_Engine();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.RDSInstance#getAllocatedStorage <em>Allocated Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocated Storage</em>'.
	 * @see awscftarget.RDSInstance#getAllocatedStorage()
	 * @see #getRDSInstance()
	 * @generated
	 */
	EAttribute getRDSInstance_AllocatedStorage();

	/**
	 * Returns the meta object for class '{@link awscftarget.S3Bucket <em>S3 Bucket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>S3 Bucket</em>'.
	 * @see awscftarget.S3Bucket
	 * @generated
	 */
	EClass getS3Bucket();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.S3Bucket#getBucketName <em>Bucket Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Name</em>'.
	 * @see awscftarget.S3Bucket#getBucketName()
	 * @see #getS3Bucket()
	 * @generated
	 */
	EAttribute getS3Bucket_BucketName();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.S3Bucket#isVersioningConfiguration <em>Versioning Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versioning Configuration</em>'.
	 * @see awscftarget.S3Bucket#isVersioningConfiguration()
	 * @see #getS3Bucket()
	 * @generated
	 */
	EAttribute getS3Bucket_VersioningConfiguration();

	/**
	 * Returns the meta object for class '{@link awscftarget.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPC</em>'.
	 * @see awscftarget.VPC
	 * @generated
	 */
	EClass getVPC();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.VPC#getCidrBlock <em>Cidr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block</em>'.
	 * @see awscftarget.VPC#getCidrBlock()
	 * @see #getVPC()
	 * @generated
	 */
	EAttribute getVPC_CidrBlock();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.VPC#getVpcId <em>Vpc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc Id</em>'.
	 * @see awscftarget.VPC#getVpcId()
	 * @see #getVPC()
	 * @generated
	 */
	EAttribute getVPC_VpcId();

	/**
	 * Returns the meta object for the containment reference list '{@link awscftarget.VPC#getSubnets <em>Subnets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subnets</em>'.
	 * @see awscftarget.VPC#getSubnets()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Subnets();

	/**
	 * Returns the meta object for class '{@link awscftarget.Subnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnet</em>'.
	 * @see awscftarget.Subnet
	 * @generated
	 */
	EClass getSubnet();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Subnet#getCidrBlock <em>Cidr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr Block</em>'.
	 * @see awscftarget.Subnet#getCidrBlock()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_CidrBlock();

	/**
	 * Returns the meta object for the attribute '{@link awscftarget.Subnet#getSubnetId <em>Subnet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet Id</em>'.
	 * @see awscftarget.Subnet#getSubnetId()
	 * @see #getSubnet()
	 * @generated
	 */
	EAttribute getSubnet_SubnetId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AwscftargetFactory getAwscftargetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link awscftarget.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.TemplateImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>AWS Template Format Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION = eINSTANCE.getTemplate_AWSTemplateFormatVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__DESCRIPTION = eINSTANCE.getTemplate_Description();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__PARAMETERS = eINSTANCE.getTemplate_Parameters();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__OUTPUTS = eINSTANCE.getTemplate_Outputs();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__CONDITIONS = eINSTANCE.getTemplate_Conditions();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__RESOURCES = eINSTANCE.getTemplate_Resources();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.ParameterImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Allowed Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ALLOWED_VALUES = eINSTANCE.getParameter_AllowedValues();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Constraint Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__CONSTRAINT_DESCRIPTION = eINSTANCE.getParameter_ConstraintDescription();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.ResourceImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE = eINSTANCE.getResource_Type();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PROPERTIES = eINSTANCE.getResource_Properties();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.MappingEntryImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getMappingEntry()
		 * @generated
		 */
		EClass MAPPING_ENTRY = eINSTANCE.getMappingEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTRY__KEY = eINSTANCE.getMappingEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTRY__VALUE = eINSTANCE.getMappingEntry_Value();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.OutputImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__DESCRIPTION = eINSTANCE.getOutput_Description();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.MappingImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MAPPINGS = eINSTANCE.getMapping_Mappings();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.MappingMappingImpl <em>Mapping Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.MappingMappingImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getMappingMapping()
		 * @generated
		 */
		EClass MAPPING_MAPPING = eINSTANCE.getMappingMapping();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_MAPPING__KEY = eINSTANCE.getMappingMapping_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MAPPING__VALUE = eINSTANCE.getMappingMapping_Value();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.ConditionImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.EC2InstanceImpl <em>EC2 Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.EC2InstanceImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getEC2Instance()
		 * @generated
		 */
		EClass EC2_INSTANCE = eINSTANCE.getEC2Instance();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2_INSTANCE__INSTANCE_TYPE = eINSTANCE.getEC2Instance_InstanceType();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2_INSTANCE__KEY_NAME = eINSTANCE.getEC2Instance_KeyName();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EC2_INSTANCE__IMAGE_ID = eINSTANCE.getEC2Instance_ImageId();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EC2_INSTANCE__SECURITY_GROUP = eINSTANCE.getEC2Instance_SecurityGroup();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.IngressRuleImpl <em>Ingress Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.IngressRuleImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getIngressRule()
		 * @generated
		 */
		EClass INGRESS_RULE = eINSTANCE.getIngressRule();

		/**
		 * The meta object literal for the '<em><b>Ip Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS_RULE__IP_PROTOCOL = eINSTANCE.getIngressRule_IpProtocol();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS_RULE__FROM_PORT = eINSTANCE.getIngressRule_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS_RULE__TO_PORT = eINSTANCE.getIngressRule_ToPort();

		/**
		 * The meta object literal for the '<em><b>Cidr Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS_RULE__CIDR_IP = eINSTANCE.getIngressRule_CidrIp();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.SecurityGroupImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__GROUP_NAME = eINSTANCE.getSecurityGroup_GroupName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__DESCRIPTION = eINSTANCE.getSecurityGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Security Group Ingress</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__SECURITY_GROUP_INGRESS = eINSTANCE.getSecurityGroup_SecurityGroupIngress();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.RDSInstanceImpl <em>RDS Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.RDSInstanceImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getRDSInstance()
		 * @generated
		 */
		EClass RDS_INSTANCE = eINSTANCE.getRDSInstance();

		/**
		 * The meta object literal for the '<em><b>DB Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDS_INSTANCE__DB_INSTANCE_CLASS = eINSTANCE.getRDSInstance_DBInstanceClass();

		/**
		 * The meta object literal for the '<em><b>Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDS_INSTANCE__ENGINE = eINSTANCE.getRDSInstance_Engine();

		/**
		 * The meta object literal for the '<em><b>Allocated Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDS_INSTANCE__ALLOCATED_STORAGE = eINSTANCE.getRDSInstance_AllocatedStorage();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.S3BucketImpl <em>S3 Bucket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.S3BucketImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getS3Bucket()
		 * @generated
		 */
		EClass S3_BUCKET = eINSTANCE.getS3Bucket();

		/**
		 * The meta object literal for the '<em><b>Bucket Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_BUCKET__BUCKET_NAME = eINSTANCE.getS3Bucket_BucketName();

		/**
		 * The meta object literal for the '<em><b>Versioning Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute S3_BUCKET__VERSIONING_CONFIGURATION = eINSTANCE.getS3Bucket_VersioningConfiguration();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.VPCImpl <em>VPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.VPCImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getVPC()
		 * @generated
		 */
		EClass VPC = eINSTANCE.getVPC();

		/**
		 * The meta object literal for the '<em><b>Cidr Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__CIDR_BLOCK = eINSTANCE.getVPC_CidrBlock();

		/**
		 * The meta object literal for the '<em><b>Vpc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__VPC_ID = eINSTANCE.getVPC_VpcId();

		/**
		 * The meta object literal for the '<em><b>Subnets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__SUBNETS = eINSTANCE.getVPC_Subnets();

		/**
		 * The meta object literal for the '{@link awscftarget.impl.SubnetImpl <em>Subnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see awscftarget.impl.SubnetImpl
		 * @see awscftarget.impl.AwscftargetPackageImpl#getSubnet()
		 * @generated
		 */
		EClass SUBNET = eINSTANCE.getSubnet();

		/**
		 * The meta object literal for the '<em><b>Cidr Block</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__CIDR_BLOCK = eINSTANCE.getSubnet_CidrBlock();

		/**
		 * The meta object literal for the '<em><b>Subnet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNET__SUBNET_ID = eINSTANCE.getSubnet_SubnetId();

	}

} //AwscftargetPackage
