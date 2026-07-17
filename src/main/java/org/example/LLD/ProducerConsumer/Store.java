package org.example.LLD.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private int maxSize;
    private List<Object> items;

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize(){
        return maxSize;
    }

    public List<Object> getItems(){
        return items;
    }

    public void addItem(){
        System.out.println("Producer production time, current size "+this.items.size());
        this.items.add(new Object());
    }

    public synchronized void remove_Item(){
        System.out.println("Consumer consuming time, current size "+this.items.size());
        this.items.add(new Object());
    }

    public synchronized void removeItem(){
        System.out.println("Consumer consuming time, current size "+this.items.size());
        this.items.remove(this.items.size() -1);
    }
}
