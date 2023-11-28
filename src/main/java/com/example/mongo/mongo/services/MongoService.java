package com.example.mongo.mongo.services;

import com.example.mongo.mongo.model.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class MongoService {

    private final AsyncService asyncService;

    @Async
    @Transactional
    public CompletableFuture<? extends Parent> gett(Long id) {
          return asyncService.gett(id).whenComplete((parent, throwable) -> {

             });
    }


    public void anotherMethod () {
    }
}
