/**
 */
package blockchain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see blockchain.BlockchainFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface BlockchainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockchain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/blockchain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "blockchain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchainPackage eINSTANCE = blockchain.impl.BlockchainPackageImpl.init();

	/**
	 * The meta object id for the '{@link blockchain.impl.Online_Education_SystemImpl <em>Online Education System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.Online_Education_SystemImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getOnline_Education_System()
	 * @generated
	 */
	int ONLINE_EDUCATION_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Students credential</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL = 1;

	/**
	 * The feature id for the '<em><b>Universities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__UNIVERSITIES = 2;

	/**
	 * The feature id for the '<em><b>Professors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__PROFESSORS = 3;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__VALIDATOR = 4;

	/**
	 * The feature id for the '<em><b>Exam solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION = 5;

	/**
	 * The feature id for the '<em><b>Smartcontract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT = 6;

	/**
	 * The feature id for the '<em><b>Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Exam questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS = 8;

	/**
	 * The feature id for the '<em><b>Exam network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK = 9;

	/**
	 * The number of structural features of the '<em>Online Education System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Online Education System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_EDUCATION_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.BlockImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Block No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_NO = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DATA = 1;

	/**
	 * The feature id for the '<em><b>Prev Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PREV_HASH = 2;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HASH = 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Encryptor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ENCRYPTOR = 6;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TIMESTAMP = 7;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Calculate Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___CALCULATE_HASH = 0;

	/**
	 * The operation id for the '<em>Get Block Chain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___GET_BLOCK_CHAIN = 1;

	/**
	 * The operation id for the '<em>Create Genesis Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___CREATE_GENESIS_BLOCK = 2;

	/**
	 * The operation id for the '<em>Add Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___ADD_BLOCK__STRING = 3;

	/**
	 * The operation id for the '<em>Is Chain Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___IS_CHAIN_VALID = 4;

	/**
	 * The operation id for the '<em>Get Latest Block</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK___GET_LATEST_BLOCK = 5;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link blockchain.impl.Students_CredentialImpl <em>Students Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.Students_CredentialImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getStudents_Credential()
	 * @generated
	 */
	int STUDENTS_CREDENTIAL = 2;

	/**
	 * The feature id for the '<em><b>Stu Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENTS_CREDENTIAL__STU_NAME = 0;

	/**
	 * The feature id for the '<em><b>Stu Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENTS_CREDENTIAL__STU_PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Stu Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENTS_CREDENTIAL__STU_IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Stu Data Encrypt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT = 3;

	/**
	 * The feature id for the '<em><b>Stu Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENTS_CREDENTIAL__STU_INFORMATION = 4;

	/**
	 * The number of structural features of the '<em>Students Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENTS_CREDENTIAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Students Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENTS_CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.UniversitiesImpl <em>Universities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.UniversitiesImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getUniversities()
	 * @generated
	 */
	int UNIVERSITIES = 3;

	/**
	 * The feature id for the '<em><b>Uni Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITIES__UNI_NAME = 0;

	/**
	 * The feature id for the '<em><b>Uni Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITIES__UNI_RANK = 1;

	/**
	 * The feature id for the '<em><b>Uni Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITIES__UNI_INFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Universities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Universities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.ProfessorsImpl <em>Professors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.ProfessorsImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getProfessors()
	 * @generated
	 */
	int PROFESSORS = 4;

	/**
	 * The feature id for the '<em><b>Prof Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS__PROF_NAME = 0;

	/**
	 * The feature id for the '<em><b>Prof Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS__PROF_PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Prof University</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS__PROF_UNIVERSITY = 2;

	/**
	 * The feature id for the '<em><b>Prof Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS__PROF_DESIGNATION = 3;

	/**
	 * The feature id for the '<em><b>Profdata Encrypt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS__PROFDATA_ENCRYPT = 4;

	/**
	 * The feature id for the '<em><b>Prof Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS__PROF_INFORMATION = 5;

	/**
	 * The number of structural features of the '<em>Professors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Professors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.Encryptor_SHA256Impl <em>Encryptor SHA256</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.Encryptor_SHA256Impl
	 * @see blockchain.impl.BlockchainPackageImpl#getEncryptor_SHA256()
	 * @generated
	 */
	int ENCRYPTOR_SHA256 = 5;

	/**
	 * The feature id for the '<em><b>Validator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256__VALIDATOR_ID = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256__BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256__KEY = 2;

	/**
	 * The feature id for the '<em><b>Encrypted data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256__ENCRYPTED_DATA = 3;

	/**
	 * The feature id for the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256__HEX = 4;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256__BYTES = 5;

	/**
	 * The number of structural features of the '<em>Encryptor SHA256</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Sha256</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256___SHA256__STRING = 0;

	/**
	 * The number of operations of the '<em>Encryptor SHA256</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCRYPTOR_SHA256_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link blockchain.impl.SmartContractImpl <em>Smart Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.SmartContractImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getSmartContract()
	 * @generated
	 */
	int SMART_CONTRACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT__BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Smart Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Verify Student Identity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT___VERIFY_STUDENT_IDENTITY__STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Verify Valid Prof</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT___VERIFY_VALID_PROF__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Valid Prof</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT___VALID_PROF__STRING = 2;

	/**
	 * The operation id for the '<em>Verify Exam Solution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT___VERIFY_EXAM_SOLUTION = 3;

	/**
	 * The number of operations of the '<em>Smart Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CONTRACT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link blockchain.impl.Exam_QuestionsImpl <em>Exam Questions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.Exam_QuestionsImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExam_Questions()
	 * @generated
	 */
	int EXAM_QUESTIONS = 7;

	/**
	 * The feature id for the '<em><b>Mcqs based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS__MCQS_BASED = 0;

	/**
	 * The feature id for the '<em><b>Fill in blank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS__FILL_IN_BLANK = 1;

	/**
	 * The feature id for the '<em><b>Exam Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS__EXAM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Ques Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS__QUES_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Validprofessor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS__VALIDPROFESSOR = 4;

	/**
	 * The feature id for the '<em><b>Question Encrypt</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS__QUESTION_ENCRYPT = 5;

	/**
	 * The number of structural features of the '<em>Exam Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Exam Questions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_QUESTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.Exam_SolutionImpl <em>Exam Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.Exam_SolutionImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExam_Solution()
	 * @generated
	 */
	int EXAM_SOLUTION = 8;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_SOLUTION__ANSWERS = 0;

	/**
	 * The feature id for the '<em><b>Solution Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_SOLUTION__SOLUTION_INFORMATION = 1;

	/**
	 * The number of structural features of the '<em>Exam Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_SOLUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exam Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_SOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.InformationImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 9;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__DATA = 0;

	/**
	 * The feature id for the '<em><b>Exam network</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__EXAM_NETWORK = 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.impl.Exam_NetworkImpl <em>Exam Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.impl.Exam_NetworkImpl
	 * @see blockchain.impl.BlockchainPackageImpl#getExam_Network()
	 * @generated
	 */
	int EXAM_NETWORK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Exam network</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_NETWORK__EXAM_NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Encryptnetwork</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_NETWORK__ENCRYPTNETWORK = 2;

	/**
	 * The number of structural features of the '<em>Exam Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Exam Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link blockchain.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see blockchain.Type
	 * @see blockchain.impl.BlockchainPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 11;

	/**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see blockchain.impl.BlockchainPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 12;

	/**
	 * Returns the meta object for class '{@link blockchain.Online_Education_System <em>Online Education System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Education System</em>'.
	 * @see blockchain.Online_Education_System
	 * @generated
	 */
	EClass getOnline_Education_System();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see blockchain.Online_Education_System#getBlock()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getStudents_credential <em>Students credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students credential</em>'.
	 * @see blockchain.Online_Education_System#getStudents_credential()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Students_credential();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getUniversities <em>Universities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Universities</em>'.
	 * @see blockchain.Online_Education_System#getUniversities()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Universities();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getProfessors <em>Professors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Professors</em>'.
	 * @see blockchain.Online_Education_System#getProfessors()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Professors();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validator</em>'.
	 * @see blockchain.Online_Education_System#getValidator()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Validator();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getExam_solution <em>Exam solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam solution</em>'.
	 * @see blockchain.Online_Education_System#getExam_solution()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Exam_solution();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getSmartcontract <em>Smartcontract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smartcontract</em>'.
	 * @see blockchain.Online_Education_System#getSmartcontract()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Smartcontract();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information</em>'.
	 * @see blockchain.Online_Education_System#getInformation()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Information();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getExam_questions <em>Exam questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam questions</em>'.
	 * @see blockchain.Online_Education_System#getExam_questions()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Exam_questions();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Online_Education_System#getExam_network <em>Exam network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam network</em>'.
	 * @see blockchain.Online_Education_System#getExam_network()
	 * @see #getOnline_Education_System()
	 * @generated
	 */
	EReference getOnline_Education_System_Exam_network();

	/**
	 * Returns the meta object for class '{@link blockchain.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see blockchain.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Block#getBlock_No <em>Block No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block No</em>'.
	 * @see blockchain.Block#getBlock_No()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Block_No();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Block#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see blockchain.Block#getData()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Data();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Block#getPrev_Hash <em>Prev Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prev Hash</em>'.
	 * @see blockchain.Block#getPrev_Hash()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Prev_Hash();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Block#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see blockchain.Block#getHash()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Hash();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Block#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Block</em>'.
	 * @see blockchain.Block#getBlock()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link blockchain.Block#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information</em>'.
	 * @see blockchain.Block#getInformation()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Information();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Block#getEncryptor <em>Encryptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encryptor</em>'.
	 * @see blockchain.Block#getEncryptor()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Encryptor();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Block#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see blockchain.Block#getTimestamp()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Timestamp();

	/**
	 * Returns the meta object for the '{@link blockchain.Block#calculateHash() <em>Calculate Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Hash</em>' operation.
	 * @see blockchain.Block#calculateHash()
	 * @generated
	 */
	EOperation getBlock__CalculateHash();

	/**
	 * Returns the meta object for the '{@link blockchain.Block#getBlockChain() <em>Get Block Chain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Block Chain</em>' operation.
	 * @see blockchain.Block#getBlockChain()
	 * @generated
	 */
	EOperation getBlock__GetBlockChain();

	/**
	 * Returns the meta object for the '{@link blockchain.Block#createGenesisBlock() <em>Create Genesis Block</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Genesis Block</em>' operation.
	 * @see blockchain.Block#createGenesisBlock()
	 * @generated
	 */
	EOperation getBlock__CreateGenesisBlock();

	/**
	 * Returns the meta object for the '{@link blockchain.Block#addBlock(java.lang.String) <em>Add Block</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Block</em>' operation.
	 * @see blockchain.Block#addBlock(java.lang.String)
	 * @generated
	 */
	EOperation getBlock__AddBlock__String();

	/**
	 * Returns the meta object for the '{@link blockchain.Block#isChainValid() <em>Is Chain Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Chain Valid</em>' operation.
	 * @see blockchain.Block#isChainValid()
	 * @generated
	 */
	EOperation getBlock__IsChainValid();

	/**
	 * Returns the meta object for the '{@link blockchain.Block#getLatestBlock() <em>Get Latest Block</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Latest Block</em>' operation.
	 * @see blockchain.Block#getLatestBlock()
	 * @generated
	 */
	EOperation getBlock__GetLatestBlock();

	/**
	 * Returns the meta object for class '{@link blockchain.Students_Credential <em>Students Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Students Credential</em>'.
	 * @see blockchain.Students_Credential
	 * @generated
	 */
	EClass getStudents_Credential();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Students_Credential#getStu_Name <em>Stu Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stu Name</em>'.
	 * @see blockchain.Students_Credential#getStu_Name()
	 * @see #getStudents_Credential()
	 * @generated
	 */
	EAttribute getStudents_Credential_Stu_Name();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Students_Credential#getStu_Password <em>Stu Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stu Password</em>'.
	 * @see blockchain.Students_Credential#getStu_Password()
	 * @see #getStudents_Credential()
	 * @generated
	 */
	EAttribute getStudents_Credential_Stu_Password();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Students_Credential#getStu_Image <em>Stu Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stu Image</em>'.
	 * @see blockchain.Students_Credential#getStu_Image()
	 * @see #getStudents_Credential()
	 * @generated
	 */
	EAttribute getStudents_Credential_Stu_Image();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Students_Credential#getStuDataEncrypt <em>Stu Data Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stu Data Encrypt</em>'.
	 * @see blockchain.Students_Credential#getStuDataEncrypt()
	 * @see #getStudents_Credential()
	 * @generated
	 */
	EReference getStudents_Credential_StuDataEncrypt();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Students_Credential#getStuInformation <em>Stu Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stu Information</em>'.
	 * @see blockchain.Students_Credential#getStuInformation()
	 * @see #getStudents_Credential()
	 * @generated
	 */
	EReference getStudents_Credential_StuInformation();

	/**
	 * Returns the meta object for class '{@link blockchain.Universities <em>Universities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universities</em>'.
	 * @see blockchain.Universities
	 * @generated
	 */
	EClass getUniversities();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Universities#getUni_Name <em>Uni Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uni Name</em>'.
	 * @see blockchain.Universities#getUni_Name()
	 * @see #getUniversities()
	 * @generated
	 */
	EAttribute getUniversities_Uni_Name();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Universities#getUni_Rank <em>Uni Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uni Rank</em>'.
	 * @see blockchain.Universities#getUni_Rank()
	 * @see #getUniversities()
	 * @generated
	 */
	EAttribute getUniversities_Uni_Rank();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Universities#getUniInformation <em>Uni Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uni Information</em>'.
	 * @see blockchain.Universities#getUniInformation()
	 * @see #getUniversities()
	 * @generated
	 */
	EReference getUniversities_UniInformation();

	/**
	 * Returns the meta object for class '{@link blockchain.Professors <em>Professors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professors</em>'.
	 * @see blockchain.Professors
	 * @generated
	 */
	EClass getProfessors();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Professors#getProf_Name <em>Prof Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prof Name</em>'.
	 * @see blockchain.Professors#getProf_Name()
	 * @see #getProfessors()
	 * @generated
	 */
	EAttribute getProfessors_Prof_Name();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Professors#getProf_Password <em>Prof Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prof Password</em>'.
	 * @see blockchain.Professors#getProf_Password()
	 * @see #getProfessors()
	 * @generated
	 */
	EAttribute getProfessors_Prof_Password();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Professors#getProf_University <em>Prof University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prof University</em>'.
	 * @see blockchain.Professors#getProf_University()
	 * @see #getProfessors()
	 * @generated
	 */
	EAttribute getProfessors_Prof_University();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Professors#getProf_Designation <em>Prof Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prof Designation</em>'.
	 * @see blockchain.Professors#getProf_Designation()
	 * @see #getProfessors()
	 * @generated
	 */
	EAttribute getProfessors_Prof_Designation();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Professors#getProfdataEncrypt <em>Profdata Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Profdata Encrypt</em>'.
	 * @see blockchain.Professors#getProfdataEncrypt()
	 * @see #getProfessors()
	 * @generated
	 */
	EReference getProfessors_ProfdataEncrypt();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Professors#getProfInformation <em>Prof Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prof Information</em>'.
	 * @see blockchain.Professors#getProfInformation()
	 * @see #getProfessors()
	 * @generated
	 */
	EReference getProfessors_ProfInformation();

	/**
	 * Returns the meta object for class '{@link blockchain.Encryptor_SHA256 <em>Encryptor SHA256</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encryptor SHA256</em>'.
	 * @see blockchain.Encryptor_SHA256
	 * @generated
	 */
	EClass getEncryptor_SHA256();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Encryptor_SHA256#getValidator_Id <em>Validator Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validator Id</em>'.
	 * @see blockchain.Encryptor_SHA256#getValidator_Id()
	 * @see #getEncryptor_SHA256()
	 * @generated
	 */
	EAttribute getEncryptor_SHA256_Validator_Id();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Encryptor_SHA256#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Block</em>'.
	 * @see blockchain.Encryptor_SHA256#getBlock()
	 * @see #getEncryptor_SHA256()
	 * @generated
	 */
	EReference getEncryptor_SHA256_Block();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Encryptor_SHA256#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see blockchain.Encryptor_SHA256#getKey()
	 * @see #getEncryptor_SHA256()
	 * @generated
	 */
	EAttribute getEncryptor_SHA256_Key();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Encryptor_SHA256#getEncrypted_data <em>Encrypted data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted data</em>'.
	 * @see blockchain.Encryptor_SHA256#getEncrypted_data()
	 * @see #getEncryptor_SHA256()
	 * @generated
	 */
	EAttribute getEncryptor_SHA256_Encrypted_data();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Encryptor_SHA256#getHex <em>Hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hex</em>'.
	 * @see blockchain.Encryptor_SHA256#getHex()
	 * @see #getEncryptor_SHA256()
	 * @generated
	 */
	EAttribute getEncryptor_SHA256_Hex();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Encryptor_SHA256#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see blockchain.Encryptor_SHA256#getBytes()
	 * @see #getEncryptor_SHA256()
	 * @generated
	 */
	EAttribute getEncryptor_SHA256_Bytes();

	/**
	 * Returns the meta object for the '{@link blockchain.Encryptor_SHA256#sha256(java.lang.String) <em>Sha256</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sha256</em>' operation.
	 * @see blockchain.Encryptor_SHA256#sha256(java.lang.String)
	 * @generated
	 */
	EOperation getEncryptor_SHA256__Sha256__String();

	/**
	 * Returns the meta object for class '{@link blockchain.SmartContract <em>Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Contract</em>'.
	 * @see blockchain.SmartContract
	 * @generated
	 */
	EClass getSmartContract();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.SmartContract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.SmartContract#getName()
	 * @see #getSmartContract()
	 * @generated
	 */
	EAttribute getSmartContract_Name();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.SmartContract#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Block</em>'.
	 * @see blockchain.SmartContract#getBlock()
	 * @see #getSmartContract()
	 * @generated
	 */
	EReference getSmartContract_Block();

	/**
	 * Returns the meta object for the '{@link blockchain.SmartContract#verifyStudentIdentity(java.lang.String, java.lang.String, java.lang.String) <em>Verify Student Identity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Student Identity</em>' operation.
	 * @see blockchain.SmartContract#verifyStudentIdentity(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getSmartContract__VerifyStudentIdentity__String_String_String();

	/**
	 * Returns the meta object for the '{@link blockchain.SmartContract#verifyValidProf(java.lang.String, java.lang.String) <em>Verify Valid Prof</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Valid Prof</em>' operation.
	 * @see blockchain.SmartContract#verifyValidProf(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getSmartContract__VerifyValidProf__String_String();

	/**
	 * Returns the meta object for the '{@link blockchain.SmartContract#validProf(java.lang.String) <em>Valid Prof</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Prof</em>' operation.
	 * @see blockchain.SmartContract#validProf(java.lang.String)
	 * @generated
	 */
	EOperation getSmartContract__ValidProf__String();

	/**
	 * Returns the meta object for the '{@link blockchain.SmartContract#verifyExamSolution() <em>Verify Exam Solution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify Exam Solution</em>' operation.
	 * @see blockchain.SmartContract#verifyExamSolution()
	 * @generated
	 */
	EOperation getSmartContract__VerifyExamSolution();

	/**
	 * Returns the meta object for class '{@link blockchain.Exam_Questions <em>Exam Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Questions</em>'.
	 * @see blockchain.Exam_Questions
	 * @generated
	 */
	EClass getExam_Questions();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Exam_Questions#getMcqs_based <em>Mcqs based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mcqs based</em>'.
	 * @see blockchain.Exam_Questions#getMcqs_based()
	 * @see #getExam_Questions()
	 * @generated
	 */
	EAttribute getExam_Questions_Mcqs_based();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Exam_Questions#isFill_in_blank <em>Fill in blank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill in blank</em>'.
	 * @see blockchain.Exam_Questions#isFill_in_blank()
	 * @see #getExam_Questions()
	 * @generated
	 */
	EAttribute getExam_Questions_Fill_in_blank();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Exam_Questions#getExam_Type <em>Exam Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam Type</em>'.
	 * @see blockchain.Exam_Questions#getExam_Type()
	 * @see #getExam_Questions()
	 * @generated
	 */
	EAttribute getExam_Questions_Exam_Type();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Exam_Questions#getQuesInformation <em>Ques Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ques Information</em>'.
	 * @see blockchain.Exam_Questions#getQuesInformation()
	 * @see #getExam_Questions()
	 * @generated
	 */
	EReference getExam_Questions_QuesInformation();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Exam_Questions#getValidprofessor <em>Validprofessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Validprofessor</em>'.
	 * @see blockchain.Exam_Questions#getValidprofessor()
	 * @see #getExam_Questions()
	 * @generated
	 */
	EReference getExam_Questions_Validprofessor();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Exam_Questions#getQuestionEncrypt <em>Question Encrypt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Question Encrypt</em>'.
	 * @see blockchain.Exam_Questions#getQuestionEncrypt()
	 * @see #getExam_Questions()
	 * @generated
	 */
	EReference getExam_Questions_QuestionEncrypt();

	/**
	 * Returns the meta object for class '{@link blockchain.Exam_Solution <em>Exam Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Solution</em>'.
	 * @see blockchain.Exam_Solution
	 * @generated
	 */
	EClass getExam_Solution();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Exam_Solution#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answers</em>'.
	 * @see blockchain.Exam_Solution#getAnswers()
	 * @see #getExam_Solution()
	 * @generated
	 */
	EAttribute getExam_Solution_Answers();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Exam_Solution#getSolutionInformation <em>Solution Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Information</em>'.
	 * @see blockchain.Exam_Solution#getSolutionInformation()
	 * @see #getExam_Solution()
	 * @generated
	 */
	EReference getExam_Solution_SolutionInformation();

	/**
	 * Returns the meta object for class '{@link blockchain.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see blockchain.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Information#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see blockchain.Information#getData()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Data();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Information#getExam_network <em>Exam network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exam network</em>'.
	 * @see blockchain.Information#getExam_network()
	 * @see #getInformation()
	 * @generated
	 */
	EReference getInformation_Exam_network();

	/**
	 * Returns the meta object for class '{@link blockchain.Exam_Network <em>Exam Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam Network</em>'.
	 * @see blockchain.Exam_Network
	 * @generated
	 */
	EClass getExam_Network();

	/**
	 * Returns the meta object for the attribute '{@link blockchain.Exam_Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see blockchain.Exam_Network#getName()
	 * @see #getExam_Network()
	 * @generated
	 */
	EAttribute getExam_Network_Name();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Exam_Network#getExam_network <em>Exam network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exam network</em>'.
	 * @see blockchain.Exam_Network#getExam_network()
	 * @see #getExam_Network()
	 * @generated
	 */
	EReference getExam_Network_Exam_network();

	/**
	 * Returns the meta object for the reference list '{@link blockchain.Exam_Network#getEncryptnetwork <em>Encryptnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Encryptnetwork</em>'.
	 * @see blockchain.Exam_Network#getEncryptnetwork()
	 * @see #getExam_Network()
	 * @generated
	 */
	EReference getExam_Network_Encryptnetwork();

	/**
	 * Returns the meta object for enum '{@link blockchain.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see blockchain.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockchainFactory getBlockchainFactory();

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
		 * The meta object literal for the '{@link blockchain.impl.Online_Education_SystemImpl <em>Online Education System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.Online_Education_SystemImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getOnline_Education_System()
		 * @generated
		 */
		EClass ONLINE_EDUCATION_SYSTEM = eINSTANCE.getOnline_Education_System();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__BLOCK = eINSTANCE.getOnline_Education_System_Block();

		/**
		 * The meta object literal for the '<em><b>Students credential</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL = eINSTANCE
				.getOnline_Education_System_Students_credential();

		/**
		 * The meta object literal for the '<em><b>Universities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__UNIVERSITIES = eINSTANCE.getOnline_Education_System_Universities();

		/**
		 * The meta object literal for the '<em><b>Professors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__PROFESSORS = eINSTANCE.getOnline_Education_System_Professors();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__VALIDATOR = eINSTANCE.getOnline_Education_System_Validator();

		/**
		 * The meta object literal for the '<em><b>Exam solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION = eINSTANCE.getOnline_Education_System_Exam_solution();

		/**
		 * The meta object literal for the '<em><b>Smartcontract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT = eINSTANCE.getOnline_Education_System_Smartcontract();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__INFORMATION = eINSTANCE.getOnline_Education_System_Information();

		/**
		 * The meta object literal for the '<em><b>Exam questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS = eINSTANCE.getOnline_Education_System_Exam_questions();

		/**
		 * The meta object literal for the '<em><b>Exam network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK = eINSTANCE.getOnline_Education_System_Exam_network();

		/**
		 * The meta object literal for the '{@link blockchain.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.BlockImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Block No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BLOCK_NO = eINSTANCE.getBlock_Block_No();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__DATA = eINSTANCE.getBlock_Data();

		/**
		 * The meta object literal for the '<em><b>Prev Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__PREV_HASH = eINSTANCE.getBlock_Prev_Hash();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__HASH = eINSTANCE.getBlock_Hash();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCK = eINSTANCE.getBlock_Block();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INFORMATION = eINSTANCE.getBlock_Information();

		/**
		 * The meta object literal for the '<em><b>Encryptor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ENCRYPTOR = eINSTANCE.getBlock_Encryptor();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__TIMESTAMP = eINSTANCE.getBlock_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Calculate Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___CALCULATE_HASH = eINSTANCE.getBlock__CalculateHash();

		/**
		 * The meta object literal for the '<em><b>Get Block Chain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___GET_BLOCK_CHAIN = eINSTANCE.getBlock__GetBlockChain();

		/**
		 * The meta object literal for the '<em><b>Create Genesis Block</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___CREATE_GENESIS_BLOCK = eINSTANCE.getBlock__CreateGenesisBlock();

		/**
		 * The meta object literal for the '<em><b>Add Block</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___ADD_BLOCK__STRING = eINSTANCE.getBlock__AddBlock__String();

		/**
		 * The meta object literal for the '<em><b>Is Chain Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___IS_CHAIN_VALID = eINSTANCE.getBlock__IsChainValid();

		/**
		 * The meta object literal for the '<em><b>Get Latest Block</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BLOCK___GET_LATEST_BLOCK = eINSTANCE.getBlock__GetLatestBlock();

		/**
		 * The meta object literal for the '{@link blockchain.impl.Students_CredentialImpl <em>Students Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.Students_CredentialImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getStudents_Credential()
		 * @generated
		 */
		EClass STUDENTS_CREDENTIAL = eINSTANCE.getStudents_Credential();

		/**
		 * The meta object literal for the '<em><b>Stu Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENTS_CREDENTIAL__STU_NAME = eINSTANCE.getStudents_Credential_Stu_Name();

		/**
		 * The meta object literal for the '<em><b>Stu Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENTS_CREDENTIAL__STU_PASSWORD = eINSTANCE.getStudents_Credential_Stu_Password();

		/**
		 * The meta object literal for the '<em><b>Stu Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENTS_CREDENTIAL__STU_IMAGE = eINSTANCE.getStudents_Credential_Stu_Image();

		/**
		 * The meta object literal for the '<em><b>Stu Data Encrypt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT = eINSTANCE.getStudents_Credential_StuDataEncrypt();

		/**
		 * The meta object literal for the '<em><b>Stu Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENTS_CREDENTIAL__STU_INFORMATION = eINSTANCE.getStudents_Credential_StuInformation();

		/**
		 * The meta object literal for the '{@link blockchain.impl.UniversitiesImpl <em>Universities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.UniversitiesImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getUniversities()
		 * @generated
		 */
		EClass UNIVERSITIES = eINSTANCE.getUniversities();

		/**
		 * The meta object literal for the '<em><b>Uni Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITIES__UNI_NAME = eINSTANCE.getUniversities_Uni_Name();

		/**
		 * The meta object literal for the '<em><b>Uni Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITIES__UNI_RANK = eINSTANCE.getUniversities_Uni_Rank();

		/**
		 * The meta object literal for the '<em><b>Uni Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITIES__UNI_INFORMATION = eINSTANCE.getUniversities_UniInformation();

		/**
		 * The meta object literal for the '{@link blockchain.impl.ProfessorsImpl <em>Professors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.ProfessorsImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getProfessors()
		 * @generated
		 */
		EClass PROFESSORS = eINSTANCE.getProfessors();

		/**
		 * The meta object literal for the '<em><b>Prof Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSORS__PROF_NAME = eINSTANCE.getProfessors_Prof_Name();

		/**
		 * The meta object literal for the '<em><b>Prof Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSORS__PROF_PASSWORD = eINSTANCE.getProfessors_Prof_Password();

		/**
		 * The meta object literal for the '<em><b>Prof University</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSORS__PROF_UNIVERSITY = eINSTANCE.getProfessors_Prof_University();

		/**
		 * The meta object literal for the '<em><b>Prof Designation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFESSORS__PROF_DESIGNATION = eINSTANCE.getProfessors_Prof_Designation();

		/**
		 * The meta object literal for the '<em><b>Profdata Encrypt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSORS__PROFDATA_ENCRYPT = eINSTANCE.getProfessors_ProfdataEncrypt();

		/**
		 * The meta object literal for the '<em><b>Prof Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFESSORS__PROF_INFORMATION = eINSTANCE.getProfessors_ProfInformation();

		/**
		 * The meta object literal for the '{@link blockchain.impl.Encryptor_SHA256Impl <em>Encryptor SHA256</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.Encryptor_SHA256Impl
		 * @see blockchain.impl.BlockchainPackageImpl#getEncryptor_SHA256()
		 * @generated
		 */
		EClass ENCRYPTOR_SHA256 = eINSTANCE.getEncryptor_SHA256();

		/**
		 * The meta object literal for the '<em><b>Validator Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTOR_SHA256__VALIDATOR_ID = eINSTANCE.getEncryptor_SHA256_Validator_Id();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCRYPTOR_SHA256__BLOCK = eINSTANCE.getEncryptor_SHA256_Block();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTOR_SHA256__KEY = eINSTANCE.getEncryptor_SHA256_Key();

		/**
		 * The meta object literal for the '<em><b>Encrypted data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTOR_SHA256__ENCRYPTED_DATA = eINSTANCE.getEncryptor_SHA256_Encrypted_data();

		/**
		 * The meta object literal for the '<em><b>Hex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTOR_SHA256__HEX = eINSTANCE.getEncryptor_SHA256_Hex();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCRYPTOR_SHA256__BYTES = eINSTANCE.getEncryptor_SHA256_Bytes();

		/**
		 * The meta object literal for the '<em><b>Sha256</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENCRYPTOR_SHA256___SHA256__STRING = eINSTANCE.getEncryptor_SHA256__Sha256__String();

		/**
		 * The meta object literal for the '{@link blockchain.impl.SmartContractImpl <em>Smart Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.SmartContractImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getSmartContract()
		 * @generated
		 */
		EClass SMART_CONTRACT = eINSTANCE.getSmartContract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_CONTRACT__NAME = eINSTANCE.getSmartContract_Name();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CONTRACT__BLOCK = eINSTANCE.getSmartContract_Block();

		/**
		 * The meta object literal for the '<em><b>Verify Student Identity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMART_CONTRACT___VERIFY_STUDENT_IDENTITY__STRING_STRING_STRING = eINSTANCE
				.getSmartContract__VerifyStudentIdentity__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Verify Valid Prof</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMART_CONTRACT___VERIFY_VALID_PROF__STRING_STRING = eINSTANCE
				.getSmartContract__VerifyValidProf__String_String();

		/**
		 * The meta object literal for the '<em><b>Valid Prof</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMART_CONTRACT___VALID_PROF__STRING = eINSTANCE.getSmartContract__ValidProf__String();

		/**
		 * The meta object literal for the '<em><b>Verify Exam Solution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMART_CONTRACT___VERIFY_EXAM_SOLUTION = eINSTANCE.getSmartContract__VerifyExamSolution();

		/**
		 * The meta object literal for the '{@link blockchain.impl.Exam_QuestionsImpl <em>Exam Questions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.Exam_QuestionsImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExam_Questions()
		 * @generated
		 */
		EClass EXAM_QUESTIONS = eINSTANCE.getExam_Questions();

		/**
		 * The meta object literal for the '<em><b>Mcqs based</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_QUESTIONS__MCQS_BASED = eINSTANCE.getExam_Questions_Mcqs_based();

		/**
		 * The meta object literal for the '<em><b>Fill in blank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_QUESTIONS__FILL_IN_BLANK = eINSTANCE.getExam_Questions_Fill_in_blank();

		/**
		 * The meta object literal for the '<em><b>Exam Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_QUESTIONS__EXAM_TYPE = eINSTANCE.getExam_Questions_Exam_Type();

		/**
		 * The meta object literal for the '<em><b>Ques Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_QUESTIONS__QUES_INFORMATION = eINSTANCE.getExam_Questions_QuesInformation();

		/**
		 * The meta object literal for the '<em><b>Validprofessor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_QUESTIONS__VALIDPROFESSOR = eINSTANCE.getExam_Questions_Validprofessor();

		/**
		 * The meta object literal for the '<em><b>Question Encrypt</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_QUESTIONS__QUESTION_ENCRYPT = eINSTANCE.getExam_Questions_QuestionEncrypt();

		/**
		 * The meta object literal for the '{@link blockchain.impl.Exam_SolutionImpl <em>Exam Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.Exam_SolutionImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExam_Solution()
		 * @generated
		 */
		EClass EXAM_SOLUTION = eINSTANCE.getExam_Solution();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_SOLUTION__ANSWERS = eINSTANCE.getExam_Solution_Answers();

		/**
		 * The meta object literal for the '<em><b>Solution Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_SOLUTION__SOLUTION_INFORMATION = eINSTANCE.getExam_Solution_SolutionInformation();

		/**
		 * The meta object literal for the '{@link blockchain.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.InformationImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__DATA = eINSTANCE.getInformation_Data();

		/**
		 * The meta object literal for the '<em><b>Exam network</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION__EXAM_NETWORK = eINSTANCE.getInformation_Exam_network();

		/**
		 * The meta object literal for the '{@link blockchain.impl.Exam_NetworkImpl <em>Exam Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.impl.Exam_NetworkImpl
		 * @see blockchain.impl.BlockchainPackageImpl#getExam_Network()
		 * @generated
		 */
		EClass EXAM_NETWORK = eINSTANCE.getExam_Network();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM_NETWORK__NAME = eINSTANCE.getExam_Network_Name();

		/**
		 * The meta object literal for the '<em><b>Exam network</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_NETWORK__EXAM_NETWORK = eINSTANCE.getExam_Network_Exam_network();

		/**
		 * The meta object literal for the '<em><b>Encryptnetwork</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAM_NETWORK__ENCRYPTNETWORK = eINSTANCE.getExam_Network_Encryptnetwork();

		/**
		 * The meta object literal for the '{@link blockchain.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see blockchain.Type
		 * @see blockchain.impl.BlockchainPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see blockchain.impl.BlockchainPackageImpl#getImage()
		 * @generated
		 */
		EDataType IMAGE = eINSTANCE.getImage();

	}

} //BlockchainPackage
