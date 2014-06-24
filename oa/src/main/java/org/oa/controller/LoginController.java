package org.oa.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/wel")
public class LoginController {
	Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public ModelAndView login( HttpServletRequest request) {
		String userString = request.getParameter("username");
		String passString = request.getParameter("password");
		
		if(passString.equals("admin") && userString.equals("admin")) {
			return new ModelAndView("welcome","user",userString);
		}
		
		return new ModelAndView("error");
	}
	
}





