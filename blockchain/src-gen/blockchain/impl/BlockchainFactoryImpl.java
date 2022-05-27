/**
 */
package blockchain.impl;

import blockchain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class BlockchainFactoryImpl extends EFactoryImpl implements BlockchainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockchainFactory init() {
		try {
			BlockchainFactory theBlockchainFactory = (BlockchainFactory) EPackage.Registry.INSTANCE
					.getEFactory(BlockchainPackage.eNS_URI);
			if (theBlockchainFactory != null) {
				return theBlockchainFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockchainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainFactoryImpl() {
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
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM:
			return createOnline_Education_System();
		case BlockchainPackage.BLOCK:
			return createBlock();
		case BlockchainPackage.STUDENTS_CREDENTIAL:
			return createStudents_Credential();
		case BlockchainPackage.UNIVERSITIES:
			return createUniversities();
		case BlockchainPackage.PROFESSORS:
			return createProfessors();
		case BlockchainPackage.ENCRYPTOR_SHA256:
			return createEncryptor_SHA256();
		case BlockchainPackage.SMART_CONTRACT:
			return createSmartContract();
		case BlockchainPackage.EXAM_QUESTIONS:
			return createExam_Questions();
		case BlockchainPackage.EXAM_SOLUTION:
			return createExam_Solution();
		case BlockchainPackage.INFORMATION:
			return createInformation();
		case BlockchainPackage.EXAM_NETWORK:
			return createExam_Network();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BlockchainPackage.TYPE:
			return createTypeFromString(eDataType, initialValue);
		case BlockchainPackage.IMAGE:
			return createImageFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BlockchainPackage.TYPE:
			return convertTypeToString(eDataType, instanceValue);
		case BlockchainPackage.IMAGE:
			return convertImageToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Online_Education_System createOnline_Education_System() {
		Online_Education_SystemImpl online_Education_System = new Online_Education_SystemImpl();
		return online_Education_System;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Students_Credential createStudents_Credential() {
		Students_CredentialImpl students_Credential = new Students_CredentialImpl();
		return students_Credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universities createUniversities() {
		UniversitiesImpl universities = new UniversitiesImpl();
		return universities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professors createProfessors() {
		ProfessorsImpl professors = new ProfessorsImpl();
		return professors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encryptor_SHA256 createEncryptor_SHA256() {
		Encryptor_SHA256Impl encryptor_SHA256 = new Encryptor_SHA256Impl();
		return encryptor_SHA256;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartContract createSmartContract() {
		SmartContractImpl smartContract = new SmartContractImpl();
		return smartContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_Questions createExam_Questions() {
		Exam_QuestionsImpl exam_Questions = new Exam_QuestionsImpl();
		return exam_Questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_Solution createExam_Solution() {
		Exam_SolutionImpl exam_Solution = new Exam_SolutionImpl();
		return exam_Solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_Network createExam_Network() {
		Exam_NetworkImpl exam_Network = new Exam_NetworkImpl();
		return exam_Network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createImageFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainPackage getBlockchainPackage() {
		return (BlockchainPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BlockchainPackage getPackage() {
		return BlockchainPackage.eINSTANCE;
	}

} //BlockchainFactoryImpl
