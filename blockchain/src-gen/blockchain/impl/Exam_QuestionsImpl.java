/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;
import blockchain.Exam_Questions;
import blockchain.Information;
import blockchain.Professors;
import blockchain.Type;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam Questions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.Exam_QuestionsImpl#getMcqs_based <em>Mcqs based</em>}</li>
 *   <li>{@link blockchain.impl.Exam_QuestionsImpl#isFill_in_blank <em>Fill in blank</em>}</li>
 *   <li>{@link blockchain.impl.Exam_QuestionsImpl#getExam_Type <em>Exam Type</em>}</li>
 *   <li>{@link blockchain.impl.Exam_QuestionsImpl#getQuesInformation <em>Ques Information</em>}</li>
 *   <li>{@link blockchain.impl.Exam_QuestionsImpl#getValidprofessor <em>Validprofessor</em>}</li>
 *   <li>{@link blockchain.impl.Exam_QuestionsImpl#getQuestionEncrypt <em>Question Encrypt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Exam_QuestionsImpl extends MinimalEObjectImpl.Container implements Exam_Questions {
	/**
	 * The default value of the '{@link #getMcqs_based() <em>Mcqs based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcqs_based()
	 * @generated
	 * @ordered
	 */
	protected static final String MCQS_BASED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMcqs_based() <em>Mcqs based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcqs_based()
	 * @generated
	 * @ordered
	 */
	protected String mcqs_based = MCQS_BASED_EDEFAULT;

	/**
	 * The default value of the '{@link #isFill_in_blank() <em>Fill in blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill_in_blank()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_IN_BLANK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFill_in_blank() <em>Fill in blank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFill_in_blank()
	 * @generated
	 * @ordered
	 */
	protected boolean fill_in_blank = FILL_IN_BLANK_EDEFAULT;

	/**
	 * The default value of the '{@link #getExam_Type() <em>Exam Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_Type()
	 * @generated
	 * @ordered
	 */
	protected static final Type EXAM_TYPE_EDEFAULT = Type.EXTERNAL_EXAM;

	/**
	 * The cached value of the '{@link #getExam_Type() <em>Exam Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam_Type()
	 * @generated
	 * @ordered
	 */
	protected Type exam_Type = EXAM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuesInformation() <em>Ques Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuesInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> quesInformation;

	/**
	 * The cached value of the '{@link #getValidprofessor() <em>Validprofessor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidprofessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Professors> validprofessor;

	/**
	 * The cached value of the '{@link #getQuestionEncrypt() <em>Question Encrypt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionEncrypt()
	 * @generated
	 * @ordered
	 */
	protected EList<Encryptor_SHA256> questionEncrypt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Exam_QuestionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.EXAM_QUESTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMcqs_based() {
		return mcqs_based;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMcqs_based(String newMcqs_based) {
		String oldMcqs_based = mcqs_based;
		mcqs_based = newMcqs_based;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXAM_QUESTIONS__MCQS_BASED,
					oldMcqs_based, mcqs_based));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFill_in_blank() {
		return fill_in_blank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill_in_blank(boolean newFill_in_blank) {
		boolean oldFill_in_blank = fill_in_blank;
		fill_in_blank = newFill_in_blank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXAM_QUESTIONS__FILL_IN_BLANK,
					oldFill_in_blank, fill_in_blank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getExam_Type() {
		return exam_Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExam_Type(Type newExam_Type) {
		Type oldExam_Type = exam_Type;
		exam_Type = newExam_Type == null ? EXAM_TYPE_EDEFAULT : newExam_Type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXAM_QUESTIONS__EXAM_TYPE,
					oldExam_Type, exam_Type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getQuesInformation() {
		if (quesInformation == null) {
			quesInformation = new EObjectResolvingEList<Information>(Information.class, this,
					BlockchainPackage.EXAM_QUESTIONS__QUES_INFORMATION);
		}
		return quesInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professors> getValidprofessor() {
		if (validprofessor == null) {
			validprofessor = new EObjectResolvingEList<Professors>(Professors.class, this,
					BlockchainPackage.EXAM_QUESTIONS__VALIDPROFESSOR);
		}
		return validprofessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encryptor_SHA256> getQuestionEncrypt() {
		if (questionEncrypt == null) {
			questionEncrypt = new EObjectResolvingEList<Encryptor_SHA256>(Encryptor_SHA256.class, this,
					BlockchainPackage.EXAM_QUESTIONS__QUESTION_ENCRYPT);
		}
		return questionEncrypt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.EXAM_QUESTIONS__MCQS_BASED:
			return getMcqs_based();
		case BlockchainPackage.EXAM_QUESTIONS__FILL_IN_BLANK:
			return isFill_in_blank();
		case BlockchainPackage.EXAM_QUESTIONS__EXAM_TYPE:
			return getExam_Type();
		case BlockchainPackage.EXAM_QUESTIONS__QUES_INFORMATION:
			return getQuesInformation();
		case BlockchainPackage.EXAM_QUESTIONS__VALIDPROFESSOR:
			return getValidprofessor();
		case BlockchainPackage.EXAM_QUESTIONS__QUESTION_ENCRYPT:
			return getQuestionEncrypt();
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
		case BlockchainPackage.EXAM_QUESTIONS__MCQS_BASED:
			setMcqs_based((String) newValue);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__FILL_IN_BLANK:
			setFill_in_blank((Boolean) newValue);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__EXAM_TYPE:
			setExam_Type((Type) newValue);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__QUES_INFORMATION:
			getQuesInformation().clear();
			getQuesInformation().addAll((Collection<? extends Information>) newValue);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__VALIDPROFESSOR:
			getValidprofessor().clear();
			getValidprofessor().addAll((Collection<? extends Professors>) newValue);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__QUESTION_ENCRYPT:
			getQuestionEncrypt().clear();
			getQuestionEncrypt().addAll((Collection<? extends Encryptor_SHA256>) newValue);
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
		case BlockchainPackage.EXAM_QUESTIONS__MCQS_BASED:
			setMcqs_based(MCQS_BASED_EDEFAULT);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__FILL_IN_BLANK:
			setFill_in_blank(FILL_IN_BLANK_EDEFAULT);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__EXAM_TYPE:
			setExam_Type(EXAM_TYPE_EDEFAULT);
			return;
		case BlockchainPackage.EXAM_QUESTIONS__QUES_INFORMATION:
			getQuesInformation().clear();
			return;
		case BlockchainPackage.EXAM_QUESTIONS__VALIDPROFESSOR:
			getValidprofessor().clear();
			return;
		case BlockchainPackage.EXAM_QUESTIONS__QUESTION_ENCRYPT:
			getQuestionEncrypt().clear();
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
		case BlockchainPackage.EXAM_QUESTIONS__MCQS_BASED:
			return MCQS_BASED_EDEFAULT == null ? mcqs_based != null : !MCQS_BASED_EDEFAULT.equals(mcqs_based);
		case BlockchainPackage.EXAM_QUESTIONS__FILL_IN_BLANK:
			return fill_in_blank != FILL_IN_BLANK_EDEFAULT;
		case BlockchainPackage.EXAM_QUESTIONS__EXAM_TYPE:
			return exam_Type != EXAM_TYPE_EDEFAULT;
		case BlockchainPackage.EXAM_QUESTIONS__QUES_INFORMATION:
			return quesInformation != null && !quesInformation.isEmpty();
		case BlockchainPackage.EXAM_QUESTIONS__VALIDPROFESSOR:
			return validprofessor != null && !validprofessor.isEmpty();
		case BlockchainPackage.EXAM_QUESTIONS__QUESTION_ENCRYPT:
			return questionEncrypt != null && !questionEncrypt.isEmpty();
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
		result.append(" (Mcqs_based: ");
		result.append(mcqs_based);
		result.append(", Fill_in_blank: ");
		result.append(fill_in_blank);
		result.append(", Exam_Type: ");
		result.append(exam_Type);
		result.append(')');
		return result.toString();
	}

} //Exam_QuestionsImpl
