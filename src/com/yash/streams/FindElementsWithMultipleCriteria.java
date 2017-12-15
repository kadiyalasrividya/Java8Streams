package com.yash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindElementsWithMultipleCriteria {
    public static void main(String[] args) {
        final List<String> pack = Arrays.asList("Sweety","Hari","Sai","Yogitha","Chaitu","Yogiraj","Rithwik","Jayin");
        final List<String> tPack = pack.stream().filter(criteria("Y")).collect(Collectors.toList());
        System.out.println(tPack);
    }

    public static Predicate<String> criteria(final String letter) {
        return name -> name.startsWith(letter);
    }
}
