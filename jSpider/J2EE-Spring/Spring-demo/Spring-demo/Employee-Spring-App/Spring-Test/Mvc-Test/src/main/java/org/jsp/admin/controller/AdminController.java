package org.jsp.admin.controller;

import org.jsp.admin.dao.AdminDao;
import org.jsp.admin.dto.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@Autowired
	private AdminDao dao;

	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister() {
		ModelAndView view = new ModelAndView();
		view.setViewName("register");
		view.addObject("u", new Admin());
		return view;
	}

	@PostMapping("/register")
	public ModelAndView registerUser(@ModelAttribute Admin u, ModelAndView view) {
		dao.saveAdmin(u);
		view.setViewName("print");
		view.addObject("message", "User saved with Id: " + u.getId());
		return view;
	}

	@RequestMapping(value = "/open-admin")
	public ModelAndView openAdmin() {
		ModelAndView view = new ModelAndView();
		view.setViewName("findbyid");
		view.addObject("u", new Admin());
		return view;
	}

	@GetMapping(value = "/find-by-id")
	public ModelAndView findById(@RequestParam int id, ModelAndView view) {
		Admin u = dao.findById(id);
		if (u != null) {
			view.setViewName("display");
			view.addObject("u", u);
			return view;
		}
		view.setViewName("print");
		view.addObject("message", "Invalid User Id");
		return view;
	}
}
