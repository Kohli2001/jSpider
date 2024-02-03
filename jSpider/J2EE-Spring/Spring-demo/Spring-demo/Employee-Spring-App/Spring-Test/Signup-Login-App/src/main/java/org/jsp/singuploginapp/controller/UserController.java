package org.jsp.singuploginapp.controller;


import org.jsp.singuploginapp.dao.UserDao;
import org.jsp.singuploginapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	
	@RequestMapping("/open-register")
	public ModelAndView openRegister(ModelAndView view) {
		view.setViewName("register");
		view.addObject("u", new User());
		return view;
	}
	
	@PostMapping("/register")
	public ModelAndView singup(@ModelAttribute  User u , ModelAndView view) {
		u=dao.register(u);
		view.setViewName("print");
		view.addObject("msg", "User successfully singup with id: "+u.getId());
		return view;
	}
}
