/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;
import blockchain.Exam_Network;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.Exam_NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link blockchain.impl.Exam_NetworkImpl#getExam_network <em>Exam network</em>}</li>
 *   <li>{@link blockchain.impl.Exam_NetworkImpl#getEncryptnetwork <em>Encryptnetwork</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Exam_NetworkImpl extends MinimalEObjectImpl.Container implements Exam_Network {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExam_network() <em>Exam network</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_network()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam_Network> exam_network;

	/**
	 * The cached value of the '{@link #getEncryptnetwork() <em>Encryptnetwork</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptnetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<Encryptor_SHA256> encryptnetwork;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Exam_NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.EXAM_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXAM_NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam_Network> getExam_network() {
		if (exam_network == null) {
			exam_network = new EObjectResolvingEList<Exam_Network>(Exam_Network.class, this,
					BlockchainPackage.EXAM_NETWORK__EXAM_NETWORK);
		}
		return exam_network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encryptor_SHA256> getEncryptnetwork() {
		if (encryptnetwork == null) {
			encryptnetwork = new EObjectResolvingEList<Encryptor_SHA256>(Encryptor_SHA256.class, this,
					BlockchainPackage.EXAM_NETWORK__ENCRYPTNETWORK);
		}
		return encryptnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.EXAM_NETWORK__NAME:
			return getName();
		case BlockchainPackage.EXAM_NETWORK__EXAM_NETWORK:
			return getExam_network();
		case BlockchainPackage.EXAM_NETWORK__ENCRYPTNETWORK:
			return getEncryptnetwork();
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
		case BlockchainPackage.EXAM_NETWORK__NAME:
			setName((String) newValue);
			return;
		case BlockchainPackage.EXAM_NETWORK__EXAM_NETWORK:
			getExam_network().clear();
			getExam_network().addAll((Collection<? extends Exam_Network>) newValue);
			return;
		case BlockchainPackage.EXAM_NETWORK__ENCRYPTNETWORK:
			getEncryptnetwork().clear();
			getEncryptnetwork().addAll((Collection<? extends Encryptor_SHA256>) newValue);
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
		case BlockchainPackage.EXAM_NETWORK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BlockchainPackage.EXAM_NETWORK__EXAM_NETWORK:
			getExam_network().clear();
			return;
		case BlockchainPackage.EXAM_NETWORK__ENCRYPTNETWORK:
			getEncryptnetwork().clear();
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
		case BlockchainPackage.EXAM_NETWORK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BlockchainPackage.EXAM_NETWORK__EXAM_NETWORK:
			return exam_network != null && !exam_network.isEmpty();
		case BlockchainPackage.EXAM_NETWORK__ENCRYPTNETWORK:
			return encryptnetwork != null && !encryptnetwork.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Exam_NetworkImpl
