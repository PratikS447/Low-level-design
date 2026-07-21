package org.example.LLD.LambdasStreams.with_runnable;

public class Client {
    public static void main(String args[]){
        Runnable traditional_runnable = new Runnable() {
            @Override
            public void run() {
                System.out.print("Hello, world");
            }
        };
        traditional_runnable.run();
        System.out.println();
        System.out.println("-----------------------");

        Runnable traditional_runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.print("Hello, world 2");
            }
        };
        traditional_runnable2.run();

//         Lambda Expression
        Runnable lambdaRunnable = () -> System.out.println("Hello, world");
        lambdaRunnable.run();


    }
}
