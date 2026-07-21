package org.example.LLD.LambdasStreams.lambda_with_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class With_Sort {
    public static void main(String args[]){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Lambda expression for sorting
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // Method reference for sorting
        Collections.sort(names, String::compareTo);

        System.out.println(names);
    }
}
