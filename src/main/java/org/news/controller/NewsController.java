package org.news.controller;

import org.news.entity.News;
import org.news.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Admin on 16.03.2016.
 */
@RestController
public class NewsController {

    @Autowired
    NewsRepository newsRepository;

    @PostConstruct
    public void init() {

        News newsOne = new News();
        newsOne.setTitle("Новость 1");
        newsOne.setContent("Контент");

        newsRepository.save(newsOne);

        News newsTwo = new News();
        newsTwo.setTitle("Новость 2");
        newsTwo.setContent("Контент");

        newsRepository.save(newsTwo);

        News newsThree = new News();
        newsThree.setTitle("Новость 3");
        newsThree.setContent("Контент");

        newsRepository.save(newsThree);
    }

    @RequestMapping("/news")
    public List<News> newsList() {
        return new ArrayList<News>((Collection<? extends News>) newsRepository.findAll());
    }

    @RequestMapping("/news/{newsId}")
    public News news(@PathVariable Long newsId) {
        return newsRepository.findOne(newsId);
    }
}
