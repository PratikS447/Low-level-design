package org.example.LLD.Collection_Framwork;

import java.util.*;

public class Client {
    public static void main(String args[]){
        List<String> ls1 = new ArrayList<>();
        ls1.add("Pratik");
        ls1.add("Kajal");
        ls1.add("Shane");
        System.out.println(ls1);

        List<String> ls2 = new LinkedList<>();
        List<String> ls3 = new Vector<>();

        List<String> ls4 = new Stack<>();

        Set<String> s1 = new HashSet<>();
        s1.add("Umang");
        s1.add("Kajal");
        System.out.println(s1);

        Payment p1 = new Payment();
        p1.status = PaymentStatus.APPROVED;

        Payment p2 = new Payment();
        p2.status = PaymentStatus.REJECTED;

        Set<PaymentStatus> s4 = EnumSet.allOf(PaymentStatus.class);
        System.out.println(s4);

        EnumSet<PaymentStatus> s5 = EnumSet.of(PaymentStatus.WHICH_ONE, PaymentStatus.PENDING, PaymentStatus.APPROVED, PaymentStatus.DONE);
        EnumSet<PaymentStatus> s6 = EnumSet.complementOf(s5);

        System.out.println(s5);
        System.out.println(s6);


    }
}
