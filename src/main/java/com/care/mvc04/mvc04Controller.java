package com.care.mvc04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("mvc04")//상위 폴더 하나로 명시
public class mvc04Controller {
	@GetMapping("index")
	public String index() {
		return "mvc04_get_post/index";
	}
	@GetMapping("/result")
	public String get_result(HttpServletRequest req,
										Model model) {
		System.out.println("get통신");
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("age"));
		model.addAttribute("n", req.getParameter("name"));
		model.addAttribute("a", req.getParameter("age"));
		model.addAttribute("method", req.getMethod());
		return "mvc04_get_post/result";
	}
	@PostMapping("result")
	public String post_result(
			@RequestParam("name") String n,
			@RequestParam("age") int a,
			Model model,
			HttpServletRequest request) {
		System.out.println(n);
		System.out.println(a);
		model.addAttribute("method", request.getMethod());
		model.addAttribute("n", n);
		model.addAttribute("a", a);
		return "mvc04_get_post/result";
	}
	@PostMapping("obj_result")
	public String post_result(
			Model model, TestDTO dto,
			HttpServletRequest request) {
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		model.addAttribute("dto", dto);
		return "mvc04_get_post/obj_result";
	}
}








