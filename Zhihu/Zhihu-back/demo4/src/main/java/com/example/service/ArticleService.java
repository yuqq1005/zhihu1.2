package com.example.service;

import com.example.pojo.Article;
import com.example.pojo.PageBean;

public interface ArticleService {
    //新增文章
    void add(Article article);
   //条件分页查询
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
