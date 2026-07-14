package org.example.LLD.AdderSubtractor.using_runnable_interface;

public class Client {
    public static void main(String args[]){
        Counter cnt = new Counter();

        Adder add = new Adder(cnt);
        Subtractor sub = new Subtractor(cnt);

        Thread t1 = new Thread(add);
        t1.start();

        Thread t2 = new Thread(sub);
        t2.start();

        System.out.println(cnt.val);
    }
}
