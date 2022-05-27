/**
 */
package blockchain.provider;

import blockchain.BlockchainPackage;
import blockchain.Encryptor_SHA256;

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
 * This is the item provider adapter for a {@link blockchain.Encryptor_SHA256} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Encryptor_SHA256ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encryptor_SHA256ItemProvider(AdapterFactory adapterFactory) {
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

			addValidator_IdPropertyDescriptor(object);
			addBlockPropertyDescriptor(object);
			addKeyPropertyDescriptor(object);
			addEncrypted_dataPropertyDescriptor(object);
			addHexPropertyDescriptor(object);
			addBytesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Validator Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValidator_IdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Encryptor_SHA256_Validator_Id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Encryptor_SHA256_Validator_Id_feature",
								"_UI_Encryptor_SHA256_type"),
						BlockchainPackage.Literals.ENCRYPTOR_SHA256__VALIDATOR_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Block feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Encryptor_SHA256_block_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Encryptor_SHA256_block_feature",
								"_UI_Encryptor_SHA256_type"),
						BlockchainPackage.Literals.ENCRYPTOR_SHA256__BLOCK, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Encryptor_SHA256_key_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Encryptor_SHA256_key_feature",
								"_UI_Encryptor_SHA256_type"),
						BlockchainPackage.Literals.ENCRYPTOR_SHA256__KEY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encrypted data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncrypted_dataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Encryptor_SHA256_Encrypted_data_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Encryptor_SHA256_Encrypted_data_feature",
						"_UI_Encryptor_SHA256_type"),
				BlockchainPackage.Literals.ENCRYPTOR_SHA256__ENCRYPTED_DATA, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHexPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Encryptor_SHA256_hex_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Encryptor_SHA256_hex_feature",
								"_UI_Encryptor_SHA256_type"),
						BlockchainPackage.Literals.ENCRYPTOR_SHA256__HEX, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bytes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBytesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Encryptor_SHA256_bytes_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Encryptor_SHA256_bytes_feature",
								"_UI_Encryptor_SHA256_type"),
						BlockchainPackage.Literals.ENCRYPTOR_SHA256__BYTES, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Encryptor_SHA256.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Encryptor_SHA256"));
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
		String label = ((Encryptor_SHA256) object).getValidator_Id();
		return label == null || label.length() == 0 ? getString("_UI_Encryptor_SHA256_type")
				: getString("_UI_Encryptor_SHA256_type") + " " + label;
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

		switch (notification.getFeatureID(Encryptor_SHA256.class)) {
		case BlockchainPackage.ENCRYPTOR_SHA256__VALIDATOR_ID:
		case BlockchainPackage.ENCRYPTOR_SHA256__KEY:
		case BlockchainPackage.ENCRYPTOR_SHA256__ENCRYPTED_DATA:
		case BlockchainPackage.ENCRYPTOR_SHA256__HEX:
		case BlockchainPackage.ENCRYPTOR_SHA256__BYTES:
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
