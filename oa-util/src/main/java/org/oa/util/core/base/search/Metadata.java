package org.oa.util.core.base.search;

import java.io.Serializable;

public interface Metadata {

	public boolean isEntity();
	public boolean isEmeddable();
	public boolean isCollection();
	public boolean isString();
	public boolean isNumeric();
	
	public Class<?> getJavaClass();
	
	public String getEntityName();
	public String[] getProperties();
	
	public Object getPropertyValue( Object object, String property );
	public Metadata getPropertyType(String property);
	
	public String getIdProperty();
	
	public Metadata getIdType();
	
	public Serializable getIdValue(Object object);
	
	public Class<?> getCollectionClass();
	
	
	
}
