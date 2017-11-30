package com.yash.streams;

import java.util.Arrays;
import java.util.List;

public class LongestElement {
    public static void main(String[] args) {

        final List<String> pack = Arrays.asList("Sweety","Harini","Sai","Yogitha","Srividya");
        System.out.println("the longest element in an array is "+
                pack.stream().reduce((name1,name2)->name1.length()>name2.length() ? name1:name2));
    }
}
