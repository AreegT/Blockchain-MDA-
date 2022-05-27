/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Universities#getUni_Name <em>Uni Name</em>}</li>
 *   <li>{@link blockchain.Universities#getUni_Rank <em>Uni Rank</em>}</li>
 *   <li>{@link blockchain.Universities#getUniInformation <em>Uni Information</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getUniversities()
 * @model
 * @generated
 */
public interface Universities extends EObject {
	/**
	 * Returns the value of the '<em><b>Uni Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uni Name</em>' attribute.
	 * @see #setUni_Name(String)
	 * @see blockchain.BlockchainPackage#getUniversities_Uni_Name()
	 * @model
	 * @generated
	 */
	String getUni_Name();

	/**
	 * Sets the value of the '{@link blockchain.Universities#getUni_Name <em>Uni Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uni Name</em>' attribute.
	 * @see #getUni_Name()
	 * @generated
	 */
	void setUni_Name(String value);

	/**
	 * Returns the value of the '<em><b>Uni Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uni Rank</em>' attribute.
	 * @see #setUni_Rank(String)
	 * @see blockchain.BlockchainPackage#getUniversities_Uni_Rank()
	 * @model
	 * @generated
	 */
	String getUni_Rank();

	/**
	 * Sets the value of the '{@link blockchain.Universities#getUni_Rank <em>Uni Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uni Rank</em>' attribute.
	 * @see #getUni_Rank()
	 * @generated
	 */
	void setUni_Rank(String value);

	/**
	 * Returns the value of the '<em><b>Uni Information</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uni Information</em>' reference list.
	 * @see blockchain.BlockchainPackage#getUniversities_UniInformation()
	 * @model required="true"
	 * @generated
	 */
	EList<Information> getUniInformation();

} // Universities
