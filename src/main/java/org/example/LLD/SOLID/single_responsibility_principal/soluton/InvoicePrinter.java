package org.example.LLD.SOLID.single_responsibility_principal.soluton;

public class InvoicePrinter {
    public void print(Invoice invoice){
        System.out.println(invoice.calculateTotal(2000));
    }
}
