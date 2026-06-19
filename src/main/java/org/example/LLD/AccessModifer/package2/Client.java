package org.example.LLD.AccessModifer.package2;

import org.example.LLD.AccessModifer.package1.Student;

public class Client {
    public static void main(String[] args) {
        Student st2 = new Student();
        st2.roll_no = 2;
//        st2.marks = 43; cant be accessed because it is private
    }
}
