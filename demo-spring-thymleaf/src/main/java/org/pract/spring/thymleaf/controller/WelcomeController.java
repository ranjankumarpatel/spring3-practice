package org.pract.spring.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/")
public class WelcomeController {

	@GetMapping
	public String welcome(@RequestParam(name = "name", defaultValue = "ranjan", required = false) String name,
			Model model) {
		return "/index";
	}

}
