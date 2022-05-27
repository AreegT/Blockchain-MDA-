/**
 */
package blockchain.impl;

import blockchain.Block;
import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encryptor SHA256</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.Encryptor_SHA256Impl#getValidator_Id <em>Validator Id</em>}</li>
 *   <li>{@link blockchain.impl.Encryptor_SHA256Impl#getBlock <em>Block</em>}</li>
 *   <li>{@link blockchain.impl.Encryptor_SHA256Impl#getKey <em>Key</em>}</li>
 *   <li>{@link blockchain.impl.Encryptor_SHA256Impl#getEncrypted_data <em>Encrypted data</em>}</li>
 *   <li>{@link blockchain.impl.Encryptor_SHA256Impl#getHex <em>Hex</em>}</li>
 *   <li>{@link blockchain.impl.Encryptor_SHA256Impl#getBytes <em>Bytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Encryptor_SHA256Impl extends MinimalEObjectImpl.Container implements Encryptor_SHA256 {
	/**
	 * The default value of the '{@link #getValidator_Id() <em>Validator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator_Id()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidator_Id() <em>Validator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator_Id()
	 * @generated
	 * @ordered
	 */
	protected String validator_Id = VALIDATOR_ID_EDEFAULT;

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
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncrypted_data() <em>Encrypted data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncrypted_data()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncrypted_data() <em>Encrypted data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncrypted_data()
	 * @generated
	 * @ordered
	 */
	protected String encrypted_data = ENCRYPTED_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getHex() <em>Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHex()
	 * @generated
	 * @ordered
	 */
	protected static final String HEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHex() <em>Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHex()
	 * @generated
	 * @ordered
	 */
	protected String hex = HEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected static final byte BYTES_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected byte bytes = BYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Encryptor_SHA256Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.ENCRYPTOR_SHA256;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidator_Id() {
		return validator_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidator_Id(String newValidator_Id) {
		String oldValidator_Id = validator_Id;
		validator_Id = newValidator_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.ENCRYPTOR_SHA256__VALIDATOR_ID,
					oldValidator_Id, validator_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlock() {
		if (block == null) {
			block = new EObjectResolvingEList<Block>(Block.class, this, BlockchainPackage.ENCRYPTOR_SHA256__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.ENCRYPTOR_SHA256__KEY, oldKey,
					key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncrypted_data() {
		return encrypted_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncrypted_data(String newEncrypted_data) {
		String oldEncrypted_data = encrypted_data;
		encrypted_data = newEncrypted_data;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.ENCRYPTOR_SHA256__ENCRYPTED_DATA,
					oldEncrypted_data, encrypted_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHex() {
		return hex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHex(String newHex) {
		String oldHex = hex;
		hex = newHex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.ENCRYPTOR_SHA256__HEX, oldHex,
					hex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getBytes() {
		return bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBytes(byte newBytes) {
		byte oldBytes = bytes;
		bytes = newBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.ENCRYPTOR_SHA256__BYTES, oldBytes,
					bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String sha256(String input) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.ENCRYPTOR_SHA256__VALIDATOR_ID:
			return getValidator_Id();
		case BlockchainPackage.ENCRYPTOR_SHA256__BLOCK:
			return getBlock();
		case BlockchainPackage.ENCRYPTOR_SHA256__KEY:
			return getKey();
		case BlockchainPackage.ENCRYPTOR_SHA256__ENCRYPTED_DATA:
			return getEncrypted_data();
		case BlockchainPackage.ENCRYPTOR_SHA256__HEX:
			return getHex();
		case BlockchainPackage.ENCRYPTOR_SHA256__BYTES:
			return getBytes();
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
		case BlockchainPackage.ENCRYPTOR_SHA256__VALIDATOR_ID:
			setValidator_Id((String) newValue);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__BLOCK:
			getBlock().clear();
			getBlock().addAll((Collection<? extends Block>) newValue);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__KEY:
			setKey((String) newValue);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__ENCRYPTED_DATA:
			setEncrypted_data((String) newValue);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__HEX:
			setHex((String) newValue);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__BYTES:
			setBytes((Byte) newValue);
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
		case BlockchainPackage.ENCRYPTOR_SHA256__VALIDATOR_ID:
			setValidator_Id(VALIDATOR_ID_EDEFAULT);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__BLOCK:
			getBlock().clear();
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__KEY:
			setKey(KEY_EDEFAULT);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__ENCRYPTED_DATA:
			setEncrypted_data(ENCRYPTED_DATA_EDEFAULT);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__HEX:
			setHex(HEX_EDEFAULT);
			return;
		case BlockchainPackage.ENCRYPTOR_SHA256__BYTES:
			setBytes(BYTES_EDEFAULT);
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
		case BlockchainPackage.ENCRYPTOR_SHA256__VALIDATOR_ID:
			return VALIDATOR_ID_EDEFAULT == null ? validator_Id != null : !VALIDATOR_ID_EDEFAULT.equals(validator_Id);
		case BlockchainPackage.ENCRYPTOR_SHA256__BLOCK:
			return block != null && !block.isEmpty();
		case BlockchainPackage.ENCRYPTOR_SHA256__KEY:
			return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
		case BlockchainPackage.ENCRYPTOR_SHA256__ENCRYPTED_DATA:
			return ENCRYPTED_DATA_EDEFAULT == null ? encrypted_data != null
					: !ENCRYPTED_DATA_EDEFAULT.equals(encrypted_data);
		case BlockchainPackage.ENCRYPTOR_SHA256__HEX:
			return HEX_EDEFAULT == null ? hex != null : !HEX_EDEFAULT.equals(hex);
		case BlockchainPackage.ENCRYPTOR_SHA256__BYTES:
			return bytes != BYTES_EDEFAULT;
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
		case BlockchainPackage.ENCRYPTOR_SHA256___SHA256__STRING:
			return sha256((String) arguments.get(0));
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
		result.append(" (Validator_Id: ");
		result.append(validator_Id);
		result.append(", key: ");
		result.append(key);
		result.append(", Encrypted_data: ");
		result.append(encrypted_data);
		result.append(", hex: ");
		result.append(hex);
		result.append(", bytes: ");
		result.append(bytes);
		result.append(')');
		return result.toString();
	}

} //Encryptor_SHA256Impl
