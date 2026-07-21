package org.example.LLD.LambdasStreams.Boolean_ex;

public class Client {
    public static void main(String args[]){
        Check_Operation_Even check_operation_even = new Check_Operation_Even() {
            @Override
            public boolean check(int num) {
                return num%2 == 0;
            }
        };
        System.out.println(check_operation_even.check(5));

        Check_Operation_Even lambda_check = num -> num % 2 == 0;
        System.out.println(lambda_check.check(6));
    }
}
