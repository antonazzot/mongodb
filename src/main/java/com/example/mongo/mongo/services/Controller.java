package com.example.mongo.mongo.services;

import com.example.mongo.mongo.model.ChildSecond;
import com.example.mongo.mongo.model.Parent;
import com.example.mongo.mongo.model.User;
import com.example.mongo.mongo.model.Vechical;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping(value = "/appp", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Authentication parameters point")
@RequiredArgsConstructor
@Slf4j
public class Controller {
    private final MyMongoRepository mongoRepository;
    private final MyUserMongoRepository myUserMongoRepository;
    private final MongoService mongoService;

    private final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Controller.class);

    @Value("${profile.str}")
    private String str;

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    @PostMapping("/save")
    @Operation(summary = "Verify existing password")
    public void save(ChildSecond childSecond) {
        Vechical save = mongoRepository.save(Vechical.builder()
                .name("qqqqqqqq")
                .user(myUserMongoRepository.save(User.builder()
                        .name("edfde")
                        .familyName("wdef")
                        .build()))
                .build());

        System.out.println(save);
    }

    @GetMapping("/pet/{id}")
    public ResponseEntity<? extends Parent> gett(@PathVariable Long id) throws ExecutionException, InterruptedException {
        if (id == 1L) {
            Parent gett = mongoService.gett(id).get();
            return ResponseEntity.ok(gett);
        }
        mongoService.gett(id);
        return null;
    }

    @GetMapping("/get")
    public String get() {
        mongoService.anotherMethod();

        System.out.println("////////////////////////////////");
        logger.info("****************");

        log.info("jsdhfbvjhfbjh");
        return str;
    }
}
