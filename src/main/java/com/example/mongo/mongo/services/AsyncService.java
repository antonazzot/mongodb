package com.example.mongo.mongo.services;

import com.example.mongo.mongo.model.ChildSecond;
import com.example.mongo.mongo.model.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class AsyncService {

    @Async
    public CompletableFuture< ? extends Parent> gett(Long id) {
        CompletableFuture.supplyAsync(() -> new ChildSecond(id, "famaly2",1, true, new ArrayList<>()))
                .thenAccept((childSecond -> {
                    System.out.println(childSecond);
                }));
        return null;
    }
}
