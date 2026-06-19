package org.example.LLD.overloading;

public class Client {
    public static void main(String[] args) {
        Display d = new Display();
        d.print();
        d.print("Pratik");
        d.print("Pratik", 23);
    }
}
