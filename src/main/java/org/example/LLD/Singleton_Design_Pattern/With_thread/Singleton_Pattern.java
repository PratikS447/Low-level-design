package org.example.LLD.Singleton_Design_Pattern.With_thread;

public class Singleton_Pattern implements Runnable{

    public void run(){
        Brower brower = Brower.getInstance();
        System.out.println(Thread.currentThread().getName() +" got instance : "+brower.hashCode());
    }
    public static void main(String args[]){
        Singleton_Pattern task = new Singleton_Pattern();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
