package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog.dao.ArticleInfoVoMapper;
import com.blog.service.ArticleService;
import com.blog.vo.ArticleInfoVo;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleInfoVoMapper articleInfoVOMapper;

	@Override
	public List<ArticleInfoVo> listArticleInfo() {
		return articleInfoVOMapper.selectList(null);
	}

}
