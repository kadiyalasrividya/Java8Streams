package com.yash.streams;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("pink");
        colors.add("black");
        colors.add("red");
        colors.add("white");
        System.out.println("The original set is : "+colors);
        String[] array = new String[colors.size()];
        colors.toArray(array);

      /*  Iterator<String> p = colors.iterator();
        while(p.hasNext()){
            System.out.println(p.next());
        }*/

      /*HashSet<String> cloned = new HashSet<String>();
      cloned = (HashSet)colors.clone();
      System.out.println("The cloned copy of set contains : "+ cloned);*/

      //converting Hashset into Array
        System.out.println("new Array elements are : ");
        for(String element : array) {
            System.out.println(element);
        }
    }
}
