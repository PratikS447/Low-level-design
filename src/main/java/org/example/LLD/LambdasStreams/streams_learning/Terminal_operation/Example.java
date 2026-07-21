package org.example.LLD.LambdasStreams.streams_learning.Terminal_operation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String args[]){
        // Iterator
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(num -> System.out.print(num+" "));

        // Reduce
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        int sum = stream1.reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(sum);
        System.out.println();

        // Collect
        System.out.println("-------------------");
        Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
        List<Integer> numbers = stream3.collect(Collectors.toList());
        System.out.println(numbers);
    }
}
