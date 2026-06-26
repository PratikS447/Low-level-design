package org.example.LLD.merge_sort_multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();
        List<Integer> ls =List.of(1,4,56,3,2,43,2,3,32,23,3);

        Merge_Sort sort = new Merge_Sort(ls, ex);

        Future<List<Integer>> res = ex.submit(sort);

        ls = res.get();

        System.out.println(ls);
    }
}
