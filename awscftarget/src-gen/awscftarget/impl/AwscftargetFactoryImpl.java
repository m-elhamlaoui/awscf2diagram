/**
 */
package awscftarget.impl;

import awscftarget.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AwscftargetFactoryImpl extends EFactoryImpl implements AwscftargetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AwscftargetFactory init() {
		try {
			AwscftargetFactory theAwscftargetFactory = (AwscftargetFactory) EPackage.Registry.INSTANCE
					.getEFactory(AwscftargetPackage.eNS_URI);
			if (theAwscftargetFactory != null) {
				return theAwscftargetFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AwscftargetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwscftargetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AwscftargetPackage.TEMPLATE:
			return createTemplate();
		case AwscftargetPackage.PARAMETER:
			return createParameter();
		case AwscftargetPackage.MAPPING_ENTRY:
			return createMappingEntry();
		case AwscftargetPackage.OUTPUT:
			return createOutput();
		case AwscftargetPackage.MAPPING:
			return createMapping();
		case AwscftargetPackage.MAPPING_MAPPING:
			return createMappingMapping();
		case AwscftargetPackage.CONDITION:
			return createCondition();
		case AwscftargetPackage.EC2_INSTANCE:
			return createEC2Instance();
		case AwscftargetPackage.INGRESS_RULE:
			return createIngressRule();
		case AwscftargetPackage.SECURITY_GROUP:
			return createSecurityGroup();
		case AwscftargetPackage.RDS_INSTANCE:
			return createRDSInstance();
		case AwscftargetPackage.S3_BUCKET:
			return createS3Bucket();
		case AwscftargetPackage.VPC:
			return createVPC();
		case AwscftargetPackage.SUBNET:
			return createSubnet();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingEntry createMappingEntry() {
		MappingEntryImpl mappingEntry = new MappingEntryImpl();
		return mappingEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingMapping createMappingMapping() {
		MappingMappingImpl mappingMapping = new MappingMappingImpl();
		return mappingMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EC2Instance createEC2Instance() {
		EC2InstanceImpl ec2Instance = new EC2InstanceImpl();
		return ec2Instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IngressRule createIngressRule() {
		IngressRuleImpl ingressRule = new IngressRuleImpl();
		return ingressRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup createSecurityGroup() {
		SecurityGroupImpl securityGroup = new SecurityGroupImpl();
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDSInstance createRDSInstance() {
		RDSInstanceImpl rdsInstance = new RDSInstanceImpl();
		return rdsInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public S3Bucket createS3Bucket() {
		S3BucketImpl s3Bucket = new S3BucketImpl();
		return s3Bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC createVPC() {
		VPCImpl vpc = new VPCImpl();
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnet createSubnet() {
		SubnetImpl subnet = new SubnetImpl();
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwscftargetPackage getAwscftargetPackage() {
		return (AwscftargetPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AwscftargetPackage getPackage() {
		return AwscftargetPackage.eINSTANCE;
	}

} //AwscftargetFactoryImpl
