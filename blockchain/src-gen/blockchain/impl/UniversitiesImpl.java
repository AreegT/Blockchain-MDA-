/**
 */
package blockchain.impl;

import blockchain.BlockchainPackage;
import blockchain.Information;
import blockchain.Universities;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link blockchain.impl.UniversitiesImpl#getUni_Name <em>Uni Name</em>}</li>
 *   <li>{@link blockchain.impl.UniversitiesImpl#getUni_Rank <em>Uni Rank</em>}</li>
 *   <li>{@link blockchain.impl.UniversitiesImpl#getUniInformation <em>Uni Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversitiesImpl extends MinimalEObjectImpl.Container implements Universities {
	/**
	 * The default value of the '{@link #getUni_Name() <em>Uni Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUni_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String UNI_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUni_Name() <em>Uni Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUni_Name()
	 * @generated
	 * @ordered
	 */
	protected String uni_Name = UNI_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUni_Rank() <em>Uni Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUni_Rank()
	 * @generated
	 * @ordered
	 */
	protected static final String UNI_RANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUni_Rank() <em>Uni Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUni_Rank()
	 * @generated
	 * @ordered
	 */
	protected String uni_Rank = UNI_RANK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUniInformation() <em>Uni Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> uniInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockchainPackage.Literals.UNIVERSITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUni_Name() {
		return uni_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUni_Name(String newUni_Name) {
		String oldUni_Name = uni_Name;
		uni_Name = newUni_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.UNIVERSITIES__UNI_NAME, oldUni_Name,
					uni_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUni_Rank() {
		return uni_Rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUni_Rank(String newUni_Rank) {
		String oldUni_Rank = uni_Rank;
		uni_Rank = newUni_Rank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockchainPackage.UNIVERSITIES__UNI_RANK, oldUni_Rank,
					uni_Rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getUniInformation() {
		if (uniInformation == null) {
			uniInformation = new EObjectResolvingEList<Information>(Information.class, this,
					BlockchainPackage.UNIVERSITIES__UNI_INFORMATION);
		}
		return uniInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BlockchainPackage.UNIVERSITIES__UNI_NAME:
			return getUni_Name();
		case BlockchainPackage.UNIVERSITIES__UNI_RANK:
			return getUni_Rank();
		case BlockchainPackage.UNIVERSITIES__UNI_INFORMATION:
			return getUniInformation();
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
		case BlockchainPackage.UNIVERSITIES__UNI_NAME:
			setUni_Name((String) newValue);
			return;
		case BlockchainPackage.UNIVERSITIES__UNI_RANK:
			setUni_Rank((String) newValue);
			return;
		case BlockchainPackage.UNIVERSITIES__UNI_INFORMATION:
			getUniInformation().clear();
			getUniInformation().addAll((Collection<? extends Information>) newValue);
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
		case BlockchainPackage.UNIVERSITIES__UNI_NAME:
			setUni_Name(UNI_NAME_EDEFAULT);
			return;
		case BlockchainPackage.UNIVERSITIES__UNI_RANK:
			setUni_Rank(UNI_RANK_EDEFAULT);
			return;
		case BlockchainPackage.UNIVERSITIES__UNI_INFORMATION:
			getUniInformation().clear();
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
		case BlockchainPackage.UNIVERSITIES__UNI_NAME:
			return UNI_NAME_EDEFAULT == null ? uni_Name != null : !UNI_NAME_EDEFAULT.equals(uni_Name);
		case BlockchainPackage.UNIVERSITIES__UNI_RANK:
			return UNI_RANK_EDEFAULT == null ? uni_Rank != null : !UNI_RANK_EDEFAULT.equals(uni_Rank);
		case BlockchainPackage.UNIVERSITIES__UNI_INFORMATION:
			return uniInformation != null && !uniInformation.isEmpty();
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
		result.append(" (Uni_Name: ");
		result.append(uni_Name);
		result.append(", Uni_Rank: ");
		result.append(uni_Rank);
		result.append(')');
		return result.toString();
	}

} //UniversitiesImpl
