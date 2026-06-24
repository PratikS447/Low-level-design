package org.example.LLD.deepandshallowcopy;

public class Animal {
    String name;
    String category;
    Animal(String name, String category){
        this.name = name;
        this.category = category;
    }

    // shallow copy in java
    Animal(Animal other){
        other.name = name;
        other.category = category;
    }

    // Deep copy in java
    public static Animal createDeepCopy(Animal other){
        return new Animal(other.name, other.category);
    }

    void print(){
        System.out.println(name+", "+category);
    }
}
