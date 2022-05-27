/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encryptor SHA256</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Encryptor_SHA256#getValidator_Id <em>Validator Id</em>}</li>
 *   <li>{@link blockchain.Encryptor_SHA256#getBlock <em>Block</em>}</li>
 *   <li>{@link blockchain.Encryptor_SHA256#getKey <em>Key</em>}</li>
 *   <li>{@link blockchain.Encryptor_SHA256#getEncrypted_data <em>Encrypted data</em>}</li>
 *   <li>{@link blockchain.Encryptor_SHA256#getHex <em>Hex</em>}</li>
 *   <li>{@link blockchain.Encryptor_SHA256#getBytes <em>Bytes</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getEncryptor_SHA256()
 * @model
 * @generated
 */
public interface Encryptor_SHA256 extends EObject {
	/**
	 * Returns the value of the '<em><b>Validator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validator Id</em>' attribute.
	 * @see #setValidator_Id(String)
	 * @see blockchain.BlockchainPackage#getEncryptor_SHA256_Validator_Id()
	 * @model
	 * @generated
	 */
	String getValidator_Id();

	/**
	 * Sets the value of the '{@link blockchain.Encryptor_SHA256#getValidator_Id <em>Validator Id</em>}' attribute.
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
	 * @see blockchain.BlockchainPackage#getEncryptor_SHA256_Block()
	 * @model required="true"
	 * @generated
	 */
	EList<Block> getBlock();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see blockchain.BlockchainPackage#getEncryptor_SHA256_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link blockchain.Encryptor_SHA256#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Encrypted data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted data</em>' attribute.
	 * @see #setEncrypted_data(String)
	 * @see blockchain.BlockchainPackage#getEncryptor_SHA256_Encrypted_data()
	 * @model
	 * @generated
	 */
	String getEncrypted_data();

	/**
	 * Sets the value of the '{@link blockchain.Encryptor_SHA256#getEncrypted_data <em>Encrypted data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted data</em>' attribute.
	 * @see #getEncrypted_data()
	 * @generated
	 */
	void setEncrypted_data(String value);

	/**
	 * Returns the value of the '<em><b>Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex</em>' attribute.
	 * @see #setHex(String)
	 * @see blockchain.BlockchainPackage#getEncryptor_SHA256_Hex()
	 * @model
	 * @generated
	 */
	String getHex();

	/**
	 * Sets the value of the '{@link blockchain.Encryptor_SHA256#getHex <em>Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex</em>' attribute.
	 * @see #getHex()
	 * @generated
	 */
	void setHex(String value);

	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #setBytes(byte)
	 * @see blockchain.BlockchainPackage#getEncryptor_SHA256_Bytes()
	 * @model required="true"
	 * @generated
	 */
	byte getBytes();

	/**
	 * Sets the value of the '{@link blockchain.Encryptor_SHA256#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(byte value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String sha256(String input);

} // Encryptor_SHA256
