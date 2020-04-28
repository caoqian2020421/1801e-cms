package com.caoqian.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.caoqian.cms.dao.ArticleMapper;
import com.caoqian.cms.domain.Article;
import com.caoqian.cms.service.ArticleService;
import com.caoqian.common.utils.DateUtil;
import com.caoqian.common.utils.StringUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Resource
	ArticleMapper articleMapper;
	
	@Override
	public PageInfo<Article> selects(Article article, Integer pageNum, Integer pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		
		List<Article> list = articleMapper.selects(article);
		
		return new PageInfo<Article>(list);
	}
    
	
	
}
