/**
 */
package blockchain.provider;

import blockchain.BlockchainPackage;
import blockchain.Exam_Questions;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link blockchain.Exam_Questions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Exam_QuestionsItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam_QuestionsItemProvider(AdapterFactory adapterFactory) {
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

			addMcqs_basedPropertyDescriptor(object);
			addFill_in_blankPropertyDescriptor(object);
			addExam_TypePropertyDescriptor(object);
			addQuesInformationPropertyDescriptor(object);
			addValidprofessorPropertyDescriptor(object);
			addQuestionEncryptPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mcqs based feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMcqs_basedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Exam_Questions_Mcqs_based_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Exam_Questions_Mcqs_based_feature",
								"_UI_Exam_Questions_type"),
						BlockchainPackage.Literals.EXAM_QUESTIONS__MCQS_BASED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fill in blank feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFill_in_blankPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Exam_Questions_Fill_in_blank_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Exam_Questions_Fill_in_blank_feature",
								"_UI_Exam_Questions_type"),
						BlockchainPackage.Literals.EXAM_QUESTIONS__FILL_IN_BLANK, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Exam Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExam_TypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Exam_Questions_Exam_Type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Exam_Questions_Exam_Type_feature",
								"_UI_Exam_Questions_type"),
						BlockchainPackage.Literals.EXAM_QUESTIONS__EXAM_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ques Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuesInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Exam_Questions_quesInformation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Exam_Questions_quesInformation_feature",
								"_UI_Exam_Questions_type"),
						BlockchainPackage.Literals.EXAM_QUESTIONS__QUES_INFORMATION, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Validprofessor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidprofessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Exam_Questions_validprofessor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Exam_Questions_validprofessor_feature",
								"_UI_Exam_Questions_type"),
						BlockchainPackage.Literals.EXAM_QUESTIONS__VALIDPROFESSOR, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Question Encrypt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuestionEncryptPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Exam_Questions_questionEncrypt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Exam_Questions_questionEncrypt_feature",
								"_UI_Exam_Questions_type"),
						BlockchainPackage.Literals.EXAM_QUESTIONS__QUESTION_ENCRYPT, true, false, true, null, null,
						null));
	}

	/**
	 * This returns Exam_Questions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Exam_Questions"));
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
		String label = ((Exam_Questions) object).getMcqs_based();
		return label == null || label.length() == 0 ? getString("_UI_Exam_Questions_type")
				: getString("_UI_Exam_Questions_type") + " " + label;
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

		switch (notification.getFeatureID(Exam_Questions.class)) {
		case BlockchainPackage.EXAM_QUESTIONS__MCQS_BASED:
		case BlockchainPackage.EXAM_QUESTIONS__FILL_IN_BLANK:
		case BlockchainPackage.EXAM_QUESTIONS__EXAM_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
