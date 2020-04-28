package com.caoqian.cms.service;

import java.util.List;

import com.caoqian.cms.domain.Article;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: ArticleService 
 * @Description: 
 * @author: 曹
 * @date: 2020年4月28日 下午7:32:34
 */
public interface ArticleService {

	
/**
 * 
 * @Title: selects 
 * @Description: 文章列表
 * @param article
 * @param pageNum
 * @param pageSize
 * @return
 * @return: PageInfo<Article>
 */
	PageInfo<Article> selects(Article article, Integer pageNum, Integer pageSize);
}
