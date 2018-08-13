package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog.dao.ArticleEditorVOMapper;
import com.blog.dao.ArticleIndexVOMapper;
import com.blog.service.ArticleService;
import com.blog.vo.ArticleEditerVO;
import com.blog.vo.ArticleIndexVO;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleIndexVOMapper articleIndexVOMapper;

	@Autowired
	private ArticleEditorVOMapper articleEditerVOMapper;

	@Override
	public List<ArticleIndexVO> listArticleIndexVOs() {
		return articleIndexVOMapper.selectList(null);
	}

	@Override
	public ArticleEditerVO getArticleEditorVOById(Integer id) {
		return articleEditerVOMapper.getAritcleEditorVOByIdUsingXml(id);
	}
}
