package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
	int a = 10;
	int b = 20;
	
	@RequestMapping("/test")
	public String firstHandler() {
		int a=10;
		int b=20;
		return "Just for testing !! \t sum of a and b = "+(a+b);
	}
	
	@RequestMapping("/index")
	public String indexPage() {
		return "Index.html";
	}

}
