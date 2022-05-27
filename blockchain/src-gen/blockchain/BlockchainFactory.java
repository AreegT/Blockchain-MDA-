/**
 */
package blockchain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainPackage
 * @generated
 */
public interface BlockchainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockchainFactory eINSTANCE = blockchain.impl.BlockchainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Online Education System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Online Education System</em>'.
	 * @generated
	 */
	Online_Education_System createOnline_Education_System();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Students Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Students Credential</em>'.
	 * @generated
	 */
	Students_Credential createStudents_Credential();

	/**
	 * Returns a new object of class '<em>Universities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universities</em>'.
	 * @generated
	 */
	Universities createUniversities();

	/**
	 * Returns a new object of class '<em>Professors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professors</em>'.
	 * @generated
	 */
	Professors createProfessors();

	/**
	 * Returns a new object of class '<em>Encryptor SHA256</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encryptor SHA256</em>'.
	 * @generated
	 */
	Encryptor_SHA256 createEncryptor_SHA256();

	/**
	 * Returns a new object of class '<em>Smart Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Contract</em>'.
	 * @generated
	 */
	SmartContract createSmartContract();

	/**
	 * Returns a new object of class '<em>Exam Questions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam Questions</em>'.
	 * @generated
	 */
	Exam_Questions createExam_Questions();

	/**
	 * Returns a new object of class '<em>Exam Solution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam Solution</em>'.
	 * @generated
	 */
	Exam_Solution createExam_Solution();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Exam Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam Network</em>'.
	 * @generated
	 */
	Exam_Network createExam_Network();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BlockchainPackage getBlockchainPackage();

} //BlockchainFactory
