package dev.lpa;

public class Parent {

    // Static initializer
    // Runs while the class itself is being initialized
    // `static` keyword is very imp

    static{
        System.out.println("Parent static initializer: Parent class being constructed");
    }

    private final String name;
    private final String dob;
    // Protected so subclasses can access
    protected final int siblings;


    // This is an instance initializer block
    // Declared directly in a class body
    // Executed when instance is created
    // Executed before any code in class constructors is executed
    // can have multiple blocks, exec in order declared

    {
//        name = "John Doe";
//        dob = "01/01/1900";
        System.out.println("In Parent Initializer");
    }

    //    public Parent() {
//        System.out.println("In Parent's No args constructor");
//    }

    public Parent(String name, String dob, int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;

        System.out.println("In Parent Constructor");



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
