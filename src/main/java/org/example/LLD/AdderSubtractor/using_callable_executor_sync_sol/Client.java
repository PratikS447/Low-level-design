package org.example.LLD.AdderSubtractor.using_callable_executor_sync_sol;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String args[]) throws ExecutionException, InterruptedException{
        Counter count = new Counter();

        ExecutorService ex = Executors.newCachedThreadPool();
        Adder add = new Adder(count);
        Subtractor sub = new Subtractor(count);

        Future<Void> res1 = ex.submit(add);
        Future<Void> res2 = ex.submit(sub);

        res1.get();
        res2.get();

        System.out.println(count.val);
    }
}
