package dev.lpa;

import external.Child;

public class Main {
    public static void main(String[] args) {

        // RIght now Parent has no constructor
        // Don't actually need to write a constructor to instantiate a class

        Parent parent = new Parent("Jane Doe", "01/01/1950", 4);
        Child child = new Child();

        System.out.println("Parent: " + parent);
        System.out.println("Child: " + child);
    }
}