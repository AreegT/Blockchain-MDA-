/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Education System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Online_Education_System#getBlock <em>Block</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getStudents_credential <em>Students credential</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getUniversities <em>Universities</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getProfessors <em>Professors</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getValidator <em>Validator</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getExam_solution <em>Exam solution</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getSmartcontract <em>Smartcontract</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getInformation <em>Information</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getExam_questions <em>Exam questions</em>}</li>
 *   <li>{@link blockchain.Online_Education_System#getExam_network <em>Exam network</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getOnline_Education_System()
 * @model
 * @generated
 */
public interface Online_Education_System extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Block()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlock();

	/**
	 * Returns the value of the '<em><b>Students credential</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Students_Credential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students credential</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Students_credential()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Students_Credential> getStudents_credential();

	/**
	 * Returns the value of the '<em><b>Universities</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Universities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universities</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Universities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Universities> getUniversities();

	/**
	 * Returns the value of the '<em><b>Professors</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Professors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professors</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Professors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Professors> getProfessors();

	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Encryptor_SHA256}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Validator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Encryptor_SHA256> getValidator();

	/**
	 * Returns the value of the '<em><b>Exam solution</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Exam_Solution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam solution</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Exam_solution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Exam_Solution> getExam_solution();

	/**
	 * Returns the value of the '<em><b>Smartcontract</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.SmartContract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smartcontract</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Smartcontract()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SmartContract> getSmartcontract();

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Information()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Information> getInformation();

	/**
	 * Returns the value of the '<em><b>Exam questions</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Exam_Questions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam questions</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Exam_questions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Exam_Questions> getExam_questions();

	/**
	 * Returns the value of the '<em><b>Exam network</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Exam_Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam network</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getOnline_Education_System_Exam_network()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Exam_Network> getExam_network();

} // Online_Education_System
