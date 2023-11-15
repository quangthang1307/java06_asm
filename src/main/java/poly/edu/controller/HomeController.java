package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public String showIndex() {
		System.out.println("sadad");
		System.out.println("abc");
		return "user/index";
	}
	
	@RequestMapping("/login")
	public String showLogin() {
		return "user/login";
	}
	
	@RequestMapping("/register")
	public String showRegister() {
		return "user/register";
	}
	
	@RequestMapping("/forgottenpw")
	public String showForgottenPw() {
		return "user/forgottenpw";
	}
	
	@RequestMapping("/homeadmin")
	public String showHomeAdmin() {
		return "admin/home";
	}
}
