package org.example.LLD.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();

        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor sub = new Subtractor(count);

        Future<Void> add_submit = ex.submit(adder);
        Future<Void> sub_submit = ex.submit(sub);

        add_submit.get();
        sub_submit.get();

        System.out.println(count.val);
    }
}
