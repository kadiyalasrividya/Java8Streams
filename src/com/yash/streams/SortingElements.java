package com.yash.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortingElements {
    public static void main(String[] args) {
        final List<Persons> persons = Arrays.asList(
                new Persons("sweety",24),
                new Persons("hari",22),
                new Persons("sai",22),
                new Persons("vidya",20),
                new Persons("vidya",21),
                new Persons("Poornitha",30)
        );

        final List<Persons> sorted = persons.stream()
                .sorted((persons1,persons2)->persons1.ageDifference(persons2))
                .collect(Collectors.toList());
        System.out.println(sorted);

        final List<Persons> descSorted = persons.stream()
                .sorted((persons1,persons2)->persons2.ageDifference(persons1))
                .collect(Collectors.toList());
        System.out.println(descSorted);

        final Comparator<Persons> order =(person1, person2)->person1.ageDifference(person2);
        final List<Persons> reverseSorted = persons.stream()
                .sorted(order.reversed()).collect(Collectors.toList());
        System.out.println(reverseSorted);

        final Comparator<Persons> compare = (person1, person2)->person1.getName().compareTo(person2.getName());
        final List<Persons> stringComparision = persons.stream()
                .sorted(order).collect(Collectors.toList());
        System.out.println(stringComparision);

        //Multiple or fluent Opeartions

        Function<Persons, String> byName = person -> person.getName();
        final List<Persons> fluntOperation = persons.stream()
                .sorted(Comparator.comparing(byName).reversed()).collect(Collectors.toList());
        System.out.println(fluntOperation);

        Function<Persons, Integer> byAge =person->(Integer) person.getAge();
        byName = person -> person.getName();
        final List<Persons> comparingByAge = persons.stream()
                .sorted(Comparator.comparing(byAge).reversed()).collect(Collectors.toList());
        System.out.println(comparingByAge);

        //collect method
        byAge = person -> (Integer) person.getAge();
        byName = person -> person.getName();
        final List<Persons> usingCollectMethod = persons.stream()
                .sorted(Comparator.comparing(byName).thenComparing(byAge))
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        System.out.println(usingCollectMethod);

        //GroupingBy method
        byAge = person -> (Integer) person.getAge();
        byName = person -> person.getName();
        final Map<Integer,List<Persons>> peopleByAge = persons.stream()
                .sorted(Comparator.comparing(byName))
                .collect(Collectors.groupingBy(byAge));
        System.out.println(peopleByAge);

    }
}
