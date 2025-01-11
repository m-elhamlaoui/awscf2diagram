/**
 */
package awscftarget.provider;

import awscftarget.AwscftargetFactory;
import awscftarget.AwscftargetPackage;
import awscftarget.Template;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link awscftarget.Template} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateItemProvider(AdapterFactory adapterFactory) {
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

			addAWSTemplateFormatVersionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the AWS Template Format Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAWSTemplateFormatVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Template_AWSTemplateFormatVersion_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Template_AWSTemplateFormatVersion_feature",
								"_UI_Template_type"),
						AwscftargetPackage.Literals.TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Template_Description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Template_Description_feature",
								"_UI_Template_type"),
						AwscftargetPackage.Literals.TEMPLATE__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(AwscftargetPackage.Literals.TEMPLATE__PARAMETERS);
			childrenFeatures.add(AwscftargetPackage.Literals.TEMPLATE__OUTPUTS);
			childrenFeatures.add(AwscftargetPackage.Literals.TEMPLATE__CONDITIONS);
			childrenFeatures.add(AwscftargetPackage.Literals.TEMPLATE__RESOURCES);
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
	 * This returns Template.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Template"));
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
		String label = ((Template) object).getAWSTemplateFormatVersion();
		return label == null || label.length() == 0 ? getString("_UI_Template_type")
				: getString("_UI_Template_type") + " " + label;
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

		switch (notification.getFeatureID(Template.class)) {
		case AwscftargetPackage.TEMPLATE__AWS_TEMPLATE_FORMAT_VERSION:
		case AwscftargetPackage.TEMPLATE__DESCRIPTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case AwscftargetPackage.TEMPLATE__PARAMETERS:
		case AwscftargetPackage.TEMPLATE__OUTPUTS:
		case AwscftargetPackage.TEMPLATE__CONDITIONS:
		case AwscftargetPackage.TEMPLATE__RESOURCES:
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

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__PARAMETERS,
				AwscftargetFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__OUTPUTS,
				AwscftargetFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__CONDITIONS,
				AwscftargetFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__RESOURCES,
				AwscftargetFactory.eINSTANCE.createEC2Instance()));

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__RESOURCES,
				AwscftargetFactory.eINSTANCE.createSecurityGroup()));

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__RESOURCES,
				AwscftargetFactory.eINSTANCE.createRDSInstance()));

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__RESOURCES,
				AwscftargetFactory.eINSTANCE.createS3Bucket()));

		newChildDescriptors.add(createChildParameter(AwscftargetPackage.Literals.TEMPLATE__RESOURCES,
				AwscftargetFactory.eINSTANCE.createVPC()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AwscftargetEditPlugin.INSTANCE;
	}

}
