package org.oa.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.oa.dao.DemoDao;
import org.oa.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("demoDao")
public class DemoDaoImpl implements DemoDao{

	Logger logger=Logger.getLogger(DemoDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;		
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Demo> getDemos() {
		String hql = "from Demo";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Demo> listdemos = query.list();
		if(listdemos==null || listdemos.size()<1)
			return null;		
		return listdemos;
	}

}
