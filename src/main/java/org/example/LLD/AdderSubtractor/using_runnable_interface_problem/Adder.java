package org.example.LLD.AdderSubtractor.using_runnable_interface_problem;

public class Adder implements Runnable{
    Counter count;

    Adder(Counter count){
        this.count = count;
    }

    public void run(){
        for (int i = 1; i <= 10000; i++){
            count.val += i;
        }
    }
}
