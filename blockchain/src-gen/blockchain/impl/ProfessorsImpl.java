/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;
import blockchain.Information;
import blockchain.Professors;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.ProfessorsImpl#getProf_Name <em>Prof Name</em>}</li>
 *   <li>{@link blockchain.impl.ProfessorsImpl#getProf_Password <em>Prof Password</em>}</li>
 *   <li>{@link blockchain.impl.ProfessorsImpl#getProf_University <em>Prof University</em>}</li>
 *   <li>{@link blockchain.impl.ProfessorsImpl#getProf_Designation <em>Prof Designation</em>}</li>
 *   <li>{@link blockchain.impl.ProfessorsImpl#getProfdataEncrypt <em>Profdata Encrypt</em>}</li>
 *   <li>{@link blockchain.impl.ProfessorsImpl#getProfInformation <em>Prof Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfessorsImpl extends MinimalEObjectImpl.Container implements Professors {
	/**
	 * The default value of the '{@link #getProf_Name() <em>Prof Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String PROF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProf_Name() <em>Prof Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_Name()
	 * @generated
	 * @ordered
	 */
	protected String prof_Name = PROF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProf_Password() <em>Prof Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_Password()
	 * @generated
	 * @ordered
	 */
	protected static final String PROF_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProf_Password() <em>Prof Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_Password()
	 * @generated
	 * @ordered
	 */
	protected String prof_Password = PROF_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getProf_University() <em>Prof University</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_University()
	 * @generated
	 * @ordered
	 */
	protected static final String PROF_UNIVERSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProf_University() <em>Prof University</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_University()
	 * @generated
	 * @ordered
	 */
	protected String prof_University = PROF_UNIVERSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProf_Designation() <em>Prof Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_Designation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROF_DESIGNATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProf_Designation() <em>Prof Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf_Designation()
	 * @generated
	 * @ordered
	 */
	protected String prof_Designation = PROF_DESIGNATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProfdataEncrypt() <em>Profdata Encrypt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfdataEncrypt()
	 * @generated
	 * @ordered
	 */
	protected EList<Encryptor_SHA256> profdataEncrypt;

	/**
	 * The cached value of the '{@link #getProfInformation() <em>Prof Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> profInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.PROFESSORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProf_Name() {
		return prof_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProf_Name(String newProf_Name) {
		String oldProf_Name = prof_Name;
		prof_Name = newProf_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.PROFESSORS__PROF_NAME, oldProf_Name,
					prof_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProf_Password() {
		return prof_Password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProf_Password(String newProf_Password) {
		String oldProf_Password = prof_Password;
		prof_Password = newProf_Password;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.PROFESSORS__PROF_PASSWORD,
					oldProf_Password, prof_Password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProf_University() {
		return prof_University;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProf_University(String newProf_University) {
		String oldProf_University = prof_University;
		prof_University = newProf_University;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.PROFESSORS__PROF_UNIVERSITY,
					oldProf_University, prof_University));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProf_Designation() {
		return prof_Designation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProf_Designation(String newProf_Designation) {
		String oldProf_Designation = prof_Designation;
		prof_Designation = newProf_Designation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.PROFESSORS__PROF_DESIGNATION,
					oldProf_Designation, prof_Designation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Encryptor_SHA256> getProfdataEncrypt() {
		if (profdataEncrypt == null) {
			profdataEncrypt = new EObjectResolvingEList<Encryptor_SHA256>(Encryptor_SHA256.class, this,
					BlockchainPackage.PROFESSORS__PROFDATA_ENCRYPT);
		}
		return profdataEncrypt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getProfInformation() {
		if (profInformation == null) {
			profInformation = new EObjectResolvingEList<Information>(Information.class, this,
					BlockchainPackage.PROFESSORS__PROF_INFORMATION);
		}
		return profInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.PROFESSORS__PROF_NAME:
			return getProf_Name();
		case BlockchainPackage.PROFESSORS__PROF_PASSWORD:
			return getProf_Password();
		case BlockchainPackage.PROFESSORS__PROF_UNIVERSITY:
			return getProf_University();
		case BlockchainPackage.PROFESSORS__PROF_DESIGNATION:
			return getProf_Designation();
		case BlockchainPackage.PROFESSORS__PROFDATA_ENCRYPT:
			return getProfdataEncrypt();
		case BlockchainPackage.PROFESSORS__PROF_INFORMATION:
			return getProfInformation();
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
		case BlockchainPackage.PROFESSORS__PROF_NAME:
			setProf_Name((String) newValue);
			return;
		case BlockchainPackage.PROFESSORS__PROF_PASSWORD:
			setProf_Password((String) newValue);
			return;
		case BlockchainPackage.PROFESSORS__PROF_UNIVERSITY:
			setProf_University((String) newValue);
			return;
		case BlockchainPackage.PROFESSORS__PROF_DESIGNATION:
			setProf_Designation((String) newValue);
			return;
		case BlockchainPackage.PROFESSORS__PROFDATA_ENCRYPT:
			getProfdataEncrypt().clear();
			getProfdataEncrypt().addAll((Collection<? extends Encryptor_SHA256>) newValue);
			return;
		case BlockchainPackage.PROFESSORS__PROF_INFORMATION:
			getProfInformation().clear();
			getProfInformation().addAll((Collection<? extends Information>) newValue);
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
		case BlockchainPackage.PROFESSORS__PROF_NAME:
			setProf_Name(PROF_NAME_EDEFAULT);
			return;
		case BlockchainPackage.PROFESSORS__PROF_PASSWORD:
			setProf_Password(PROF_PASSWORD_EDEFAULT);
			return;
		case BlockchainPackage.PROFESSORS__PROF_UNIVERSITY:
			setProf_University(PROF_UNIVERSITY_EDEFAULT);
			return;
		case BlockchainPackage.PROFESSORS__PROF_DESIGNATION:
			setProf_Designation(PROF_DESIGNATION_EDEFAULT);
			return;
		case BlockchainPackage.PROFESSORS__PROFDATA_ENCRYPT:
			getProfdataEncrypt().clear();
			return;
		case BlockchainPackage.PROFESSORS__PROF_INFORMATION:
			getProfInformation().clear();
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
		case BlockchainPackage.PROFESSORS__PROF_NAME:
			return PROF_NAME_EDEFAULT == null ? prof_Name != null : !PROF_NAME_EDEFAULT.equals(prof_Name);
		case BlockchainPackage.PROFESSORS__PROF_PASSWORD:
			return PROF_PASSWORD_EDEFAULT == null ? prof_Password != null
					: !PROF_PASSWORD_EDEFAULT.equals(prof_Password);
		case BlockchainPackage.PROFESSORS__PROF_UNIVERSITY:
			return PROF_UNIVERSITY_EDEFAULT == null ? prof_University != null
					: !PROF_UNIVERSITY_EDEFAULT.equals(prof_University);
		case BlockchainPackage.PROFESSORS__PROF_DESIGNATION:
			return PROF_DESIGNATION_EDEFAULT == null ? prof_Designation != null
					: !PROF_DESIGNATION_EDEFAULT.equals(prof_Designation);
		case BlockchainPackage.PROFESSORS__PROFDATA_ENCRYPT:
			return profdataEncrypt != null && !profdataEncrypt.isEmpty();
		case BlockchainPackage.PROFESSORS__PROF_INFORMATION:
			return profInformation != null && !profInformation.isEmpty();
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
		result.append(" (Prof_Name: ");
		result.append(prof_Name);
		result.append(", Prof_Password: ");
		result.append(prof_Password);
		result.append(", Prof_University: ");
		result.append(prof_University);
		result.append(", Prof_Designation: ");
		result.append(prof_Designation);
		result.append(')');
		return result.toString();
	}

} //ProfessorsImpl
