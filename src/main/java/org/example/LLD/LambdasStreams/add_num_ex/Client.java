package org.example.LLD.LambdasStreams.add_num_ex;

public class Client {
    public static void main(String args[]){
        MathOperation tradionalAddition = new MathOperation() {
            @Override
            public int operation(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println("Add : "+ tradionalAddition.operation(4, 5));
        MathOperation lambda_add = (a, b) -> a+b;
        System.out.println("Lambda operation for addtion : "+lambda_add.operation(4, 5));

        MathOperation tradition_Subtraction = new MathOperation() {
            @Override
            public int operation(int num1, int num2) {
                return num1 -num2;
            }
        };
        System.out.println("Subtraction : "+tradition_Subtraction.operation(10 , 5));
        MathOperation lambda_sub = (a, b) -> a-b;
        System.out.println("Lambda expression for subtraction : "+lambda_sub.operation(10, 6));

        MathOperation multiplication = new MathOperation() {
            @Override
            public int operation(int num1, int num2) {
                return num1*num2;
            }
        };
        System.out.println("Multiplication is : "+ multiplication.operation(5, 10));
        MathOperation lambda_mult = (a, b) -> a*b;
        System.out.println("Modern Multiplication : "+lambda_mult.operation(5, 2));
    }
}
