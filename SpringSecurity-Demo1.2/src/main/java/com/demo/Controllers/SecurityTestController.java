package com.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityTestController {

	@GetMapping("/welcome")
	public String welcomePage() {
		return "welcome-page";

	}

	@ResponseBody
	@GetMapping("/admin")
	public String adminAccessPage() {
		return "admin welocme";
	}

	@ResponseBody
	@GetMapping("/bye")
	public String logoutPage() {
		return "bye bye";
	}

}
