package org.oa.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.oa.dao.DemoDao;
import org.oa.model.Demo;
import org.oa.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService{

	Logger logger=Logger.getLogger(DemoServiceImpl.class);
	
	@Autowired
	private DemoDao demoDao;
	public DemoDao getDemoDao() {
		return demoDao;
	}
	public void setDemoDao(DemoDao demoDao) {
		this.demoDao = demoDao;
	}

	public List<Demo> getDemos() {
		// TODO Auto-generated method stub
		return demoDao.getDemos();
	}

}
