package com.yash.streams;

public class Persons {
    private final String name;
    private final int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int ageDifference(final Persons other){
        return age - other.age;
    }

    @Override
    public String toString() {
        String show = name + " : "+ age + "Years old.";
        return show;
    }
}
