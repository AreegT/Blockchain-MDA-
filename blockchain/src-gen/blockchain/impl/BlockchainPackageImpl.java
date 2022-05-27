/**
 */
package blockchain.impl;

import blockchain.Block;
import blockchain.BlockchainFactory;
import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;
import blockchain.Exam_Network;
import blockchain.Exam_Questions;
import blockchain.Exam_Solution;
import blockchain.Information;
import blockchain.Online_Education_System;
import blockchain.Professors;
import blockchain.SmartContract;
import blockchain.Students_Credential;
import blockchain.Type;
import blockchain.Universities;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockchainPackageImpl extends EPackageImpl implements BlockchainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass online_Education_SystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass students_CredentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptor_SHA256EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exam_QuestionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exam_SolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exam_NetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see blockchain.BlockchainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlockchainPackageImpl() {
		super(eNS_URI, BlockchainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BlockchainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlockchainPackage init() {
		if (isInited)
			return (BlockchainPackage) EPackage.Registry.INSTANCE.getEPackage(BlockchainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBlockchainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BlockchainPackageImpl theBlockchainPackage = registeredBlockchainPackage instanceof BlockchainPackageImpl
				? (BlockchainPackageImpl) registeredBlockchainPackage
				: new BlockchainPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBlockchainPackage.createPackageContents();

		// Initialize created meta-data
		theBlockchainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBlockchainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlockchainPackage.eNS_URI, theBlockchainPackage);
		return theBlockchainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnline_Education_System() {
		return online_Education_SystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Block() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Students_credential() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Universities() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Professors() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Validator() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Exam_solution() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Smartcontract() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Information() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Exam_questions() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOnline_Education_System_Exam_network() {
		return (EReference) online_Education_SystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Block_No() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Data() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Prev_Hash() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Hash() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Block() {
		return (EReference) blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Information() {
		return (EReference) blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Encryptor() {
		return (EReference) blockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Timestamp() {
		return (EAttribute) blockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__CalculateHash() {
		return blockEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__GetBlockChain() {
		return blockEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__CreateGenesisBlock() {
		return blockEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__AddBlock__String() {
		return blockEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__IsChainValid() {
		return blockEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBlock__GetLatestBlock() {
		return blockEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudents_Credential() {
		return students_CredentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudents_Credential_Stu_Name() {
		return (EAttribute) students_CredentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudents_Credential_Stu_Password() {
		return (EAttribute) students_CredentialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudents_Credential_Stu_Image() {
		return (EAttribute) students_CredentialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudents_Credential_StuDataEncrypt() {
		return (EReference) students_CredentialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudents_Credential_StuInformation() {
		return (EReference) students_CredentialEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversities() {
		return universitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniversities_Uni_Name() {
		return (EAttribute) universitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniversities_Uni_Rank() {
		return (EAttribute) universitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversities_UniInformation() {
		return (EReference) universitiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessors() {
		return professorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessors_Prof_Name() {
		return (EAttribute) professorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessors_Prof_Password() {
		return (EAttribute) professorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessors_Prof_University() {
		return (EAttribute) professorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfessors_Prof_Designation() {
		return (EAttribute) professorsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessors_ProfdataEncrypt() {
		return (EReference) professorsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfessors_ProfInformation() {
		return (EReference) professorsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncryptor_SHA256() {
		return encryptor_SHA256EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptor_SHA256_Validator_Id() {
		return (EAttribute) encryptor_SHA256EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncryptor_SHA256_Block() {
		return (EReference) encryptor_SHA256EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptor_SHA256_Key() {
		return (EAttribute) encryptor_SHA256EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptor_SHA256_Encrypted_data() {
		return (EAttribute) encryptor_SHA256EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptor_SHA256_Hex() {
		return (EAttribute) encryptor_SHA256EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptor_SHA256_Bytes() {
		return (EAttribute) encryptor_SHA256EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEncryptor_SHA256__Sha256__String() {
		return encryptor_SHA256EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartContract() {
		return smartContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartContract_Name() {
		return (EAttribute) smartContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartContract_Block() {
		return (EReference) smartContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartContract__VerifyStudentIdentity__String_String_String() {
		return smartContractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartContract__VerifyValidProf__String_String() {
		return smartContractEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartContract__ValidProf__String() {
		return smartContractEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartContract__VerifyExamSolution() {
		return smartContractEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam_Questions() {
		return exam_QuestionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Questions_Mcqs_based() {
		return (EAttribute) exam_QuestionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Questions_Fill_in_blank() {
		return (EAttribute) exam_QuestionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Questions_Exam_Type() {
		return (EAttribute) exam_QuestionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Questions_QuesInformation() {
		return (EReference) exam_QuestionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Questions_Validprofessor() {
		return (EReference) exam_QuestionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Questions_QuestionEncrypt() {
		return (EReference) exam_QuestionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam_Solution() {
		return exam_SolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Solution_Answers() {
		return (EAttribute) exam_SolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Solution_SolutionInformation() {
		return (EReference) exam_SolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Data() {
		return (EAttribute) informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformation_Exam_network() {
		return (EReference) informationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam_Network() {
		return exam_NetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Network_Name() {
		return (EAttribute) exam_NetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Network_Exam_network() {
		return (EReference) exam_NetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Network_Encryptnetwork() {
		return (EReference) exam_NetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImage() {
		return imageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainFactory getBlockchainFactory() {
		return (BlockchainFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		online_Education_SystemEClass = createEClass(ONLINE_EDUCATION_SYSTEM);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__BLOCK);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__UNIVERSITIES);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__PROFESSORS);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__VALIDATOR);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__INFORMATION);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS);
		createEReference(online_Education_SystemEClass, ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__BLOCK_NO);
		createEAttribute(blockEClass, BLOCK__DATA);
		createEAttribute(blockEClass, BLOCK__PREV_HASH);
		createEAttribute(blockEClass, BLOCK__HASH);
		createEReference(blockEClass, BLOCK__BLOCK);
		createEReference(blockEClass, BLOCK__INFORMATION);
		createEReference(blockEClass, BLOCK__ENCRYPTOR);
		createEAttribute(blockEClass, BLOCK__TIMESTAMP);
		createEOperation(blockEClass, BLOCK___CALCULATE_HASH);
		createEOperation(blockEClass, BLOCK___GET_BLOCK_CHAIN);
		createEOperation(blockEClass, BLOCK___CREATE_GENESIS_BLOCK);
		createEOperation(blockEClass, BLOCK___ADD_BLOCK__STRING);
		createEOperation(blockEClass, BLOCK___IS_CHAIN_VALID);
		createEOperation(blockEClass, BLOCK___GET_LATEST_BLOCK);

		students_CredentialEClass = createEClass(STUDENTS_CREDENTIAL);
		createEAttribute(students_CredentialEClass, STUDENTS_CREDENTIAL__STU_NAME);
		createEAttribute(students_CredentialEClass, STUDENTS_CREDENTIAL__STU_PASSWORD);
		createEAttribute(students_CredentialEClass, STUDENTS_CREDENTIAL__STU_IMAGE);
		createEReference(students_CredentialEClass, STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT);
		createEReference(students_CredentialEClass, STUDENTS_CREDENTIAL__STU_INFORMATION);

		universitiesEClass = createEClass(UNIVERSITIES);
		createEAttribute(universitiesEClass, UNIVERSITIES__UNI_NAME);
		createEAttribute(universitiesEClass, UNIVERSITIES__UNI_RANK);
		createEReference(universitiesEClass, UNIVERSITIES__UNI_INFORMATION);

		professorsEClass = createEClass(PROFESSORS);
		createEAttribute(professorsEClass, PROFESSORS__PROF_NAME);
		createEAttribute(professorsEClass, PROFESSORS__PROF_PASSWORD);
		createEAttribute(professorsEClass, PROFESSORS__PROF_UNIVERSITY);
		createEAttribute(professorsEClass, PROFESSORS__PROF_DESIGNATION);
		createEReference(professorsEClass, PROFESSORS__PROFDATA_ENCRYPT);
		createEReference(professorsEClass, PROFESSORS__PROF_INFORMATION);

		encryptor_SHA256EClass = createEClass(ENCRYPTOR_SHA256);
		createEAttribute(encryptor_SHA256EClass, ENCRYPTOR_SHA256__VALIDATOR_ID);
		createEReference(encryptor_SHA256EClass, ENCRYPTOR_SHA256__BLOCK);
		createEAttribute(encryptor_SHA256EClass, ENCRYPTOR_SHA256__KEY);
		createEAttribute(encryptor_SHA256EClass, ENCRYPTOR_SHA256__ENCRYPTED_DATA);
		createEAttribute(encryptor_SHA256EClass, ENCRYPTOR_SHA256__HEX);
		createEAttribute(encryptor_SHA256EClass, ENCRYPTOR_SHA256__BYTES);
		createEOperation(encryptor_SHA256EClass, ENCRYPTOR_SHA256___SHA256__STRING);

		smartContractEClass = createEClass(SMART_CONTRACT);
		createEAttribute(smartContractEClass, SMART_CONTRACT__NAME);
		createEReference(smartContractEClass, SMART_CONTRACT__BLOCK);
		createEOperation(smartContractEClass, SMART_CONTRACT___VERIFY_STUDENT_IDENTITY__STRING_STRING_STRING);
		createEOperation(smartContractEClass, SMART_CONTRACT___VERIFY_VALID_PROF__STRING_STRING);
		createEOperation(smartContractEClass, SMART_CONTRACT___VALID_PROF__STRING);
		createEOperation(smartContractEClass, SMART_CONTRACT___VERIFY_EXAM_SOLUTION);

		exam_QuestionsEClass = createEClass(EXAM_QUESTIONS);
		createEAttribute(exam_QuestionsEClass, EXAM_QUESTIONS__MCQS_BASED);
		createEAttribute(exam_QuestionsEClass, EXAM_QUESTIONS__FILL_IN_BLANK);
		createEAttribute(exam_QuestionsEClass, EXAM_QUESTIONS__EXAM_TYPE);
		createEReference(exam_QuestionsEClass, EXAM_QUESTIONS__QUES_INFORMATION);
		createEReference(exam_QuestionsEClass, EXAM_QUESTIONS__VALIDPROFESSOR);
		createEReference(exam_QuestionsEClass, EXAM_QUESTIONS__QUESTION_ENCRYPT);

		exam_SolutionEClass = createEClass(EXAM_SOLUTION);
		createEAttribute(exam_SolutionEClass, EXAM_SOLUTION__ANSWERS);
		createEReference(exam_SolutionEClass, EXAM_SOLUTION__SOLUTION_INFORMATION);

		informationEClass = createEClass(INFORMATION);
		createEAttribute(informationEClass, INFORMATION__DATA);
		createEReference(informationEClass, INFORMATION__EXAM_NETWORK);

		exam_NetworkEClass = createEClass(EXAM_NETWORK);
		createEAttribute(exam_NetworkEClass, EXAM_NETWORK__NAME);
		createEReference(exam_NetworkEClass, EXAM_NETWORK__EXAM_NETWORK);
		createEReference(exam_NetworkEClass, EXAM_NETWORK__ENCRYPTNETWORK);

		// Create enums
		typeEEnum = createEEnum(TYPE);

		// Create data types
		imageEDataType = createEDataType(IMAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(online_Education_SystemEClass, Online_Education_System.class, "Online_Education_System",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnline_Education_System_Block(), this.getBlock(), null, "block", null, 1, -1,
				Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Students_credential(), this.getStudents_Credential(), null,
				"students_credential", null, 1, -1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Universities(), this.getUniversities(), null, "universities", null, 1,
				-1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Professors(), this.getProfessors(), null, "professors", null, 1, -1,
				Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Validator(), this.getEncryptor_SHA256(), null, "validator", null, 1,
				-1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Exam_solution(), this.getExam_Solution(), null, "exam_solution", null,
				1, -1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Smartcontract(), this.getSmartContract(), null, "smartcontract", null,
				1, -1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Information(), this.getInformation(), null, "information", null, 1,
				-1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Exam_questions(), this.getExam_Questions(), null, "exam_questions",
				null, 1, -1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOnline_Education_System_Exam_network(), this.getExam_Network(), null, "exam_network", null, 1,
				-1, Online_Education_System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Block_No(), ecorePackage.getEString(), "Block_No", null, 0, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Data(), ecorePackage.getEString(), "Data", null, 0, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Prev_Hash(), ecorePackage.getEString(), "Prev_Hash", null, 0, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Hash(), ecorePackage.getEString(), "Hash", null, 0, 1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Block(), this.getBlock(), null, "block", null, 1, -1, Block.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBlock_Information(), this.getInformation(), null, "information", null, 1, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Encryptor(), this.getEncryptor_SHA256(), null, "encryptor", null, 1, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Timestamp(), ecorePackage.getELong(), "timestamp", null, 1, 1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBlock__CalculateHash(), ecorePackage.getEString(), "calculateHash", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getBlock__GetBlockChain(), null, "getBlockChain", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBlock__CreateGenesisBlock(), null, "createGenesisBlock", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getBlock__AddBlock__String(), null, "addBlock", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Data", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBlock__IsChainValid(), ecorePackage.getEBoolean(), "isChainValid", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getBlock__GetLatestBlock(), null, "getLatestBlock", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(students_CredentialEClass, Students_Credential.class, "Students_Credential", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudents_Credential_Stu_Name(), ecorePackage.getEString(), "Stu_Name", null, 0, 1,
				Students_Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudents_Credential_Stu_Password(), ecorePackage.getEString(), "Stu_Password", null, 0, 1,
				Students_Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudents_Credential_Stu_Image(), this.getImage(), "Stu_Image", null, 0, 1,
				Students_Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudents_Credential_StuDataEncrypt(), this.getEncryptor_SHA256(), null, "stuDataEncrypt",
				null, 1, -1, Students_Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudents_Credential_StuInformation(), this.getInformation(), null, "stuInformation", null, 1,
				-1, Students_Credential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universitiesEClass, Universities.class, "Universities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniversities_Uni_Name(), ecorePackage.getEString(), "Uni_Name", null, 0, 1,
				Universities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUniversities_Uni_Rank(), ecorePackage.getEString(), "Uni_Rank", null, 0, 1,
				Universities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUniversities_UniInformation(), this.getInformation(), null, "uniInformation", null, 1, -1,
				Universities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(professorsEClass, Professors.class, "Professors", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfessors_Prof_Name(), ecorePackage.getEString(), "Prof_Name", null, 0, 1, Professors.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfessors_Prof_Password(), ecorePackage.getEString(), "Prof_Password", null, 0, 1,
				Professors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfessors_Prof_University(), ecorePackage.getEString(), "Prof_University", null, 0, 1,
				Professors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfessors_Prof_Designation(), ecorePackage.getEString(), "Prof_Designation", null, 0, 1,
				Professors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProfessors_ProfdataEncrypt(), this.getEncryptor_SHA256(), null, "profdataEncrypt", null, 1,
				-1, Professors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfessors_ProfInformation(), this.getInformation(), null, "profInformation", null, 1, -1,
				Professors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encryptor_SHA256EClass, Encryptor_SHA256.class, "Encryptor_SHA256", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncryptor_SHA256_Validator_Id(), ecorePackage.getEString(), "Validator_Id", null, 0, 1,
				Encryptor_SHA256.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEncryptor_SHA256_Block(), this.getBlock(), null, "block", null, 1, -1, Encryptor_SHA256.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptor_SHA256_Key(), ecorePackage.getEString(), "key", null, 0, 1, Encryptor_SHA256.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptor_SHA256_Encrypted_data(), ecorePackage.getEString(), "Encrypted_data", null, 0, 1,
				Encryptor_SHA256.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptor_SHA256_Hex(), ecorePackage.getEString(), "hex", null, 0, 1, Encryptor_SHA256.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncryptor_SHA256_Bytes(), ecorePackage.getEByte(), "bytes", null, 1, 1,
				Encryptor_SHA256.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEncryptor_SHA256__Sha256__String(), ecorePackage.getEString(), "sha256", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smartContractEClass, SmartContract.class, "SmartContract", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartContract_Name(), ecorePackage.getEString(), "name", null, 0, 1, SmartContract.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartContract_Block(), this.getBlock(), null, "block", null, 1, -1, SmartContract.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSmartContract__VerifyStudentIdentity__String_String_String(), null,
				"verifyStudentIdentity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Stu_Name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Stu_Psw", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Stu_Image", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSmartContract__VerifyValidProf__String_String(), null, "verifyValidProf", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Prof_name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Prof_Psw", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSmartContract__ValidProf__String(), null, "validProf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "update_exam", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSmartContract__VerifyExamSolution(), null, "verifyExamSolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exam_QuestionsEClass, Exam_Questions.class, "Exam_Questions", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_Questions_Mcqs_based(), ecorePackage.getEString(), "Mcqs_based", null, 0, 1,
				Exam_Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Questions_Fill_in_blank(), ecorePackage.getEBoolean(), "Fill_in_blank", null, 1, 1,
				Exam_Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Questions_Exam_Type(), this.getType(), "Exam_Type", null, 0, 1, Exam_Questions.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_Questions_QuesInformation(), this.getInformation(), null, "quesInformation", null, 1, -1,
				Exam_Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_Questions_Validprofessor(), this.getProfessors(), null, "validprofessor", null, 1, -1,
				Exam_Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_Questions_QuestionEncrypt(), this.getEncryptor_SHA256(), null, "questionEncrypt", null,
				1, -1, Exam_Questions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exam_SolutionEClass, Exam_Solution.class, "Exam_Solution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_Solution_Answers(), ecorePackage.getEString(), "answers", null, 0, 1,
				Exam_Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExam_Solution_SolutionInformation(), this.getInformation(), null, "solutionInformation", null,
				1, -1, Exam_Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformation_Data(), ecorePackage.getEString(), "Data", null, 0, 1, Information.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformation_Exam_network(), this.getExam_Network(), null, "exam_network", null, 1, -1,
				Information.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exam_NetworkEClass, Exam_Network.class, "Exam_Network", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_Network_Name(), ecorePackage.getEString(), "name", null, 0, 1, Exam_Network.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_Network_Exam_network(), this.getExam_Network(), null, "exam_network", null, 1, -1,
				Exam_Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_Network_Encryptnetwork(), this.getEncryptor_SHA256(), null, "encryptnetwork", null, 1,
				-1, Exam_Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.EXTERNAL_EXAM);
		addEEnumLiteral(typeEEnum, Type.INTERNAL_EXAM);

		// Initialize data types
		initEDataType(imageEDataType, Object.class, "Image", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

} //BlockchainPackageImpl
