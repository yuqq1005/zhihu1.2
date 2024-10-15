package com.example.controller;

import com.example.pojo.Article;
import com.example.pojo.PageBean;
import com.example.pojo.Result;
import com.example.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    //登录认证部分演示
   /* @GetMapping("list")
    public Result<String> list(*//*@RequestHeader(name = "Authorization")String token, HttpServletResponse response*//*) {
       *//* //验证toktn
        try{
            Map<String,Object> claims= JwtUtil.parseToken(token);
            return Result.success("所欲的文章数据");
        }
       catch (Exception e){
            //http请求状态码401
           response.setStatus(401);
           return Result.error("未登录");
       }*//*
        return Result.success("所需的文章数据");
        //校验工作交给拦截器来做

    }*/
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result add(@RequestBody @Validated Article article) {
        articleService.add(article);
        return Result.success();
    }
    @GetMapping
    public Result<PageBean<Article>> list(
            Integer pageNum,
            Integer pageSize,
            @RequestParam(required = false) Integer categoryId,//不必要参数
            @RequestParam(required = false) String state//不必要参数
    ) {
        PageBean<Article> pb =  articleService.list(pageNum,pageSize,categoryId,state);
        /* private Long total;//总条数
           private List<T> items;//当前页数据集合*/
        return Result.success(pb);
    }

}
