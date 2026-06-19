package org.example.LLD.overridding;

public class Client {
    public static void main(String args[]){
        Animal a = new Dog();
        a.doSomething();

        Animal b = new Animal();
        b.doSomething();
    }
}
