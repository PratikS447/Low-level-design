package org.example.LLD.Genrics.bounded_type_parameter;

public class Client {
    public static void main(String args[]){
        Order laptop = new Order("Gaming Laptop", 2.5);

        double cost = Shipping.calculate_Shipping(laptop);

        System.out.println("Item : "+ laptop.getDescription());
        System.out.println("Weight : "+laptop.getWeight());
        System.out.println("Cost : "+cost + " rupee");
    }
}
