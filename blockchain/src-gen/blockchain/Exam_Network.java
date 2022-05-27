/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Exam_Network#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.Exam_Network#getExam_network <em>Exam network</em>}</li>
 *   <li>{@link blockchain.Exam_Network#getEncryptnetwork <em>Encryptnetwork</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getExam_Network()
 * @model
 * @generated
 */
public interface Exam_Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see blockchain.BlockchainPackage#getExam_Network_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link blockchain.Exam_Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exam network</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Exam_Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam network</em>' reference list.
	 * @see blockchain.BlockchainPackage#getExam_Network_Exam_network()
	 * @model required="true"
	 * @generated
	 */
	EList<Exam_Network> getExam_network();

	/**
	 * Returns the value of the '<em><b>Encryptnetwork</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Encryptor_SHA256}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryptnetwork</em>' reference list.
	 * @see blockchain.BlockchainPackage#getExam_Network_Encryptnetwork()
	 * @model required="true"
	 * @generated
	 */
	EList<Encryptor_SHA256> getEncryptnetwork();

} // Exam_Network
