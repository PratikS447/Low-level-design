package org.example.LLD.AdderSubtractor.using_callable_executor_solution;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private  Counter count;
    Lock lock;
    Subtractor(Counter count, Lock lock){
        this.count = count;
        this.lock = lock;
    }

    public Void call() throws Exception{
        for (int i = 1; i <= 10000; i++){
            lock.lock();
            count.val -= i;
            lock.unlock();
        }
        return null;
    }
}
