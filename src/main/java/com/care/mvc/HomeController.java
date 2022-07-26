package com.care.mvc;

import java.lang.ProcessBuilder.Redirect;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@GetMapping("re/index")
	public void index() {}
	@RequestMapping("re/result")
	public String result(HttpServletRequest request,
									Model model,
									RedirectAttributes rs) {
		String id = request.getParameter("id");
		if(id.equals("abc")) {
			model.addAttribute("result", "로그인 성공");
			rs.addFlashAttribute("re","re로그인성공==");
			return "redirect:rsOK";
		}
		return "redirect:rsNO";
	}
	@GetMapping("re/rsOK")
	public String ok(String result, Model model) {
		model.addAttribute("result", result);
		System.out.println("result : "+result);
		return "re/rsOK";
	}
	@GetMapping("re/rsNO")
	public String no() {
		return "re/rsNO";
	}
}










