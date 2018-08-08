package com.blog.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.service.ArticleService;

@Controller
@RequestMapping(value = "/admin")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("articleInfo", articleService.listArticleInfo());
		return "article/index";
	}

	@RequestMapping(value = "/article/edit", method = RequestMethod.GET)
	public String edit() {
		return "article/edit";
	}
}
