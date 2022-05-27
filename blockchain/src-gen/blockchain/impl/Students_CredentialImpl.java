/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;
import blockchain.Information;
import blockchain.Students_Credential;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Students Credential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.Students_CredentialImpl#getStu_Name <em>Stu Name</em>}</li>
 *   <li>{@link blockchain.impl.Students_CredentialImpl#getStu_Password <em>Stu Password</em>}</li>
 *   <li>{@link blockchain.impl.Students_CredentialImpl#getStu_Image <em>Stu Image</em>}</li>
 *   <li>{@link blockchain.impl.Students_CredentialImpl#getStuDataEncrypt <em>Stu Data Encrypt</em>}</li>
 *   <li>{@link blockchain.impl.Students_CredentialImpl#getStuInformation <em>Stu Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Students_CredentialImpl extends MinimalEObjectImpl.Container implements Students_Credential {
	/**
	 * The default value of the '{@link #getStu_Name() <em>Stu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStu_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String STU_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStu_Name() <em>Stu Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStu_Name()
	 * @generated
	 * @ordered
	 */
	protected String stu_Name = STU_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStu_Password() <em>Stu Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStu_Password()
	 * @generated
	 * @ordered
	 */
	protected static final String STU_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStu_Password() <em>Stu Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStu_Password()
	 * @generated
	 * @ordered
	 */
	protected String stu_Password = STU_PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStu_Image() <em>Stu Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStu_Image()
	 * @generated
	 * @ordered
	 */
	protected Object stu_Image;

	/**
	 * The cached value of the '{@link #getStuDataEncrypt() <em>Stu Data Encrypt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuDataEncrypt()
	 * @generated
	 * @ordered
	 */
	protected EList<Encryptor_SHA256> stuDataEncrypt;

	/**
	 * The cached value of the '{@link #getStuInformation() <em>Stu Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStuInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> stuInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Students_CredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.STUDENTS_CREDENTIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStu_Name() {
		return stu_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStu_Name(String newStu_Name) {
		String oldStu_Name = stu_Name;
		stu_Name = newStu_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.STUDENTS_CREDENTIAL__STU_NAME,
					oldStu_Name, stu_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStu_Password() {
		return stu_Password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStu_Password(String newStu_Password) {
		String oldStu_Password = stu_Password;
		stu_Password = newStu_Password;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.STUDENTS_CREDENTIAL__STU_PASSWORD,
					oldStu_Password, stu_Password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStu_Image() {
		return stu_Image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStu_Image(Object newStu_Image) {
		Object oldStu_Image = stu_Image;
		stu_Image = newStu_Image;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.STUDENTS_CREDENTIAL__STU_IMAGE,
					oldStu_Image, stu_Image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encryptor_SHA256> getStuDataEncrypt() {
		if (stuDataEncrypt == null) {
			stuDataEncrypt = new EObjectResolvingEList<Encryptor_SHA256>(Encryptor_SHA256.class, this,
					BlockchainPackage.STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT);
		}
		return stuDataEncrypt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getStuInformation() {
		if (stuInformation == null) {
			stuInformation = new EObjectResolvingEList<Information>(Information.class, this,
					BlockchainPackage.STUDENTS_CREDENTIAL__STU_INFORMATION);
		}
		return stuInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_NAME:
			return getStu_Name();
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_PASSWORD:
			return getStu_Password();
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_IMAGE:
			return getStu_Image();
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT:
			return getStuDataEncrypt();
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_INFORMATION:
			return getStuInformation();
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
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_NAME:
			setStu_Name((String) newValue);
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_PASSWORD:
			setStu_Password((String) newValue);
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_IMAGE:
			setStu_Image(newValue);
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT:
			getStuDataEncrypt().clear();
			getStuDataEncrypt().addAll((Collection<? extends Encryptor_SHA256>) newValue);
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_INFORMATION:
			getStuInformation().clear();
			getStuInformation().addAll((Collection<? extends Information>) newValue);
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
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_NAME:
			setStu_Name(STU_NAME_EDEFAULT);
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_PASSWORD:
			setStu_Password(STU_PASSWORD_EDEFAULT);
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_IMAGE:
			setStu_Image((Object) null);
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT:
			getStuDataEncrypt().clear();
			return;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_INFORMATION:
			getStuInformation().clear();
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
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_NAME:
			return STU_NAME_EDEFAULT == null ? stu_Name != null : !STU_NAME_EDEFAULT.equals(stu_Name);
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_PASSWORD:
			return STU_PASSWORD_EDEFAULT == null ? stu_Password != null : !STU_PASSWORD_EDEFAULT.equals(stu_Password);
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_IMAGE:
			return stu_Image != null;
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_DATA_ENCRYPT:
			return stuDataEncrypt != null && !stuDataEncrypt.isEmpty();
		case BlockchainPackage.STUDENTS_CREDENTIAL__STU_INFORMATION:
			return stuInformation != null && !stuInformation.isEmpty();
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
		result.append(" (Stu_Name: ");
		result.append(stu_Name);
		result.append(", Stu_Password: ");
		result.append(stu_Password);
		result.append(", Stu_Image: ");
		result.append(stu_Image);
		result.append(')');
		return result.toString();
	}

} //Students_CredentialImpl
