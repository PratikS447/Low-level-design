package org.example.LLD.Singleton_Design_Pattern.Without_thread;

public class Singleton_Pattern {
    public static void main(String args[]){
        Brower obj1 = Brower.getInstance();
        System.out.println(obj1.hashCode());

        Brower obj2 = Brower.getInstance();
        System.out.println(obj2.hashCode());
    }
}
