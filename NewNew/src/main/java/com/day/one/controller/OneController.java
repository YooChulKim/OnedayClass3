package com.day.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class OneController {

	@RequestMapping(value="/")
	public String index() {
	
		return "one/index.tiles";
	}
	
	@RequestMapping(value="/about")
	public String about() {
	
		return "one/about.tiles";
	}
	
	@RequestMapping(value="/contact")
	public String contact() {
	
		return "one/contact.tiles";
	}
	
	
	@RequestMapping(value="/program")
	public String program() {
	
		return "one/program.tiles";
	}
	
	@RequestMapping(value="/join")
	public String join() {
	
		return "one/join.tiles";
	}
	
	@RequestMapping(value="/board")
	public String board() {
	
		return "one/board.tiles";
	}
	
	@RequestMapping(value="/login")
	public String login() {
	
		return "login/login.tiles";
	}
	
	@RequestMapping("/register")
	public String register() {
	
		return "login/register.tiles";
	}
}
