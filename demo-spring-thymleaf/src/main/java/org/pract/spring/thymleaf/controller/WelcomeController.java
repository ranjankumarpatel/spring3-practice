package org.pract.spring.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/")
public class WelcomeController {

	@GetMapping
	public String welcome(Model model) {
		return "/index";
	}

	@GetMapping("/properties")
	@ResponseBody
	java.util.Properties properties() {
		return System.getProperties();
	}

}
