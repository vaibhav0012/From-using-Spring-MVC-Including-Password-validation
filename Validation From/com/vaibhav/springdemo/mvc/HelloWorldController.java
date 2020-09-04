package com.vaibhav.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Hey"+theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model)
	{
		//RequestParam automatically reads the value stored as the studentName and assigns it to theName
		//String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Hey V3 "+theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
}
