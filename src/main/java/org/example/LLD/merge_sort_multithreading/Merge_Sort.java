package org.example.LLD.merge_sort_multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Merge_Sort implements Callable<List<Integer>> {
    List<Integer> arrayList;
    ExecutorService ex;
    Merge_Sort(List<Integer> arrayList, ExecutorService ex){
        this.arrayList = arrayList;
        this.ex = ex;
    }

    public List<Integer> call() throws Exception{
        if (arrayList.size() <= 1){
            return arrayList;
        }

        int mid = arrayList.size()/2;

        List<Integer> left_list = new ArrayList<>();
        for (int i = 0; i < mid; i++){
            left_list.add(arrayList.get(i));
        }

        List<Integer> right_list = new ArrayList<>();
        for (int i = mid+1; i < arrayList.size(); i++){
            right_list.add(arrayList.get(i));
        }

        Merge_Sort task1 = new Merge_Sort(left_list, ex);
        Merge_Sort task2 = new Merge_Sort(right_list, ex);

        Future<List<Integer>> leftSortedArray = ex.submit(task1);
        Future<List<Integer>> rightSortedArray = ex.submit(task2);

        left_list = leftSortedArray.get();
        right_list = rightSortedArray.get();

        List<Integer> final_merged_array = new ArrayList<>();

        int i = 0, j = 0;

        while(i < left_list.size() && j < right_list.size()){
            if(left_list.get(i) < right_list.get(j)){
                final_merged_array.add(left_list.get(i));
                i++;
            }else{
                final_merged_array.add(right_list.get(j));
                j++;
            }
        }

        while(i < left_list.size()){
            final_merged_array.add(left_list.get(i));
            j++;
        }

        while(j < right_list.size()){
            final_merged_array.add(right_list.get(j));
            j++;
        }

        return final_merged_array;
    }
}
