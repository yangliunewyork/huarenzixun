package com.orchid.huarenzixun.repository;


import com.orchid.huarenzixun.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface ArticleRepository extends
        ElasticsearchRepository<Article, Integer> {

    Article findOne(Integer id);

    List<Article> findByTitle(String title);

    Page<Article> findByTitle(String title, Pageable pageable);

}