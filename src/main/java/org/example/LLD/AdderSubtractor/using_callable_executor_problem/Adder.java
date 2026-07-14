package org.example.LLD.AdderSubtractor.using_callable_executor_problem;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Count count;
    Adder(Count count){
        this.count = count;
    }

    public Void call() throws Exception{
        for (int i = 1; i <= 10000; i++){
            count.val += i;
        }
        return null;
    }
}
