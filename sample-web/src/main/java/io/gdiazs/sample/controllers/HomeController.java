package io.gdiazs.sample.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.gdiazs.othercontext.services.DefaultService;
import io.gdiazs.sample.commons.services.CommonsService;

@Controller
public class HomeController {
	
	@Autowired
	private DefaultService defaultService;
	
	@Autowired
	private CommonsService commonsService;

	@RequestMapping(method = RequestMethod.GET, value = "")
	public String index() {
		defaultService.sayHello();
		commonsService.commonsServicePing();
		
		return "index";
	}
	
	
}
