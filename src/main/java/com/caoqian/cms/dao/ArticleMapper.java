package com.caoqian.cms.dao;

import java.util.List;

import com.caoqian.cms.domain.Article;

/**
 * 
 * @ClassName: ArticleMapper 
 * @Description: 文章mapper
 * @author: 曹
 * @date: 2020年4月27日 下午7:10:44
 */
public interface ArticleMapper {

	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章列表查询
	 * @param article
	 * @return
	 * @return: List<Article>
	 */

	List<Article> selects(Article article);
}
