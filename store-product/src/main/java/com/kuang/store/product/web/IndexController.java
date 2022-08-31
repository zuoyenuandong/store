package com.kuang.store.product.web;


import com.kuang.store.product.entity.CategoryEntity;
import com.kuang.store.product.service.CategoryService;
import com.kuang.store.product.vo.Catelog2Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    CategoryService categoryService;


    @GetMapping({"/","/index","/index.html"})
    public String indexPage(Model model){
        List<CategoryEntity> level1Categorys = categoryService.getLevel1Categorys();

        model.addAttribute("categorys",level1Categorys);
        return "index";
    }

    //index/json/catalog.json
    @GetMapping(value = "/index/json/catalog.json")
    @ResponseBody
    public Map<String, List<Catelog2Vo>> getCatalogJson() {

        Map<String, List<Catelog2Vo>> catalogJson = categoryService.getCatalogJson();

        return catalogJson;

    }
 }
