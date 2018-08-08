package com.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class IndexController {

	@RequestMapping(value = { "", "/", "/index" }, method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	public String index2() {
		return "index2";
	}

	@RequestMapping(value = "/starter", method = RequestMethod.GET)
	public String start() {
		return "starter";
	}
}
