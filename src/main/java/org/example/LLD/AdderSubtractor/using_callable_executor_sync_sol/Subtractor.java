package org.example.LLD.AdderSubtractor.using_callable_executor_sync_sol;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Counter count;
    Subtractor(Counter count){
        this.count = count;
    }

    public Void call() throws Exception{
        for (int i = 1; i <= 10000; i++){
            count.decreament_By_X(i);
        }
        return null;
    }
}
