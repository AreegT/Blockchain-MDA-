/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Information#getData <em>Data</em>}</li>
 *   <li>{@link blockchain.Information#getExam_network <em>Exam network</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see blockchain.BlockchainPackage#getInformation_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link blockchain.Information#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Exam network</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Exam_Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam network</em>' reference list.
	 * @see blockchain.BlockchainPackage#getInformation_Exam_network()
	 * @model required="true"
	 * @generated
	 */
	EList<Exam_Network> getExam_network();

} // Information
