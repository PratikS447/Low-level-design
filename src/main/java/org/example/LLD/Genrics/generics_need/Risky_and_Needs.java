package org.example.LLD.Genrics.generics_need;

import java.util.ArrayList;
import java.util.List;

public class Risky_and_Needs {
    public static void main(String args[]){
        List ls= new ArrayList<>();
        ls.add("Pratik");
        ls.add(45);

        // if try to get the numeric value and put String as its conatiner name it will give the complile time error.
        // Eventhrought the code will compile at runtime.

        String a = (String) ls.get(0); // here we explicitly require type-cast -> ClassCastException
        System.out.println(a);

        // if we explicitly use
        List<String> ls2 = new ArrayList<>();
        ls2.add("Pratik");
//        ls2.add(123); -> thow an runtime error

    }
}
