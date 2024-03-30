package dev.lpa;

public class Parent {

    private final String name;
    private final String dob;


    // This is an instance initializer block
    // Declared directly in a class body
    // Executed when instance is created
    // Executed before any code in class constructors is executed
    // can have multiple blocks, exec in order declared

    {
        name = "John Doe";
        dob = "01/01/1900";
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' + ", dob='" + dob + '\'';
    }
}
