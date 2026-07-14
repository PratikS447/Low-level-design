package org.example.LLD.Genrics.generic_method;

public class Client {
    public static void main(String args[]){
        Integer arr[] = {1, 2, 3, 4, 5};
        String str[] = {"Pratik", "Rohit", "Mohit", "pranay"};

        Solution sl = new Solution();
        sl.method(arr);
        sl.method(str);
    }
}
