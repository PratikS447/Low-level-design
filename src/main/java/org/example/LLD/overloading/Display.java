package org.example.LLD.overloading;

public class Display {
    void print(){
        System.out.println("Hello from method with no parameter");
    }

    void print(String name){
        System.out.println("Hello from method with a single parameter");
    }

    void print(String name, int age){
        System.out.println("Hello from method with 2 parameter");
    }
}
