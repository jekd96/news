package org.news.repository;

import org.news.entity.News;
import org.news.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 11.04.2016.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
