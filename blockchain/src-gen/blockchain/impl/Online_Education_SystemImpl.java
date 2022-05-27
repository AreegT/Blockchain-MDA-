/**
 */
package blockchain.impl;

import blockchain.Block;
import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;
import blockchain.Exam_Network;
import blockchain.Exam_Questions;
import blockchain.Exam_Solution;
import blockchain.Information;
import blockchain.Online_Education_System;
import blockchain.Professors;
import blockchain.SmartContract;
import blockchain.Students_Credential;
import blockchain.Universities;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online Education System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getStudents_credential <em>Students credential</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getUniversities <em>Universities</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getProfessors <em>Professors</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getValidator <em>Validator</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getExam_solution <em>Exam solution</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getSmartcontract <em>Smartcontract</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getExam_questions <em>Exam questions</em>}</li>
 *   <li>{@link blockchain.impl.Online_Education_SystemImpl#getExam_network <em>Exam network</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Online_Education_SystemImpl extends MinimalEObjectImpl.Container implements Online_Education_System {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> block;

	/**
	 * The cached value of the '{@link #getStudents_credential() <em>Students credential</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents_credential()
	 * @generated
	 * @ordered
	 */
	protected EList<Students_Credential> students_credential;

	/**
	 * The cached value of the '{@link #getUniversities() <em>Universities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversities()
	 * @generated
	 * @ordered
	 */
	protected EList<Universities> universities;

	/**
	 * The cached value of the '{@link #getProfessors() <em>Professors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Professors> professors;

	/**
	 * The cached value of the '{@link #getValidator() <em>Validator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator()
	 * @generated
	 * @ordered
	 */
	protected EList<Encryptor_SHA256> validator;

	/**
	 * The cached value of the '{@link #getExam_solution() <em>Exam solution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_solution()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam_Solution> exam_solution;

	/**
	 * The cached value of the '{@link #getSmartcontract() <em>Smartcontract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartcontract()
	 * @generated
	 * @ordered
	 */
	protected EList<SmartContract> smartcontract;

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
	 * The cached value of the '{@link #getExam_questions() <em>Exam questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_questions()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam_Questions> exam_questions;

	/**
	 * The cached value of the '{@link #getExam_network() <em>Exam network</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_network()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam_Network> exam_network;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Online_Education_SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<Block>(Block.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Students_Credential> getStudents_credential() {
		if (students_credential == null) {
			students_credential = new EObjectContainmentEList<Students_Credential>(Students_Credential.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL);
		}
		return students_credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Universities> getUniversities() {
		if (universities == null) {
			universities = new EObjectContainmentEList<Universities>(Universities.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES);
		}
		return universities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professors> getProfessors() {
		if (professors == null) {
			professors = new EObjectContainmentEList<Professors>(Professors.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__PROFESSORS);
		}
		return professors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encryptor_SHA256> getValidator() {
		if (validator == null) {
			validator = new EObjectContainmentEList<Encryptor_SHA256>(Encryptor_SHA256.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__VALIDATOR);
		}
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam_Solution> getExam_solution() {
		if (exam_solution == null) {
			exam_solution = new EObjectContainmentEList<Exam_Solution>(Exam_Solution.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION);
		}
		return exam_solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmartContract> getSmartcontract() {
		if (smartcontract == null) {
			smartcontract = new EObjectContainmentEList<SmartContract>(SmartContract.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT);
		}
		return smartcontract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getInformation() {
		if (information == null) {
			information = new EObjectContainmentEList<Information>(Information.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam_Questions> getExam_questions() {
		if (exam_questions == null) {
			exam_questions = new EObjectContainmentEList<Exam_Questions>(Exam_Questions.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS);
		}
		return exam_questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam_Network> getExam_network() {
		if (exam_network == null) {
			exam_network = new EObjectContainmentEList<Exam_Network>(Exam_Network.class, this,
					BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK);
		}
		return exam_network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__BLOCK:
			return ((InternalEList<?>) getBlock()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL:
			return ((InternalEList<?>) getStudents_credential()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES:
			return ((InternalEList<?>) getUniversities()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__PROFESSORS:
			return ((InternalEList<?>) getProfessors()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__VALIDATOR:
			return ((InternalEList<?>) getValidator()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION:
			return ((InternalEList<?>) getExam_solution()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT:
			return ((InternalEList<?>) getSmartcontract()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__INFORMATION:
			return ((InternalEList<?>) getInformation()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS:
			return ((InternalEList<?>) getExam_questions()).basicRemove(otherEnd, msgs);
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK:
			return ((InternalEList<?>) getExam_network()).basicRemove(otherEnd, msgs);
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
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__BLOCK:
			return getBlock();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL:
			return getStudents_credential();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES:
			return getUniversities();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__PROFESSORS:
			return getProfessors();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__VALIDATOR:
			return getValidator();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION:
			return getExam_solution();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT:
			return getSmartcontract();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__INFORMATION:
			return getInformation();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS:
			return getExam_questions();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK:
			return getExam_network();
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
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__BLOCK:
			getBlock().clear();
			getBlock().addAll((Collection<? extends Block>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL:
			getStudents_credential().clear();
			getStudents_credential().addAll((Collection<? extends Students_Credential>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES:
			getUniversities().clear();
			getUniversities().addAll((Collection<? extends Universities>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__PROFESSORS:
			getProfessors().clear();
			getProfessors().addAll((Collection<? extends Professors>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__VALIDATOR:
			getValidator().clear();
			getValidator().addAll((Collection<? extends Encryptor_SHA256>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION:
			getExam_solution().clear();
			getExam_solution().addAll((Collection<? extends Exam_Solution>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT:
			getSmartcontract().clear();
			getSmartcontract().addAll((Collection<? extends SmartContract>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__INFORMATION:
			getInformation().clear();
			getInformation().addAll((Collection<? extends Information>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS:
			getExam_questions().clear();
			getExam_questions().addAll((Collection<? extends Exam_Questions>) newValue);
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK:
			getExam_network().clear();
			getExam_network().addAll((Collection<? extends Exam_Network>) newValue);
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
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__BLOCK:
			getBlock().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL:
			getStudents_credential().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES:
			getUniversities().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__PROFESSORS:
			getProfessors().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__VALIDATOR:
			getValidator().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION:
			getExam_solution().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT:
			getSmartcontract().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__INFORMATION:
			getInformation().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS:
			getExam_questions().clear();
			return;
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK:
			getExam_network().clear();
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
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__BLOCK:
			return block != null && !block.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL:
			return students_credential != null && !students_credential.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES:
			return universities != null && !universities.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__PROFESSORS:
			return professors != null && !professors.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__VALIDATOR:
			return validator != null && !validator.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION:
			return exam_solution != null && !exam_solution.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT:
			return smartcontract != null && !smartcontract.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__INFORMATION:
			return information != null && !information.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS:
			return exam_questions != null && !exam_questions.isEmpty();
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK:
			return exam_network != null && !exam_network.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Online_Education_SystemImpl
