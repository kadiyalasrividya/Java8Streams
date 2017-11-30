package com.yash.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalInterface {

    public static void main(String[] args) {
        final List<String> pack = Arrays.asList("Sweety","Hari","Sai","Yogitha","Chaitu","Yogiraj","Rithwik","Jayin");
        pickname(pack,"B");
    }

    public static void pickname(final List<String> names, String startingLetter){
        final Optional<String> foundName = names.stream()
                .filter(name -> name.startsWith(startingLetter))
                .findFirst();
        System.out.println("the name starts with "+ startingLetter + ":"+ foundName.orElse("Name doesn't exist"));

      /*  String nameFound = null;
        for(String name : names){
            if(name.startsWith(startingLetter)){
                nameFound = name;
                break;
            }
        }
        if(nameFound == null){
            System.out.println("name not exist");
        }else{
            System.out.println("name staring with "+ startingLetter + ":" + nameFound);
        }*/
    }
}
