package com.blog.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.dao.ArticleInfoVoMapper;
import com.blog.vo.ArticleInfoVo;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	// @Autowired
	// private ArticleMapper articleMapper;
	//
	// @Autowired
	// private UserMapper userMapper;
	//
	// @Autowired
	// private CategoryMapper categoryMapper;

	@Autowired
	private ArticleInfoVoMapper articleInfoVOMapper;

	// @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
	// @ResponseBody
	// public ArticleInfoVo getArticleInfo(@PathVariable("id") Integer id) {
	//
	// Article article = articleMapper.selectById(id);
	// User user = userMapper.selectById(article.getId());
	// Category category = categoryMapper.selectById(article.getId());
	// ArticleInfoVo articleListVO = new ArticleInfoVo(article.getId(),
	// article.getTitle(), article.getContent(),
	// user.getUsername(), category.getName());
	// return articleListVO;
	// }

	@RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ArticleInfoVo getArticleInfo(@PathVariable("id") Integer id) {
		ArticleInfoVo articleListVO = articleInfoVOMapper.selectById(id);
		return articleListVO;
	}

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	@ResponseBody
	public List<ArticleInfoVo> getArticleInfo() {
		return articleInfoVOMapper.selectList(null);
	}
}
