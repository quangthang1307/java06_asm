package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	@RequestMapping("/cart")
	public String showCart() {
		System.out.println("ád");
		return "user/cart";
	}
}
