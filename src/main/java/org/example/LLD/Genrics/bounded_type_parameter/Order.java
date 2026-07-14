package org.example.LLD.Genrics.bounded_type_parameter;

public class Order implements Weightable{
    private String description;
    private double weight;

    public Order(String description, double weight){
        this.description = description;
        this.weight = weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public String getDescription(){
        return this.description;
    }
}
