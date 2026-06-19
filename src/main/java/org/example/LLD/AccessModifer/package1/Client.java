package org.example.LLD.AccessModifer.package1;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.roll_no  = 1;
        st.university = "mnc"; // protechted can be acceseed in different class of same package
//        st.marks = 30; -> this is private which is only accessed in same class
        st.section = "B";
    }
}
