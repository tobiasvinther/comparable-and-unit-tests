package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //person
        Person joe = new Person("Joe", 179, 46);
        Person anne = new Person("Anne", 160, 58);
        Person liam = new Person("Liam", 184, 34);
        Person andre = new Person("André", 240, 34);

        ArrayList<Person> personList = new ArrayList<Person>(Arrays.asList(joe, anne, liam, andre));

        Collections.sort(personList);

        System.out.println(personList);

        //encryption
        LetterToNumberEncryption encryption = new LetterToNumberEncryption();
        System.out.println(encryption.fromStringToNumber("abc"));
        System.out.println(encryption.fromStringToNumber("xyz"));


    }
}
