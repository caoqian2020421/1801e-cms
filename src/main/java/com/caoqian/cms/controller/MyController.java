package com.caoqian.cms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.caoqian.cms.domain.Article;
import com.caoqian.cms.service.ArticleService;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @ClassName: MyController 
 * @Description: 个人中心
 * @author: 曹
 * @date: 2020年4月28日 下午7:24:30
 */
@Controller
public class MyController {

	@Resource
	private ArticleService articleService;
	
	/**
	 * 
	 * @Title: index 
	 * @Description: 进入个人中心首页
	 * @return
	 * @return: String
	 */
	@RequestMapping("index")
	public String index() {
		return "my/index";
		
	}
	
	
	@RequestMapping("articles")
	public String articles(Model model,Article article,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "6")Integer pageSize) {
		
		PageInfo<Article> info = articleService.selects(article,pageNum,pageSize);
		model.addAttribute("info", info);
		return "my/articles";
		
	}
}
