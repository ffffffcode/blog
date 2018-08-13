package com.blog.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.service.ArticleService;
import com.blog.vo.ArticleEditerVO;

@RestController
@RequestMapping(value = "/api/article")
public class ArticleApiController {

	@Autowired
	private ArticleService articleService;

	/**
	 * 根据id获取需要编辑的文章的信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/editor/{id}", method = RequestMethod.GET)
	public ArticleEditerVO editor(@PathVariable Integer id) {
		return articleService.getArticleEditorVOById(id);
	}
}
