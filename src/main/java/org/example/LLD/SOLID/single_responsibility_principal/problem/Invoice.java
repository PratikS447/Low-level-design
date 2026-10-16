package org.example.LLD.SOLID.single_responsibility_principal.problem;

public class Invoice {
    private double total;

    public double cal_total(double total){
        return total+0.18*total;
    }

    public void save(){
        System.out.println("Save to db");
    }

    public void print_invoice(){
        System.out.print("Total cost : "+total);
    }
}
