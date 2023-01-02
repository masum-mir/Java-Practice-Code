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
<<<<<<< HEAD
		int a=10;
		int b=20;
		return "Just for testing !! \t sum of a and b = "+(a+b);
=======
		return "Just for testing !! \t sum a and b : " +(a+b);
>>>>>>> 0f65f7abb0541a50ed112c53a15aceb4cae6e09f
	}

}
