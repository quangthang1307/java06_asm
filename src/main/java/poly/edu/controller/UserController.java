package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/editprofile")
	public String showEditprofile() {
		return "user/editprofile";
	}
}
