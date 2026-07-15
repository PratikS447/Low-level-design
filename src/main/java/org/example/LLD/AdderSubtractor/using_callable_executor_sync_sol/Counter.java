package org.example.LLD.AdderSubtractor.using_callable_executor_sync_sol;

public class Counter {
    int val = 0;

    public synchronized void increament_By_X(int val){
        this.val += val;
    }

    public synchronized void decreament_By_X(int val){
        this.val -= val;
    }
}
