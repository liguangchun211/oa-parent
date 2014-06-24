package org.oa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.oa.model.Demo;
import org.oa.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	Logger logger=Logger.getLogger(DemoController.class);
	
	@Autowired
	private DemoService demoService;
	public DemoService getDemoService() {
		return demoService;
	}
	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}
	
	@RequestMapping("/hello")
	public ModelAndView sayHello( HttpServletRequest request) {
		
		List<Demo> listdemos = demoService.getDemos();
		
		if(listdemos!=null && listdemos.size()>=0)
			return new ModelAndView("demo" ,"demos" ,listdemos);
			
		return new ModelAndView("error");
	}

}
