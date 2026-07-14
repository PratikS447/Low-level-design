package org.example.LLD.Genrics.bounded_type_parameter;

public class Shipping {
    public static <T extends Weightable> double calculate_Shipping(T items){
        return items.getWeight()*0.5*95;
    }
}
