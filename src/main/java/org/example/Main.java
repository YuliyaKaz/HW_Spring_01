package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vasiliy", "Chapaev", 55);
        System.out.println("Person1: " + person1.toString());
        Person person2 = new Person("Vasily", "Shukshin", 22);
        System.out.println("Person2: " + person2.toString());

        System.out.println("Person1 equals Person2: " + person1.equals(person2));
        System.out.println("Person1 equals Person1: " + person1.equals(person1));

        System.out.println("hash code for person1: " + person1.hashCode());

        System.out.println("hash code for person2: " + person2.hashCode());
    }
}