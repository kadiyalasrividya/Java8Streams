package com.yash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindElementsWithMultipleCriteria2 {
    public static void main(String[] args) {

        final List<String> pack = Arrays.asList("Sweety","Hari","Sai","Yogitha","Chaitu","Yogiraj","Rithwik","Jayin");
        final Function<String, Predicate<String>> st = (String letter)->(String name)-> name.startsWith(letter);
           /* Predicate<String> criteria = (String name)-> name.startsWith(letter);
            return criteria;
        };
        final List<String> tPack = pack.stream().filter(st.apply("S")).collect(Collectors.toList());
        System.out.println(tPack);*/
           final long number = pack.stream().filter(st.apply("Y")).count();
        System.out.println(number);
    }

    public static Predicate<String> criteria(final String letter){
        return name -> name.startsWith(letter);
    }
}
