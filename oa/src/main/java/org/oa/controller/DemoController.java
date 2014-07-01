package org.oa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;

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
//	ServletContext
//	@Autowired
//	HttpServletResponse response;	
//	public HttpServletResponse getResponse() {
//		return response;
//	}
//	public void setResponse(HttpServletResponse response) {
//		this.response = response;
//	}
	
	@Autowired
	private DemoService demoService;
	public DemoService getDemoService() {
		return demoService;
	}
	public void setDemoService(DemoService demoService) {
		this.demoService = demoService;
	}
	
	@RequestMapping("/hello")
	public ModelAndView sayHello( HttpServletRequest request,HttpServletResponse response) {
		
		List<Demo> listdemos = demoService.getDemos();
		
		if(listdemos!=null && listdemos.size()>=0)
			return new ModelAndView("demo" ,"demos" ,listdemos);
			
		return new ModelAndView("error");
	}
	
	@RequestMapping("/helloo")
	public void sayHello2( HttpServletRequest request ,HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		String jsonString = "{\"name\":\"admin\",\"password\":\"123\"}"; 
		
		List<Demo> listdemos = demoService.getDemos();
		
		response.setContentType("application/json; charset=UTF-8");
	/*	JSONObject data = new JSONObject();
		data.accumulate("listd", listdemos);*/
		session.setAttribute("listdemos", listdemos);
		
		String json = JSONArray.fromObject(listdemos).toString(); 
		
		try {						  

			PrintWriter pw=response.getWriter();
			pw.print(json);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
		
	
		

}
