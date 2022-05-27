/**
 */
package blockchain.util;

import blockchain.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see blockchain.BlockchainPackage
 * @generated
 */
public class BlockchainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BlockchainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BlockchainPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockchainSwitch<Adapter> modelSwitch = new BlockchainSwitch<Adapter>() {
		@Override
		public Adapter caseOnline_Education_System(Online_Education_System object) {
			return createOnline_Education_SystemAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseStudents_Credential(Students_Credential object) {
			return createStudents_CredentialAdapter();
		}

		@Override
		public Adapter caseUniversities(Universities object) {
			return createUniversitiesAdapter();
		}

		@Override
		public Adapter caseProfessors(Professors object) {
			return createProfessorsAdapter();
		}

		@Override
		public Adapter caseEncryptor_SHA256(Encryptor_SHA256 object) {
			return createEncryptor_SHA256Adapter();
		}

		@Override
		public Adapter caseSmartContract(SmartContract object) {
			return createSmartContractAdapter();
		}

		@Override
		public Adapter caseExam_Questions(Exam_Questions object) {
			return createExam_QuestionsAdapter();
		}

		@Override
		public Adapter caseExam_Solution(Exam_Solution object) {
			return createExam_SolutionAdapter();
		}

		@Override
		public Adapter caseInformation(Information object) {
			return createInformationAdapter();
		}

		@Override
		public Adapter caseExam_Network(Exam_Network object) {
			return createExam_NetworkAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Online_Education_System <em>Online Education System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Online_Education_System
	 * @generated
	 */
	public Adapter createOnline_Education_SystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Students_Credential <em>Students Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Students_Credential
	 * @generated
	 */
	public Adapter createStudents_CredentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Universities <em>Universities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Universities
	 * @generated
	 */
	public Adapter createUniversitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Professors <em>Professors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Professors
	 * @generated
	 */
	public Adapter createProfessorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Encryptor_SHA256 <em>Encryptor SHA256</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Encryptor_SHA256
	 * @generated
	 */
	public Adapter createEncryptor_SHA256Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.SmartContract <em>Smart Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.SmartContract
	 * @generated
	 */
	public Adapter createSmartContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Exam_Questions <em>Exam Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Exam_Questions
	 * @generated
	 */
	public Adapter createExam_QuestionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Exam_Solution <em>Exam Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Exam_Solution
	 * @generated
	 */
	public Adapter createExam_SolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Information
	 * @generated
	 */
	public Adapter createInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link blockchain.Exam_Network <em>Exam Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see blockchain.Exam_Network
	 * @generated
	 */
	public Adapter createExam_NetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BlockchainAdapterFactory
