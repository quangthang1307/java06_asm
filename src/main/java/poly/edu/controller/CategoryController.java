package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	@RequestMapping("/category")
	public String showCategory() {
		System.out.println("them cai nua ne");
		
		return "user/category";
	}
}
