/**
 */
package blockchain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Students Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link blockchain.Students_Credential#getStu_Name <em>Stu Name</em>}</li>
 *   <li>{@link blockchain.Students_Credential#getStu_Password <em>Stu Password</em>}</li>
 *   <li>{@link blockchain.Students_Credential#getStu_Image <em>Stu Image</em>}</li>
 *   <li>{@link blockchain.Students_Credential#getStuDataEncrypt <em>Stu Data Encrypt</em>}</li>
 *   <li>{@link blockchain.Students_Credential#getStuInformation <em>Stu Information</em>}</li>
 * </ul>
 *
 * @see blockchain.BlockchainPackage#getStudents_Credential()
 * @model
 * @generated
 */
public interface Students_Credential extends EObject {
	/**
	 * Returns the value of the '<em><b>Stu Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stu Name</em>' attribute.
	 * @see #setStu_Name(String)
	 * @see blockchain.BlockchainPackage#getStudents_Credential_Stu_Name()
	 * @model
	 * @generated
	 */
	String getStu_Name();

	/**
	 * Sets the value of the '{@link blockchain.Students_Credential#getStu_Name <em>Stu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stu Name</em>' attribute.
	 * @see #getStu_Name()
	 * @generated
	 */
	void setStu_Name(String value);

	/**
	 * Returns the value of the '<em><b>Stu Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stu Password</em>' attribute.
	 * @see #setStu_Password(String)
	 * @see blockchain.BlockchainPackage#getStudents_Credential_Stu_Password()
	 * @model
	 * @generated
	 */
	String getStu_Password();

	/**
	 * Sets the value of the '{@link blockchain.Students_Credential#getStu_Password <em>Stu Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stu Password</em>' attribute.
	 * @see #getStu_Password()
	 * @generated
	 */
	void setStu_Password(String value);

	/**
	 * Returns the value of the '<em><b>Stu Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stu Image</em>' attribute.
	 * @see #setStu_Image(Object)
	 * @see blockchain.BlockchainPackage#getStudents_Credential_Stu_Image()
	 * @model dataType="blockchain.Image"
	 * @generated
	 */
	Object getStu_Image();

	/**
	 * Sets the value of the '{@link blockchain.Students_Credential#getStu_Image <em>Stu Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stu Image</em>' attribute.
	 * @see #getStu_Image()
	 * @generated
	 */
	void setStu_Image(Object value);

	/**
	 * Returns the value of the '<em><b>Stu Data Encrypt</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Encryptor_SHA256}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stu Data Encrypt</em>' reference list.
	 * @see blockchain.BlockchainPackage#getStudents_Credential_StuDataEncrypt()
	 * @model required="true"
	 * @generated
	 */
	EList<Encryptor_SHA256> getStuDataEncrypt();

	/**
	 * Returns the value of the '<em><b>Stu Information</b></em>' reference list.
	 * The list contents are of type {@link blockchain.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stu Information</em>' reference list.
	 * @see blockchain.BlockchainPackage#getStudents_Credential_StuInformation()
	 * @model required="true"
	 * @generated
	 */
	EList<Information> getStuInformation();

} // Students_Credential
