/**
 */
package blockchain.provider;

import blockchain.BlockchainFactory;
import blockchain.BlockchainPackage;
import blockchain.Online_Education_System;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockchain.Online_Education_System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Online_Education_SystemItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Online_Education_SystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__BLOCK);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__PROFESSORS);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__VALIDATOR);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__INFORMATION);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS);
			childrenFeatures.add(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Online_Education_System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Online_Education_System"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Online_Education_System_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Online_Education_System.class)) {
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__BLOCK:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__PROFESSORS:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__VALIDATOR:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__INFORMATION:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS:
		case BlockchainPackage.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__BLOCK,
				BlockchainFactory.eINSTANCE.createBlock()));

		newChildDescriptors
				.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__STUDENTS_CREDENTIAL,
						BlockchainFactory.eINSTANCE.createStudents_Credential()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__UNIVERSITIES,
				BlockchainFactory.eINSTANCE.createUniversities()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__PROFESSORS,
				BlockchainFactory.eINSTANCE.createProfessors()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__VALIDATOR,
				BlockchainFactory.eINSTANCE.createEncryptor_SHA256()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__EXAM_SOLUTION,
				BlockchainFactory.eINSTANCE.createExam_Solution()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__SMARTCONTRACT,
				BlockchainFactory.eINSTANCE.createSmartContract()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__INFORMATION,
				BlockchainFactory.eINSTANCE.createInformation()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__EXAM_QUESTIONS,
				BlockchainFactory.eINSTANCE.createExam_Questions()));

		newChildDescriptors.add(createChildParameter(BlockchainPackage.Literals.ONLINE_EDUCATION_SYSTEM__EXAM_NETWORK,
				BlockchainFactory.eINSTANCE.createExam_Network()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BlockchainEditPlugin.INSTANCE;
	}

}
