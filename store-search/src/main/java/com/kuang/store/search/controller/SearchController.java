package com.kuang.store.search.controller;


import com.kuang.store.search.service.StoreSearchService;
import com.kuang.store.search.vo.SearchParam;
import com.kuang.store.search.vo.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SearchController {
    @Autowired
    StoreSearchService storeSearchService;

    @GetMapping(value = "/list.html")
    public String listPage(SearchParam param, Model model, HttpServletRequest request) {

        param.set_queryString(request.getQueryString());

        //1、根据传递来的页面的查询参数，去es中检索商品
        SearchResult result = storeSearchService.search(param);

        model.addAttribute("result",result);

        return "list";
    }
}
