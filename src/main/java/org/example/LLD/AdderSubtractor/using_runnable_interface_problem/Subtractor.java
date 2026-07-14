package org.example.LLD.AdderSubtractor.using_runnable_interface_problem;

public class Subtractor implements Runnable {
    Counter count;

    Subtractor(Counter count){
        this.count = count;
    }

    public void run(){
        for (int i = 1; i <= 10000; i++){
            count.val -= i;
        }
    }
}
