package com.caoqian.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.caoqian.cms.dao.ArticleMapper;
import com.caoqian.cms.domain.Article;
import com.caoqian.cms.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	ArticleMapper articleMapper;
	@Override
	public List<Article> selects() {
		// TODO Auto-generated method stub
		return articleMapper.selects();
	}

}
