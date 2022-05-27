/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Professors#getProf_Name <em>Prof Name</em>}</li>
 *   <li>{@link blockchain.Professors#getProf_Password <em>Prof Password</em>}</li>
 *   <li>{@link blockchain.Professors#getProf_University <em>Prof University</em>}</li>
 *   <li>{@link blockchain.Professors#getProf_Designation <em>Prof Designation</em>}</li>
 *   <li>{@link blockchain.Professors#getProfdataEncrypt <em>Profdata Encrypt</em>}</li>
 *   <li>{@link blockchain.Professors#getProfInformation <em>Prof Information</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getProfessors()
 * @model
 * @generated
 */
public interface Professors extends EObject {
	/**
	 * Returns the value of the '<em><b>Prof Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof Name</em>' attribute.
	 * @see #setProf_Name(String)
	 * @see blockchain.BlockchainPackage#getProfessors_Prof_Name()
	 * @model
	 * @generated
	 */
	String getProf_Name();

	/**
	 * Sets the value of the '{@link blockchain.Professors#getProf_Name <em>Prof Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prof Name</em>' attribute.
	 * @see #getProf_Name()
	 * @generated
	 */
	void setProf_Name(String value);

	/**
	 * Returns the value of the '<em><b>Prof Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof Password</em>' attribute.
	 * @see #setProf_Password(String)
	 * @see blockchain.BlockchainPackage#getProfessors_Prof_Password()
	 * @model
	 * @generated
	 */
	String getProf_Password();

	/**
	 * Sets the value of the '{@link blockchain.Professors#getProf_Password <em>Prof Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prof Password</em>' attribute.
	 * @see #getProf_Password()
	 * @generated
	 */
	void setProf_Password(String value);

	/**
	 * Returns the value of the '<em><b>Prof University</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof University</em>' attribute.
	 * @see #setProf_University(String)
	 * @see blockchain.BlockchainPackage#getProfessors_Prof_University()
	 * @model
	 * @generated
	 */
	String getProf_University();

	/**
	 * Sets the value of the '{@link blockchain.Professors#getProf_University <em>Prof University</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prof University</em>' attribute.
	 * @see #getProf_University()
	 * @generated
	 */
	void setProf_University(String value);

	/**
	 * Returns the value of the '<em><b>Prof Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof Designation</em>' attribute.
	 * @see #setProf_Designation(String)
	 * @see blockchain.BlockchainPackage#getProfessors_Prof_Designation()
	 * @model
	 * @generated
	 */
	String getProf_Designation();

	/**
	 * Sets the value of the '{@link blockchain.Professors#getProf_Designation <em>Prof Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prof Designation</em>' attribute.
	 * @see #getProf_Designation()
	 * @generated
	 */
	void setProf_Designation(String value);

	/**
	 * Returns the value of the '<em><b>Profdata Encrypt</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Encryptor_SHA256}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profdata Encrypt</em>' reference list.
	 * @see blockchain.BlockchainPackage#getProfessors_ProfdataEncrypt()
	 * @model required="true"
	 * @generated
	 */
	EList<Encryptor_SHA256> getProfdataEncrypt();

	/**
	 * Returns the value of the '<em><b>Prof Information</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof Information</em>' reference list.
	 * @see blockchain.BlockchainPackage#getProfessors_ProfInformation()
	 * @model required="true"
	 * @generated
	 */
	EList<Information> getProfInformation();

} // Professors
