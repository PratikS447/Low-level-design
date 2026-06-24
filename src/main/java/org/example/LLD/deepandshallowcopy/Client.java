package org.example.LLD.deepandshallowcopy;

public class Client {
    public static void main(String args[]){
        Animal dog1 = new Animal("dog", "4 legs");
        dog1.print();
        dog1.name = "lion";
        // deep copy of the object dog
        Animal lion = Animal.createDeepCopy(dog1);
        lion.print();

        // shallow copy of the object dog
        dog1.name = "Tiger";
        Animal Tiger = new Animal(dog1);

    }
}
