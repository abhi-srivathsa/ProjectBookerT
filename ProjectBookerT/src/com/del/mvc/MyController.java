package com.del.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.del.bean.Location;
import com.del.bean.Login;
import com.del.bean.Registration;
import com.del.dao.MyDao;
import com.del.service.MyService;

@Controller
public class MyController {
	@Autowired
	private MyService mService;
	@RequestMapping(value = "/home")
	public String goHome(Model model) {
		System.out.println("Go to home");
		model.addAttribute(new Login());
		return "index";
	}
	@RequestMapping(value = "/register")
	public String goRegister(Model model) {
		System.out.println("Register");
		List<String> lst = mService.getLocations();
		model.addAttribute("loc",lst);
		model.addAttribute("reg",new Registration());
		return "register";
	}
	@RequestMapping(value = "/adduser")
	public String addUser(@ModelAttribute(value = "reg") Registration reg, Model model) {
		System.out.println("Add");
		System.out.println(reg);
		mService.registerUser(reg);
		return "index";
	}
	@RequestMapping(value = "/movies")
	public String movies(@ModelAttribute(value = "login") Login login, Model model) {
		System.out.println("Movie page");
		System.out.println(login);
		Registration regi = mService.getUserDetails(login);
		System.out.println(regi);
		//model.addAttribute("mov", new3);
		model.addAttribute("regi",regi);
		return "movies";
	}
	
	
	@RequestMapping(value = "/checkLogin")
	public String checkLogin(@ModelAttribute(value = "login") Login login, Model model) {
		System.out.println("checking login");
		System.out.println(login);
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		model.addAttribute(login);
		boolean success = mService.checklogin(login);
		if (success)
			return "success";
		else
			return "fail";
	}

}
