package org.oa.util.core.base.search;

import java.io.Serializable;

public interface MetadataUtil {

	public Serializable getId(Object object);
	/**
	 * Return true if the property at the given property path is the id of some
	 * entity.
	 */
	public boolean isId(Class<?> rootClass, String propertyPath);
	
	public Metadata get( Class<?> klass);
	
	public Metadata get( Class<?> rootEntityClass, String propertyPath );
	
	/*****************************************************************************
	 * Return the actual entity class registered with the persistence provider.  *
	 * This may be the same class or it may be different if the given class is   *
	 * is a proxy. We need to normalize this to Person so that we can create     *
	 * correct queries and inspect metadata correctly.                           *
	 * **************************************************************************/
	public <T> Class<T> getUnproxiedClass(Class<?> klass);
	
	public <T> Class<T> getUnproxiedClass(Object object);
	
}
