package com.learn.reactor.core;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
        ReactiveSources.intNumbersFluxWithException().subscribe(item -> System.out.println(item), error -> System.out.println("error occured " + error));

        // Print values from intNumbersFluxWithException and continue on errors
        ReactiveSources.intNumbersFluxWithException().doOnError(a -> System.out.println("error occured" + a)).subscribe(System.out::println);
        ReactiveSources.intNumbersFluxWithException().onErrorContinue((error, i) -> System.out.println("error occured" + i)).subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
        ReactiveSources.intNumbersFluxWithException().onErrorResume(error -> Flux.just(-1, -2)).subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
