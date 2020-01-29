package com.test.soom.example

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WelcomeController {
	@GetMapping("/welcome")
	fun welcome(model: Model):String {
		model.addAttribute("greeting", "Hello Thymeleaf!")
		return "welcome"
	}
}