package org.jsp.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = "/open-home")
	public String openHome(Model model) {

		model.addAttribute("user", "Kamlesh");
		return "/WEB-INF/views/home.jsp";
	}
	@RequestMapping("/open-sum")
	public String openSum() {
		return "/WEB-INF/views/sum.jsp";
	}
	@RequestMapping(value = "/sum")
	public String getSum(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + " +" + n2 + " =" + (n1 + n2);
		model.addAttribute("result", result);
		return "print.jsp";
	}

//	@RequestMapping(value = "/diff")
//	public String getDiff(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
//		String result = n1 + " -" + n2 + " =" + (n1 - n2);
//		model.addAttribute("result", result);
//		return "print.jsp";
//	}
//	@RequestMapping(value = "/mul")
//	public String getmul(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
//		String result = n1 + " *" + n2 + " =" + (n1 * n2);
//		model.addAttribute("result", result);
//		return "print.jsp";
//	}
//	@RequestMapping(value = "/getQutient")
//	public String getQutient(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
//		String result = n1 + " /" + n2 + " =" + (n1/ n2);
//		model.addAttribute("result", result);
//		return "print.jsp";
//	}
//	@RequestMapping(value = "/getRemider")
//	public String getremider(@RequestParam(name = "n1") int n1, @RequestParam(name = "n2") int n2, Model model) {
//		String result = n1 + " %" + n2 + " =" + (n1%n2);
//		model.addAttribute("result", result);
//		return "print.jsp";
//	}
	
}
