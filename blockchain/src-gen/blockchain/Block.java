/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Block#getBlock_No <em>Block No</em>}</li>
 *   <li>{@link blockchain.Block#getData <em>Data</em>}</li>
 *   <li>{@link blockchain.Block#getPrev_Hash <em>Prev Hash</em>}</li>
 *   <li>{@link blockchain.Block#getHash <em>Hash</em>}</li>
 *   <li>{@link blockchain.Block#getBlock <em>Block</em>}</li>
 *   <li>{@link blockchain.Block#getInformation <em>Information</em>}</li>
 *   <li>{@link blockchain.Block#getEncryptor <em>Encryptor</em>}</li>
 *   <li>{@link blockchain.Block#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>Block No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block No</em>' attribute.
	 * @see #setBlock_No(String)
	 * @see blockchain.BlockchainPackage#getBlock_Block_No()
	 * @model
	 * @generated
	 */
	String getBlock_No();

	/**
	 * Sets the value of the '{@link blockchain.Block#getBlock_No <em>Block No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block No</em>' attribute.
	 * @see #getBlock_No()
	 * @generated
	 */
	void setBlock_No(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see blockchain.BlockchainPackage#getBlock_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link blockchain.Block#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Prev Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Hash</em>' attribute.
	 * @see #setPrev_Hash(String)
	 * @see blockchain.BlockchainPackage#getBlock_Prev_Hash()
	 * @model
	 * @generated
	 */
	String getPrev_Hash();

	/**
	 * Sets the value of the '{@link blockchain.Block#getPrev_Hash <em>Prev Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Hash</em>' attribute.
	 * @see #getPrev_Hash()
	 * @generated
	 */
	void setPrev_Hash(String value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' attribute.
	 * @see #setHash(String)
	 * @see blockchain.BlockchainPackage#getBlock_Hash()
	 * @model
	 * @generated
	 */
	String getHash();

	/**
	 * Sets the value of the '{@link blockchain.Block#getHash <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash</em>' attribute.
	 * @see #getHash()
	 * @generated
	 */
	void setHash(String value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' reference list.
	 * @see blockchain.BlockchainPackage#getBlock_Block()
	 * @model required="true"
	 * @generated
	 */
	EList<Block> getBlock();

	/**
	 * Returns the value of the '<em><b>Information</b></em>' containment reference list.
	 * The list contents are of type {@link blockchain.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' containment reference list.
	 * @see blockchain.BlockchainPackage#getBlock_Information()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Information> getInformation();

	/**
	 * Returns the value of the '<em><b>Encryptor</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Encryptor_SHA256}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryptor</em>' reference list.
	 * @see blockchain.BlockchainPackage#getBlock_Encryptor()
	 * @model required="true"
	 * @generated
	 */
	EList<Encryptor_SHA256> getEncryptor();

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see blockchain.BlockchainPackage#getBlock_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link blockchain.Block#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String calculateHash();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getBlockChain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createGenesisBlock();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addBlock(String Data);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isChainValid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getLatestBlock();

} // Block
