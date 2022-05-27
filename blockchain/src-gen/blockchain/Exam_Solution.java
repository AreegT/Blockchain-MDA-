/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Exam_Solution#getAnswers <em>Answers</em>}</li>
 *   <li>{@link blockchain.Exam_Solution#getSolutionInformation <em>Solution Information</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExam_Solution()
 * @model
 * @generated
 */
public interface Exam_Solution extends EObject {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' attribute.
	 * @see #setAnswers(String)
	 * @see blockchain.BlockchainPackage#getExam_Solution_Answers()
	 * @model
	 * @generated
	 */
	String getAnswers();

	/**
	 * Sets the value of the '{@link blockchain.Exam_Solution#getAnswers <em>Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answers</em>' attribute.
	 * @see #getAnswers()
	 * @generated
	 */
	void setAnswers(String value);

	/**
	 * Returns the value of the '<em><b>Solution Information</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Information</em>' reference list.
	 * @see blockchain.BlockchainPackage#getExam_Solution_SolutionInformation()
	 * @model required="true"
	 * @generated
	 */
	EList<Information> getSolutionInformation();

} // Exam_Solution
