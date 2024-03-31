package dev.lpa;

    // Constructor auto-made
        // Called canonical constructor

    // Three types of constructors

    // Canonical (long) ctr
        // auto-genned
        // if you declare your own ctr, then implicit one won't get gen'd
        // All fields must be assigned

    // Custom ctr
        // just an overloaded ctr
        // must call cannonical ctr in first stmt

    // Compact (short) ctr
        // special ctr, used only on records
        // Succinct way of expl decling canonical ctr



public record Person(String name, String dob) {

    // DOn't have to gen canonical ctr, but we can if we want to do transfxns etc
//    public Person(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-', '/');
//    }

    // copy ctr
    public Person(Person p) {
        this(p.name, p.dob);
    }

    // Missing parens
    // implicit canonical ctr
    // Can focus on just the custom bit of code
    public Person {
        // has access to args of cncl ctr, like name and dob
        if (dob == null) throw new IllegalArgumentException("Bad data");
        dob = dob.replace('-', '/');

    }
}