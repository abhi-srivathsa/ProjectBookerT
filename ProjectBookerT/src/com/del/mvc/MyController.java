package com.del.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.del.bean.Login;
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

	
	@RequestMapping(value = "/checkLogin")
	public String checkLogin(@ModelAttribute(value = "login") Login login, Model model) {
		System.out.println("checking login");
		System.out.println(login);
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-servlet.xml");
		
		boolean success = mService.checklogin(login);
		if (success)
			return "success";
		else
			return "fail";
	}

}
