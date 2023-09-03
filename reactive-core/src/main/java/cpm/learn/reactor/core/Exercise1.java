package cpm.learn.reactor.core;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(System.out::println);
        System.out.println("-------------------------------------");

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().filter(i -> i < 5).forEach(System.out::println);
        System.out.println("-------------------------------------");

        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(i -> i > 5).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println(StreamSources.intNumbersStream().filter(i -> i > 5).findFirst().orElse(-1));
        System.out.println("-------------------------------------");

        // Print first names of all users in userStream
        StreamSources.userStream().map(u -> u.getFirstName()).forEach(System.out::println);
        System.out.println("-------------------------------------");

        // Print first names in userStream for users that have IDs from number stream
        List<Integer> ids = StreamSources.intNumbersStream().collect(Collectors.toList());
        StreamSources.userStream().filter(u -> ids.contains(u.getId())).map(User::getFirstName).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //same as above but using flatmap
        StreamSources.intNumbersStream().flatMap(i -> StreamSources.userStream().filter(u -> u.getId() == i)).
                map(User::getFirstName).forEach(System.out::println);
        System.out.println("-------------------------------------");

        //same as above, but an optimal solution
        StreamSources.userStream().filter(u -> StreamSources.intNumbersStream().anyMatch(i -> i == u.getId())).
                map(User::getFirstName).forEach(System.out::println);

    }

}
