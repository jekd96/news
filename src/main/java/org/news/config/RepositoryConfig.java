package org.news.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Admin on 16.03.2016.
 */
@Configuration
@EnableJpaRepositories(basePackages = "org.news.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"org.news.entity"})
public class RepositoryConfig {
}
