package com.yash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JoiningElements {
    public static void main(String[] args) {
        final List<String> pack = Arrays.asList("Srividya","Harini","SaiPoornitha","Yogitha");
        System.out.println(pack.stream()
                .filter(name->name.startsWith("S"))
                .collect(Collectors.joining(", ")));
    }
}
