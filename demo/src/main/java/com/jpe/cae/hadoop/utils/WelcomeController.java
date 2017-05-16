package com.jpe.cae.hadoop.utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class WelcomeController {

	@GetMapping
	public String print(@RequestParam("a") String a, @RequestParam("b") String b, @RequestParam("c") String c) {

		return a + " : " + b + " : " + c;

	}

}
