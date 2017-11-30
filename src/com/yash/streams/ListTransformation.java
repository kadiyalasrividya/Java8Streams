package com.yash.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTransformation {
    public static void main(String[] args) {
        final List<String> pack = Arrays.asList("Sweety","Hari","Sai","Yogitha");
       /* final List<String> packUpper = new ArrayList<String>();
        pack.forEach(names -> packUpper.add(names.toUpperCase()));
        System.out.println(packUpper);*/
       pack.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
    }
}
