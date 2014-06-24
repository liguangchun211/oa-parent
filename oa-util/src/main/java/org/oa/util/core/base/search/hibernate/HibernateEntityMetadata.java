package org.oa.util.core.base.search.hibernate;

import java.io.Serializable;

import org.hibernate.EntityMode;
import org.hibernate.SessionFactory;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.type.CollectionType;
import org.hibernate.type.EntityType;
import org.hibernate.type.Type;
import org.oa.util.core.base.search.Metadata;

public class HibernateEntityMetadata implements Metadata {
	
	private SessionFactory sessionFactory; ////entity in this sessionfactory
	private ClassMetadata metadata; 	// for entity
	private Class<?> collectionType; 	// Class Type for entity
	
	public HibernateEntityMetadata() {}
	
	public HibernateEntityMetadata(SessionFactory sessionFactory, ClassMetadata metadata, Class<?> collectionType) {
		this.sessionFactory = sessionFactory;
		this.metadata = metadata;
		this.collectionType = collectionType;		
	}
	
	
	public boolean isEntity() {
		return true;
	}

	public boolean isEmeddable() {
		return false;
	}

	public boolean isCollection() {
		return collectionType != null;
	}

	public boolean isString() {
		return false;
	}

	public boolean isNumeric() {
		return false;
	}

	public Class<?> getJavaClass() {		
		return metadata.getMappedClass();
	}

	public String getEntityName() {
		return metadata.getEntityName();
	}

	public String[] getProperties() {
		String[] pn = metadata.getPropertyNames();
		String[] result = new String[pn.length + 1];
		result[0] = metadata.getIdentifierPropertyName();
		for (int i = 0; i < pn.length; i++) {
			result[i+1] = pn[i];
		}		
		return result;
	}

	public Object getPropertyValue(Object object, String property) {
		if( getIdProperty().equals(property) ) {
			return metadata.getIdentifier(object, (SessionImplementor) sessionFactory);
		} else {
			return metadata.getPropertyValue(object, property);
		}
	}

	public Metadata getPropertyType(String property) {
		Type pType = metadata.getPropertyType(property);
		Class<?> pCollectionType = null;
		if (pType.isCollectionType()) {
			pType = ((CollectionType)pType).getElementType((SessionFactoryImplementor) sessionFactory);
			pCollectionType = pType.getReturnedClass();
		}
		
		if(pType.isEntityType()) {
			return new HibernateEntityMetadata(sessionFactory,sessionFactory.getClassMetadata(((EntityType)pType).getName()),pCollectionType);
		} else {
			return new HibernateNonEntityMetadata(sessionFactory,pType,pCollectionType);
		}
	}

	public String getIdProperty() {
		return metadata.getIdentifierPropertyName();
	}

	public Metadata getIdType() {
		return new HibernateNonEntityMetadata(sessionFactory,metadata.getIdentifierType(),null);
	}

	public Serializable getIdValue(Object object) {
		if(object instanceof HibernateProxy) {
			return ((HibernateProxy)object).getHibernateLazyInitializer().getIdentifier();
		} else {
			return metadata.getIdentifier(object, (SessionImplementor)sessionFactory);
		}		
	}

	public Class<?> getCollectionClass() {		
		return collectionType;
	}

}
