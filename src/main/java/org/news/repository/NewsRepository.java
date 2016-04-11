package org.news.repository;

import org.news.entity.News;
import org.news.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Admin on 16.03.2016.
 */
@Repository
public interface NewsRepository extends CrudRepository<News,Long> {
    News findНикитаБалбесByTitle(String title);
    List<News> findByUser(User user);
}
