/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Exam_Solution;
import blockchain.Information;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.Exam_SolutionImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link blockchain.impl.Exam_SolutionImpl#getSolutionInformation <em>Solution Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Exam_SolutionImpl extends MinimalEObjectImpl.Container implements Exam_Solution {
	/**
	 * The default value of the '{@link #getAnswers() <em>Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final String ANSWERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected String answers = ANSWERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolutionInformation() <em>Solution Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> solutionInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Exam_SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.EXAM_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnswers() {
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswers(String newAnswers) {
		String oldAnswers = answers;
		answers = newAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.EXAM_SOLUTION__ANSWERS, oldAnswers,
					answers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getSolutionInformation() {
		if (solutionInformation == null) {
			solutionInformation = new EObjectResolvingEList<Information>(Information.class, this,
					BlockchainPackage.EXAM_SOLUTION__SOLUTION_INFORMATION);
		}
		return solutionInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.EXAM_SOLUTION__ANSWERS:
			return getAnswers();
		case BlockchainPackage.EXAM_SOLUTION__SOLUTION_INFORMATION:
			return getSolutionInformation();
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
		case BlockchainPackage.EXAM_SOLUTION__ANSWERS:
			setAnswers((String) newValue);
			return;
		case BlockchainPackage.EXAM_SOLUTION__SOLUTION_INFORMATION:
			getSolutionInformation().clear();
			getSolutionInformation().addAll((Collection<? extends Information>) newValue);
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
		case BlockchainPackage.EXAM_SOLUTION__ANSWERS:
			setAnswers(ANSWERS_EDEFAULT);
			return;
		case BlockchainPackage.EXAM_SOLUTION__SOLUTION_INFORMATION:
			getSolutionInformation().clear();
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
		case BlockchainPackage.EXAM_SOLUTION__ANSWERS:
			return ANSWERS_EDEFAULT == null ? answers != null : !ANSWERS_EDEFAULT.equals(answers);
		case BlockchainPackage.EXAM_SOLUTION__SOLUTION_INFORMATION:
			return solutionInformation != null && !solutionInformation.isEmpty();
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
		result.append(" (answers: ");
		result.append(answers);
		result.append(')');
		return result.toString();
	}

} //Exam_SolutionImpl
