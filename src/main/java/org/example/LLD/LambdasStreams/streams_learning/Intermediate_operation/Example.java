package org.example.LLD.LambdasStreams.streams_learning.Intermediate_operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String args[]){

        // FILTER AND MAPPING EXAMPLE
        List<String> fruits = Arrays.asList("Apple", "Banana", "Oranges", "Mango");
        List<String> res = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // Collect and .toList IS A TERMINAL OPERATION
        System.out.println(res);

        System.out.println("------------------------");

        // FILTER
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.filter(num -> num % 2 == 0)
                .map(num -> num*num)
                .forEach(num -> System.out.print(num+" ")); // TERMINAL OPERATION
        System.out.println();

        // MAP
        System.out.println("----------------------------");
        Stream<Integer> num = Stream.of(1, 2, 3, 4, 5);
        num.map(n -> n*n).forEach(it -> System.out.print(it+" "));
        System.out.println();

    }
}
