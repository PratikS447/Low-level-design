package org.example.LLD.LambdasStreams.lambda_with_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String args[]){
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");
        // Traditional approach
        List<String> filtered_Traditional = new ArrayList<>();
        for (String fruit: fruits){
            if(fruit.startsWith("A")){
                filtered_Traditional.add(fruit);
            }
        }
        System.out.println(filtered_Traditional);

        // USING LAMBDA AND JAVA STREAM API
        List<String> filtered_lambda = fruits.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(filtered_lambda);
    }
}
