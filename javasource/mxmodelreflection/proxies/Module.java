// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public class Module
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject moduleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.Module";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ModuleName("ModuleName"),
		SynchronizeObjectsWithinModule("SynchronizeObjectsWithinModule");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Module(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxModelReflection.Module"));
	}

	protected Module(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject moduleMendixObject)
	{
		if (moduleMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxModelReflection.Module", moduleMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxModelReflection.Module");

		this.moduleMendixObject = moduleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Module.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxmodelreflection.proxies.Module initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.Module.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.Module initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.Module(context, mendixObject);
	}

	public static mxmodelreflection.proxies.Module load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.Module.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.Module> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.Module> result = new java.util.ArrayList<mxmodelreflection.proxies.Module>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxModelReflection.Module" + xpathConstraint))
			result.add(mxmodelreflection.proxies.Module.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ModuleName
	 */
	public final java.lang.String getModuleName()
	{
		return getModuleName(getContext());
	}

	/**
	 * @param context
	 * @return value of ModuleName
	 */
	public final java.lang.String getModuleName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ModuleName.toString());
	}

	/**
	 * Set value of ModuleName
	 * @param modulename
	 */
	public final void setModuleName(java.lang.String modulename)
	{
		setModuleName(getContext(), modulename);
	}

	/**
	 * Set value of ModuleName
	 * @param context
	 * @param modulename
	 */
	public final void setModuleName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String modulename)
	{
		getMendixObject().setValue(context, MemberNames.ModuleName.toString(), modulename);
	}

	/**
	 * @return value of SynchronizeObjectsWithinModule
	 */
	public final java.lang.Boolean getSynchronizeObjectsWithinModule()
	{
		return getSynchronizeObjectsWithinModule(getContext());
	}

	/**
	 * @param context
	 * @return value of SynchronizeObjectsWithinModule
	 */
	public final java.lang.Boolean getSynchronizeObjectsWithinModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SynchronizeObjectsWithinModule.toString());
	}

	/**
	 * Set value of SynchronizeObjectsWithinModule
	 * @param synchronizeobjectswithinmodule
	 */
	public final void setSynchronizeObjectsWithinModule(java.lang.Boolean synchronizeobjectswithinmodule)
	{
		setSynchronizeObjectsWithinModule(getContext(), synchronizeobjectswithinmodule);
	}

	/**
	 * Set value of SynchronizeObjectsWithinModule
	 * @param context
	 * @param synchronizeobjectswithinmodule
	 */
	public final void setSynchronizeObjectsWithinModule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean synchronizeobjectswithinmodule)
	{
		getMendixObject().setValue(context, MemberNames.SynchronizeObjectsWithinModule.toString(), synchronizeobjectswithinmodule);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return moduleMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxmodelreflection.proxies.Module that = (mxmodelreflection.proxies.Module) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MxModelReflection.Module";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
