package com.kuang.store.search.service;

import com.kuang.store.search.vo.SearchParam;
import com.kuang.store.search.vo.SearchResult;


public interface StoreSearchService {
    SearchResult search(SearchParam param);
}
