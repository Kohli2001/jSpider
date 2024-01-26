package org.jsp.springmvcdemo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister() {
		ModelAndView view = new ModelAndView();
		view.setViewName("register");
		view.addObject("u", new User());
		return  view;
	}
	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute User u) {
		System.out.println(u);
		ModelAndView view = new ModelAndView();
		view.setViewName("print");
		view.addObject("result", "Printted the user details");
		return view;
	}
	
//	@RequestMapping("/register")
//	public String getDetails(@RequestParam(name="id") int id , @RequestParam(name="name")String name,@RequestParam(name="phone") 
//	long phone, @RequestParam(name="age") int age,@RequestParam(name="gender") String gender, @RequestParam(name="email") String email,
//	@RequestParam(name="password") String password , Model model) {
//		List<Object> result1 = new ArrayList<Object>();
//		result1.add(id);
//		result1.add(name);
//		result1.add(phone);
//		result1.add(age);
//		result1.add(gender);
//		result1.add(email);
//		result1.add(password);
//		
//		model.addAttribute("result", result1);
//		for(Object ele: result1) {
//			System.out.println(ele);
//		}
//		return  "print";
//	}

	@RequestMapping(value = "/open-home")
	public String openHome(Model model) {
		model.addAttribute("user", "Kamlesh");
		return "home";
	}
	
	@RequestMapping("/open-view")
	public String openView(@RequestParam String view) {
		return view;
	}
	@RequestMapping(value = "/sum")
	public String getSum(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + " +" + n2 + " =" + (n1 + n2);
		model.addAttribute("result", result);
		return "print";
	}

	@RequestMapping(value = "/diff")
	public String getDiff(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + " -" + n2 + " =" + (n1 - n2);
		model.addAttribute("result", result);
		return "print";
	}
	@RequestMapping(value = "/mul")
	public String getmul(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + " *" + n2 + " =" + (n1 * n2);
		model.addAttribute("result", result);
		return "print";
	}
	@RequestMapping(value = "/getQutient")
	public String getQutient(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + " /" + n2 + " =" + (n1/ n2);
		model.addAttribute("result", result);
		return "print";
	}
	@RequestMapping(value = "/getReminder")
	public String getReminder(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + " %" + n2 + " =" + (n1%n2);
		model.addAttribute("result", result);
		return "print";
	}
	
}
