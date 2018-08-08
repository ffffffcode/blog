package com.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class TageCategoryController {

	@RequestMapping(value = "/tag-category", method = RequestMethod.GET)
	public String index() {
		return "tag-category/index";
	}
}
