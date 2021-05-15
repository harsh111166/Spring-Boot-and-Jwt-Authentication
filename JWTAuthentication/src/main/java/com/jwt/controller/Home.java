package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@RequestMapping("/welcome")
	public String welcome() {
		String text = "this is welcome page";
		text += " this page in not allowed to unauthenticated users";
		return text;
	}

	@RequestMapping("/getusers")
	public String getUser() {

		return "{\"name\":\"Durgesh\"}";
	}

}
