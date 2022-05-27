/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam Questions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Exam_Questions#getMcqs_based <em>Mcqs based</em>}</li>
 *   <li>{@link blockchain.Exam_Questions#isFill_in_blank <em>Fill in blank</em>}</li>
 *   <li>{@link blockchain.Exam_Questions#getExam_Type <em>Exam Type</em>}</li>
 *   <li>{@link blockchain.Exam_Questions#getQuesInformation <em>Ques Information</em>}</li>
 *   <li>{@link blockchain.Exam_Questions#getValidprofessor <em>Validprofessor</em>}</li>
 *   <li>{@link blockchain.Exam_Questions#getQuestionEncrypt <em>Question Encrypt</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExam_Questions()
 * @model
 * @generated
 */
public interface Exam_Questions extends EObject {
	/**
	 * Returns the value of the '<em><b>Mcqs based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcqs based</em>' attribute.
	 * @see #setMcqs_based(String)
	 * @see blockchain.BlockchainPackage#getExam_Questions_Mcqs_based()
	 * @model
	 * @generated
	 */
	String getMcqs_based();

	/**
	 * Sets the value of the '{@link blockchain.Exam_Questions#getMcqs_based <em>Mcqs based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcqs based</em>' attribute.
	 * @see #getMcqs_based()
	 * @generated
	 */
	void setMcqs_based(String value);

	/**
	 * Returns the value of the '<em><b>Fill in blank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill in blank</em>' attribute.
	 * @see #setFill_in_blank(boolean)
	 * @see blockchain.BlockchainPackage#getExam_Questions_Fill_in_blank()
	 * @model required="true"
	 * @generated
	 */
	boolean isFill_in_blank();

	/**
	 * Sets the value of the '{@link blockchain.Exam_Questions#isFill_in_blank <em>Fill in blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill in blank</em>' attribute.
	 * @see #isFill_in_blank()
	 * @generated
	 */
	void setFill_in_blank(boolean value);

	/**
	 * Returns the value of the '<em><b>Exam Type</b></em>' attribute.
	 * The literals are from the enumeration {@link blockchain.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Type</em>' attribute.
	 * @see blockchain.Type
	 * @see #setExam_Type(Type)
	 * @see blockchain.BlockchainPackage#getExam_Questions_Exam_Type()
	 * @model
	 * @generated
	 */
	Type getExam_Type();

	/**
	 * Sets the value of the '{@link blockchain.Exam_Questions#getExam_Type <em>Exam Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam Type</em>' attribute.
	 * @see blockchain.Type
	 * @see #getExam_Type()
	 * @generated
	 */
	void setExam_Type(Type value);

	/**
	 * Returns the value of the '<em><b>Ques Information</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ques Information</em>' reference list.
	 * @see blockchain.BlockchainPackage#getExam_Questions_QuesInformation()
	 * @model required="true"
	 * @generated
	 */
	EList<Information> getQuesInformation();

	/**
	 * Returns the value of the '<em><b>Validprofessor</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Professors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validprofessor</em>' reference list.
	 * @see blockchain.BlockchainPackage#getExam_Questions_Validprofessor()
	 * @model required="true"
	 * @generated
	 */
	EList<Professors> getValidprofessor();

	/**
	 * Returns the value of the '<em><b>Question Encrypt</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Encryptor_SHA256}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Encrypt</em>' reference list.
	 * @see blockchain.BlockchainPackage#getExam_Questions_QuestionEncrypt()
	 * @model required="true"
	 * @generated
	 */
	EList<Encryptor_SHA256> getQuestionEncrypt();

} // Exam_Questions
