package com.yash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListPractice {
    public static void main(String[] args) {
        final List<String> pack = Arrays.asList("Sweety","Sri","Vidya","Hari");
       // pack.forEach((String names)-> System.out.println(names));
        pack.forEach(System.out::println);
    }
}
