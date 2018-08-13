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

	/**
	 * 文章管理页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/article", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("articleInfo", articleService.listArticleIndexVOs());
		return "article/index";
	}

	/**
	 * 发布文章/编辑文章页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/article/editor", method = RequestMethod.GET)
	public String editor() {
		return "article/editor";
	}
}
