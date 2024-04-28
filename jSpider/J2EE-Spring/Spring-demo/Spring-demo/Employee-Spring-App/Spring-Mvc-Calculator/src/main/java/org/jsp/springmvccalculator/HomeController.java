package org.jsp.springmvccalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	

	@RequestMapping("/open-home")
	public ModelAndView openView(Model model) {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		view.addObject("home", "Opening the Home page");
		return view;
	}
	@RequestMapping("/open-view")
	public String openView(@RequestParam String view) {
		return view;
	}
}
