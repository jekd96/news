package org.news.controller;

import org.news.entity.News;
import org.news.entity.User;
import org.news.repository.NewsRepository;
import org.news.repository.UserRepository;
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
    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void init() {

        User getctor = new User();
        getctor.setUsername("Gector");
        getctor.setPassword("12345");
        userRepository.save(getctor);

        News newsOne = new News();
        newsOne.setTitle("Новость 1");
        newsOne.setContent("Контент");
        newsOne.setUser(getctor);
        newsRepository.save(newsOne);

        News newsTwo = new News();
        newsTwo.setTitle("Новость 2");
        newsTwo.setContent("Контент");
        newsOne.setUser(getctor);
        newsRepository.save(newsTwo);

        User silver = new User();
        silver.setUsername("silver");
        silver.setUsername("12345");
        userRepository.save(silver);

        News newsThree = new News();
        newsThree.setTitle("Новость 3");
        newsThree.setContent("Контент");
        newsThree.setUser(silver);
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

    @RequestMapping("/find/{title}")
    public News news(@PathVariable String title) {
        return newsRepository.findНикитаБалбесByTitle(title);
    }


}
