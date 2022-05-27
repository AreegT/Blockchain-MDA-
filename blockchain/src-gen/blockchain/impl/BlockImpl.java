/**
 */
package blockchain.impl;

import blockchain.Block;
import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;
import blockchain.Information;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.BlockImpl#getBlock_No <em>Block No</em>}</li>
 *   <li>{@link blockchain.impl.BlockImpl#getData <em>Data</em>}</li>
 *   <li>{@link blockchain.impl.BlockImpl#getPrev_Hash <em>Prev Hash</em>}</li>
 *   <li>{@link blockchain.impl.BlockImpl#getHash <em>Hash</em>}</li>
 *   <li>{@link blockchain.impl.BlockImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link blockchain.impl.BlockImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link blockchain.impl.BlockImpl#getEncryptor <em>Encryptor</em>}</li>
 *   <li>{@link blockchain.impl.BlockImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The default value of the '{@link #getBlock_No() <em>Block No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock_No()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlock_No() <em>Block No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock_No()
	 * @generated
	 * @ordered
	 */
	protected String block_No = BLOCK_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrev_Hash() <em>Prev Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev_Hash()
	 * @generated
	 * @ordered
	 */
	protected static final String PREV_HASH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrev_Hash() <em>Prev Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev_Hash()
	 * @generated
	 * @ordered
	 */
	protected String prev_Hash = PREV_HASH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected static final String HASH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHash() <em>Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHash()
	 * @generated
	 * @ordered
	 */
	protected String hash = HASH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> block;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> information;

	/**
	 * The cached value of the '{@link #getEncryptor() <em>Encryptor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Encryptor_SHA256> encryptor;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlock_No() {
		return block_No;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock_No(String newBlock_No) {
		String oldBlock_No = block_No;
		block_No = newBlock_No;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.BLOCK__BLOCK_NO, oldBlock_No,
					block_No));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.BLOCK__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrev_Hash() {
		return prev_Hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev_Hash(String newPrev_Hash) {
		String oldPrev_Hash = prev_Hash;
		prev_Hash = newPrev_Hash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.BLOCK__PREV_HASH, oldPrev_Hash,
					prev_Hash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHash(String newHash) {
		String oldHash = hash;
		hash = newHash;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.BLOCK__HASH, oldHash, hash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlock() {
		if (block == null) {
			block = new EObjectResolvingEList<Block>(Block.class, this, BlockchainPackage.BLOCK__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getInformation() {
		if (information == null) {
			information = new EObjectContainmentEList<Information>(Information.class, this,
					BlockchainPackage.BLOCK__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encryptor_SHA256> getEncryptor() {
		if (encryptor == null) {
			encryptor = new EObjectResolvingEList<Encryptor_SHA256>(Encryptor_SHA256.class, this,
					BlockchainPackage.BLOCK__ENCRYPTOR);
		}
		return encryptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.BLOCK__TIMESTAMP, oldTimestamp,
					timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String calculateHash() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBlockChain() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createGenesisBlock() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBlock(String Data) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChainValid() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getLatestBlock() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockchainPackage.BLOCK__INFORMATION:
			return ((InternalEList<?>) getInformation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.BLOCK__BLOCK_NO:
			return getBlock_No();
		case BlockchainPackage.BLOCK__DATA:
			return getData();
		case BlockchainPackage.BLOCK__PREV_HASH:
			return getPrev_Hash();
		case BlockchainPackage.BLOCK__HASH:
			return getHash();
		case BlockchainPackage.BLOCK__BLOCK:
			return getBlock();
		case BlockchainPackage.BLOCK__INFORMATION:
			return getInformation();
		case BlockchainPackage.BLOCK__ENCRYPTOR:
			return getEncryptor();
		case BlockchainPackage.BLOCK__TIMESTAMP:
			return getTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BlockchainPackage.BLOCK__BLOCK_NO:
			setBlock_No((String) newValue);
			return;
		case BlockchainPackage.BLOCK__DATA:
			setData((String) newValue);
			return;
		case BlockchainPackage.BLOCK__PREV_HASH:
			setPrev_Hash((String) newValue);
			return;
		case BlockchainPackage.BLOCK__HASH:
			setHash((String) newValue);
			return;
		case BlockchainPackage.BLOCK__BLOCK:
			getBlock().clear();
			getBlock().addAll((Collection<? extends Block>) newValue);
			return;
		case BlockchainPackage.BLOCK__INFORMATION:
			getInformation().clear();
			getInformation().addAll((Collection<? extends Information>) newValue);
			return;
		case BlockchainPackage.BLOCK__ENCRYPTOR:
			getEncryptor().clear();
			getEncryptor().addAll((Collection<? extends Encryptor_SHA256>) newValue);
			return;
		case BlockchainPackage.BLOCK__TIMESTAMP:
			setTimestamp((Long) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BlockchainPackage.BLOCK__BLOCK_NO:
			setBlock_No(BLOCK_NO_EDEFAULT);
			return;
		case BlockchainPackage.BLOCK__DATA:
			setData(DATA_EDEFAULT);
			return;
		case BlockchainPackage.BLOCK__PREV_HASH:
			setPrev_Hash(PREV_HASH_EDEFAULT);
			return;
		case BlockchainPackage.BLOCK__HASH:
			setHash(HASH_EDEFAULT);
			return;
		case BlockchainPackage.BLOCK__BLOCK:
			getBlock().clear();
			return;
		case BlockchainPackage.BLOCK__INFORMATION:
			getInformation().clear();
			return;
		case BlockchainPackage.BLOCK__ENCRYPTOR:
			getEncryptor().clear();
			return;
		case BlockchainPackage.BLOCK__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BlockchainPackage.BLOCK__BLOCK_NO:
			return BLOCK_NO_EDEFAULT == null ? block_No != null : !BLOCK_NO_EDEFAULT.equals(block_No);
		case BlockchainPackage.BLOCK__DATA:
			return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
		case BlockchainPackage.BLOCK__PREV_HASH:
			return PREV_HASH_EDEFAULT == null ? prev_Hash != null : !PREV_HASH_EDEFAULT.equals(prev_Hash);
		case BlockchainPackage.BLOCK__HASH:
			return HASH_EDEFAULT == null ? hash != null : !HASH_EDEFAULT.equals(hash);
		case BlockchainPackage.BLOCK__BLOCK:
			return block != null && !block.isEmpty();
		case BlockchainPackage.BLOCK__INFORMATION:
			return information != null && !information.isEmpty();
		case BlockchainPackage.BLOCK__ENCRYPTOR:
			return encryptor != null && !encryptor.isEmpty();
		case BlockchainPackage.BLOCK__TIMESTAMP:
			return timestamp != TIMESTAMP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BlockchainPackage.BLOCK___CALCULATE_HASH:
			return calculateHash();
		case BlockchainPackage.BLOCK___GET_BLOCK_CHAIN:
			getBlockChain();
			return null;
		case BlockchainPackage.BLOCK___CREATE_GENESIS_BLOCK:
			createGenesisBlock();
			return null;
		case BlockchainPackage.BLOCK___ADD_BLOCK__STRING:
			addBlock((String) arguments.get(0));
			return null;
		case BlockchainPackage.BLOCK___IS_CHAIN_VALID:
			return isChainValid();
		case BlockchainPackage.BLOCK___GET_LATEST_BLOCK:
			getLatestBlock();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Block_No: ");
		result.append(block_No);
		result.append(", Data: ");
		result.append(data);
		result.append(", Prev_Hash: ");
		result.append(prev_Hash);
		result.append(", Hash: ");
		result.append(hash);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
