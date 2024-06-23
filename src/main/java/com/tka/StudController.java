package com.tka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudController {

	@GetMapping("/")
	public String openLoginPage() {
		System.out.println("I'm in controller");
		return "login";
	}

	@GetMapping("sendData")
	public String getdata(@RequestParam String name) {
		System.out.println(name);
		System.out.println("I'm in controller 2");
		return "login";
	}

	@GetMapping("sendDataintoForm")
	public String getdata(@ModelAttribute User user) {
		System.out.println(user);
		System.out.println("I'm in controller 3");
		return "login";
	}
}
