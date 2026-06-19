package org.example.LLD.AccessModifer.package1;

public class Student {
    public int roll_no;
    protected String university;
    private int marks;
    String section;

    void doSomething(){
        roll_no = 5;
        marks = 3;
//        univerty = "bcd";
        section = "A";
    }
}
