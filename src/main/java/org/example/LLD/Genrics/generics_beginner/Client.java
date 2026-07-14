package org.example.LLD.Genrics.generics_beginner;

public class Client {
    public static void main(String[] args){
        // example for integer value
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println("Integer value: "+ intBox.get());

        // example for String box
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String Value : "+strBox.get());
    }
}
