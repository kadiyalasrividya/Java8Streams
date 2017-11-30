package com.yash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindElements {
    public static void main(String[] args) {
        final List<String> pack = Arrays.asList("Sweety","Hari","Sai","Yogitha");
        final Predicate<String> filtering = name -> name.startsWith("S");
        final List<String> tPack = pack.stream()
                //.filter(name -> name.startsWith("S"))
                .filter(filtering)
                .collect(Collectors.toList());
        System.out.println(tPack);
    }
}
