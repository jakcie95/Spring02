package com.care.mvc02;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@Inject
	TestService ts;
	
	@GetMapping("test_index")
	public String testIndex() {
		System.out.println("ts : "+ts);
		
		ts.service();
		return "member/index";
	}
}
