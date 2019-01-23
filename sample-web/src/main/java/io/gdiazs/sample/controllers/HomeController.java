package io.gdiazs.sample.controllers;



import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.gdiazs.othercontext.services.DefaultService;

@Controller
public class HomeController {
	
	@Inject
	DefaultService defaultService;

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String index() {
		defaultService.sayHello();
		
		return "index";
	}
	
	
}
