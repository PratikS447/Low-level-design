package org.example.LLD.SOLID.single_responsibility_principal.soluton;

public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public double calculateTotal(double amount){
        return amount+(0.18)*amount;
    }
}
