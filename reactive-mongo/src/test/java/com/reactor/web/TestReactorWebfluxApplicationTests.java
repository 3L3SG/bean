package com.reactor.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

//@SpringBootTest
class TestReactorWebfluxApplicationTests {

    @Test
    void contextLoads() throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> feature = CompletableFuture.supplyAsync(() -> Flux.just(1, 2, 3, 4).delayElements(Duration.ofSeconds(2)).blockLast());

        CompletableFuture<Integer> feature2 = CompletableFuture.supplyAsync(() -> Flux.just(10, 20).delayElements(Duration.ofSeconds(2)).blockLast());
        System.out.println(feature2.get());
        System.out.println(feature.get());

//        CompletableFuture allOf = CompletableFuture.allOf(feature2, feature);
//        allOf.join();
        System.out.println("main");
    }

}
