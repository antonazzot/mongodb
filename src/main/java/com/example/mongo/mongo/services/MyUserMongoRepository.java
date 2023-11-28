package com.example.mongo.mongo.services;

import com.example.mongo.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyUserMongoRepository extends MongoRepository<User, String> {

}
