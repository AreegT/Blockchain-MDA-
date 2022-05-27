/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Validator#getValidator_Id <em>Validator Id</em>}</li>
 *   <li>{@link blockchain.Validator#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getValidator()
 * @model
 * @generated
 */
public interface Validator extends EObject {
	/**
	 * Returns the value of the '<em><b>Validator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Id</em>' attribute.
	 * @see #setValidator_Id(String)
	 * @see blockchain.BlockchainPackage#getValidator_Validator_Id()
	 * @model
	 * @generated
	 */
	String getValidator_Id();

	/**
	 * Sets the value of the '{@link blockchain.Validator#getValidator_Id <em>Validator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator Id</em>' attribute.
	 * @see #getValidator_Id()
	 * @generated
	 */
	void setValidator_Id(String value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference list.
	 * @see blockchain.BlockchainPackage#getValidator_Block()
	 * @model required="true"
	 * @generated
	 */
	EList<Block> getBlock();

} // Validator
