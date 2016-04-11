package org.news.controller;

import org.news.entity.News;
import org.news.entity.User;
import org.news.repository.NewsRepository;
import org.news.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Admin on 11.04.2016.
 */
@RestController
public class UserController {

    @Autowired
    NewsRepository newsRepository;
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/user/{id}")
    public List<News> news(@PathVariable Long id) {
        User user = userRepository.findOne(id);
        return newsRepository.findByUser(user);
    }

}
