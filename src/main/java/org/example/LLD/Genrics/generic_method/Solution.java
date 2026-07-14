package org.example.LLD.Genrics.generic_method;

public class Solution {
    public static <T> void method(T arr[]){
        for (T a: arr){
            System.out.println(a);
        }
        System.out.println("---------------------");
    }
}
