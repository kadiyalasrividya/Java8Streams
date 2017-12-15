package com.yash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListPractice {
    public static void main(String[] args) {
        List<String> pack = Arrays.asList("Sweety","Sri","Vidya","Hari");
       pack.set(0,"Srividya");
       pack.remove(1);
       System.out.println("Remove the specified index : "+ pack );
       System.out.println(" The Element at specified Index : " + pack);
       // pack.forEach((String names)-> System.out.println(names));
      // pack.forEach(System.out::println);
    }
}
