package com.example.mongo.mongo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableMongoRepositories(basePackages = {"com.example.mongo"})
@EntityScan(basePackages = {"com.example.mongo"})
@EnableTransactionManagement
public class MongoDbConfig {
}
