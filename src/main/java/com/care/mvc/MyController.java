package com.care.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //반드시 필요
public class MyController {
	@RequestMapping("test")
	public void test() {
		System.out.println("===test연결");
	}
	//localhost:8085/mvc 까지는 컨트롤러로 연결 이후는 매핑을 이용해서 연결
	@RequestMapping(value="index") //인터넷 url
	public String Index() {//메소드명은 중요하지 않음
		return"member/index"; //jsp파일경로, .jsp는 기본값으로 잡혀있음으로 쓸필요 없음
	}
	@RequestMapping(value="login")
	public String Login(Model model) {
		model.addAttribute("test","로그인페이지");
		return "member/login";
	}
	@RequestMapping(value="logout")
	public ModelAndView Logout() {
		ModelAndView mv = new ModelAndView(); //따로 객체를 만들어서 사용해야함
		mv.addObject("logout", "로그아웃페이지입니다");
		mv.setViewName("member/logout");
		
		return mv;
	}
}





