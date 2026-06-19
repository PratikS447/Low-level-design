package org.example.LLD.StudentAbstraction;

public class Client {
    public static void main(String args[]){
        Student st1 = new Student();

        st1.name = "Pratik Shinde";
        st1.psp = 78.6;
        st1.univName = "Scaler";

        Student str2 = new Student();
        str2.name = "Nikita Shinde";
        str2.psp = 99;
        str2.batch_id = 1;
    }
}
