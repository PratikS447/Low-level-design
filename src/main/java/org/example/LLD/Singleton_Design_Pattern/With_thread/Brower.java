package org.example.LLD.Singleton_Design_Pattern.With_thread;

public class Brower {
    private volatile static Brower instance;
    private Brower(){
        // Default constructor have to be Private in singleton Pattern
    }

    public static Brower getInstance(){
        if (instance == null){
            synchronized (Brower.class){
                if (instance == null){
                    instance = new Brower();
                }
            }
        }
        return instance;
    }

    public void print(){
        System.out.println("Brower is initialized.");
    }
}
