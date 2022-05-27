/**
 */
package blockchain.util;

import blockchain.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainPackage
 * @generated
 */
public class BlockchainSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockchainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainSwitch() {
		if (modelPackage == null) {
			modelPackage = BlockchainPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM: {
			Online_Education_System online_Education_System = (Online_Education_System) theEObject;
			T result = caseOnline_Education_System(online_Education_System);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.STUDENTS_CREDENTIAL: {
			Students_Credential students_Credential = (Students_Credential) theEObject;
			T result = caseStudents_Credential(students_Credential);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.UNIVERSITIES: {
			Universities universities = (Universities) theEObject;
			T result = caseUniversities(universities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.PROFESSORS: {
			Professors professors = (Professors) theEObject;
			T result = caseProfessors(professors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.ENCRYPTOR_SHA256: {
			Encryptor_SHA256 encryptor_SHA256 = (Encryptor_SHA256) theEObject;
			T result = caseEncryptor_SHA256(encryptor_SHA256);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.SMART_CONTRACT: {
			SmartContract smartContract = (SmartContract) theEObject;
			T result = caseSmartContract(smartContract);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.EXAM_QUESTIONS: {
			Exam_Questions exam_Questions = (Exam_Questions) theEObject;
			T result = caseExam_Questions(exam_Questions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.EXAM_SOLUTION: {
			Exam_Solution exam_Solution = (Exam_Solution) theEObject;
			T result = caseExam_Solution(exam_Solution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.INFORMATION: {
			Information information = (Information) theEObject;
			T result = caseInformation(information);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BlockchainPackage.EXAM_NETWORK: {
			Exam_Network exam_Network = (Exam_Network) theEObject;
			T result = caseExam_Network(exam_Network);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Education System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Education System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnline_Education_System(Online_Education_System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Students Credential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Students Credential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStudents_Credential(Students_Credential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversities(Universities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessors(Professors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryptor SHA256</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryptor SHA256</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptor_SHA256(Encryptor_SHA256 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartContract(SmartContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam Questions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam Questions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam_Questions(Exam_Questions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam_Solution(Exam_Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformation(Information object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam_Network(Exam_Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BlockchainSwitch
