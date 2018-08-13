package com.blog.service;

import java.util.List;

import com.blog.vo.ArticleEditerVO;
import com.blog.vo.ArticleIndexVO;

public interface ArticleService {

	List<ArticleIndexVO> listArticleIndexVOs();

	ArticleEditerVO getArticleEditorVOById(Integer id);
}
