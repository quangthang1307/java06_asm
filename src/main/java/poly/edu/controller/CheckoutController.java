package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheckoutController {
	@RequestMapping("/checkout")
	public String showCheckout() {
		System.out.println("ádasds");
		return "user/checkout";
	}
}
