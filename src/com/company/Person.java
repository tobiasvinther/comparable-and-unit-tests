package com.company;

public class Person implements Comparable<Person> {

    private String name;
    private int height;
    private int age;

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public int compareTo(Person other) {
        //* An older person is sorted higher in the natural ordering
        //* If two persons are the same age, the taller person is sorted higher in the natural ordering
        if(this.age == other.age) {
            return this.height - other.height; //if they are same age, compare their heights
        } else {
            return this.age - other.age;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

}
