package org.news.repository;

import org.news.entity.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 16.03.2016.
 */
@Repository
public interface NewsRepository extends CrudRepository<News,Long> {
}
