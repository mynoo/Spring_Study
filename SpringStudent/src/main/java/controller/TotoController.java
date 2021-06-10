package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TotoController {
	@RequestMapping(value = "/first.to", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("hahaha", "하하하");
		model.addAttribute("hohoho", "호호호");
		
		return "first";
	}
	
	@RequestMapping(value = "/second.to", method = RequestMethod.GET)
	public ModelAndView hohoho(Model model) {
		ModelAndView mav = new ModelAndView("second");
		
		mav.addObject("hohoho", "가나다");
		
		return mav;
	}
}
