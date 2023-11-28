package com.example.mongo.mongo.services;

import com.example.mongo.mongo.model.Vechical;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MyMongoRepository extends MongoRepository<Vechical, String> {

    @Query("{'user.id' :  ?0}")
    Optional<Vechical> findVechicalByUserId(String userId);

    Vechical findByUser_Name(String userName);
    Vechical findByUser_Id(String userId);

//    @Query("{'user.id' :  ?0}")
    List<Vechical> findVechicalByUserName(String userName);

    @Query("{'user' :  ?0}")
    List<Vechical> justFind(String user);
}

