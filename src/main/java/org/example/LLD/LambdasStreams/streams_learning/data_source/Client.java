package org.example.LLD.LambdasStreams.streams_learning.data_source;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Client {
    public static void main(String args[]){
//         Example 1 :- USING COLLECTION
        List<String> fruits = Arrays.asList("Apple", "Banana", "Oranges", "Mango");
//         creating a stream from collection
        Stream<String> fruitStream = fruits.stream();
        System.out.println(fruitStream);
        System.out.println("------------------------");

        // Example 2 :- USING ARRAY
        String city[] = {"Delhi", "New York", "London", "Tokyo", "Pairs"};
        // creating a stream from an array
        Stream<String> city_stream = Arrays.stream(city);
        System.out.println(city_stream);
        System.out.println("----------------------------");

        // Example 3 :- STREAM OF INTEGER
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(System.out::println);
    }
}
