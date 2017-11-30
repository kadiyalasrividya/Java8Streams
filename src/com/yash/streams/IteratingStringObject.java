package com.yash.streams;

public class IteratingStringObject {
    public static void main(String[] args) {
        String name = "Srividya";
        //name.chars().forEach(System.out::println);
        name.chars().mapToObj(ch->Character.valueOf((char)ch)).forEach(System.out::println);
    }
}
