package org.jsp.springusermvcapp.controller;

import org.jsp.springusermvcapp.dao.UserDao;
import org.jsp.springusermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	private UserDao dao;

	@RequestMapping("/test")
	@ResponseBody
	public String tsetConfig() {
		return dao.getManager().toString();
	}

	// methods for reguster the user

	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister() {
		ModelAndView view = new ModelAndView();
		view.setViewName("register");
		view.addObject("u", new User());
		return view;
	}

//	@RequestMapping(value="/register", method=RequestMethod.POST)
	@PostMapping("/register")
	public ModelAndView registerUser(@ModelAttribute User u, ModelAndView view) {

		u = dao.saveUser(u);
		view.setViewName("print");
		view.addObject("message", "User saved with Id: " + u.getId());
		return view;
	}

	// -----------------------------------------------------------------------------------------------------------------
	// for update the user

	@RequestMapping(value = "/open-update")
	public ModelAndView openUpdate(ModelAndView view) {
		view.setViewName("update");
		view.addObject("u", new User());
		return view;
	}

	@PostMapping("/update")
	public ModelAndView updateUser(@ModelAttribute User u, ModelAndView view) {

		u = dao.updateUser(u);
		if (u != null) {
			view.setViewName("print");
			view.addObject("message", "User Updated successsfully ");
			return view;
		}
		view.setViewName("print");
		view.addObject("message", "Invalid Id can't Update!");
		return view;

	}
	//----------------------------------------------------------------------------------------------------------------------
	//for delete the user
	//---------------------------------------------------------------------------------------------------------------------
	//for open -view
	@RequestMapping("/open-view")
	public String openView(String view) {
		return view;
	}
	//--------------------------------------------------------------------------------------------------------------
	@GetMapping(value = "/find-by-id")
	public ModelAndView findById(@RequestParam int id, ModelAndView view) {
		User u = dao.findUserById(id);
		if (u != null) {
			view.setViewName("display");
			view.addObject("u", u);
			return view;
		}
		view.setViewName("print");
		view.addObject("message", "Invalid User Id");
		return view;
	}

	
	//-------------------------------------------------------------------------------------------------
	@GetMapping("/verify-by-id")
	public 	ModelAndView verifyById( @RequestParam int id, @RequestParam String password , ModelAndView view) {
		User u = dao.verifyUser(id, password);
		if(u!=null) {
			view.setViewName("display");
			view.addObject("u", u);
			return view;
		}
		view.setViewName("print");
		view.addObject("message", "Invalid User Id or Password");
		return view;
		
	}
	
	//---------------------------------------------------------------------------------------------------------------
	@GetMapping("/verify-by-email")
	public ModelAndView verifyByEmail( @RequestParam String email, @RequestParam String password , ModelAndView view) {
		User u = dao.verifyUser(email, password);
		if(u!=null) {
			view.setViewName("display");
			view.addObject("u", u);
			return view;
		}
		view.setViewName("print");
		view.addObject("message", "Invalid user Email or Password");
		return view;
	}
	@GetMapping("/verify-by-phone")
	public ModelAndView verifyByPhone(@RequestParam long phone , @RequestParam String password, ModelAndView view) {
		User u = dao.verifyUser(phone, password);
		if(u!=null) {
			view.setViewName("display");
			view.addObject("u", u);
			return view;
		}
		view.setViewName("print");
		view.addObject("message", "Invalid entered phone or password");
		return view;
	}
	@RequestMapping("/delete-by-id")
	public ModelAndView delete(@RequestParam int id, ModelAndView view) {
		boolean flag = dao.deleteUserById(id);
		if(flag) {
			view.setViewName("print");
			view.addObject("message", "Successfully Deleted");
		}
		view.setViewName("print");
		view.addObject("message", "Unable to Delete due to Invalid Id");
		return view;
	}
	
	
	

}
