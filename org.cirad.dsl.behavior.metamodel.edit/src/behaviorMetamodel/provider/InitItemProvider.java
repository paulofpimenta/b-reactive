/**
 */
package behaviorMetamodel.provider;


import behaviorMetamodel.Init;
import behaviorMetamodel.MetamodelFactory;
import behaviorMetamodel.MetamodelPackage;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviorMetamodel.Init} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InitItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitItemProvider(AdapterFactory adapterFactory) {
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

			addEntityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Entity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Init_entity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Init_entity_feature", "_UI_Init_type"),
				 MetamodelPackage.Literals.INIT__ENTITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(MetamodelPackage.Literals.INIT__ASSINGNMENTS);
			childrenFeatures.add(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL);
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
	 * This returns Init.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Init"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Init_type");
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

		switch (notification.getFeatureID(Init.class)) {
			case MetamodelPackage.INIT__ASSINGNMENTS:
			case MetamodelPackage.INIT__INIT_FUNCTION_CALL:
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

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__ASSINGNMENTS,
				 MetamodelFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createVariableClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createParameterClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createAttributeClass()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createDeclaredLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createDeclaredParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createDeclaredAttributes()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createDeclaredEntities()));

		newChildDescriptors.add
			(createChildParameter
				(MetamodelPackage.Literals.INIT__INIT_FUNCTION_CALL,
				 MetamodelFactory.eINSTANCE.createDeclaredVariable()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetamodelEditPlugin.INSTANCE;
	}

}