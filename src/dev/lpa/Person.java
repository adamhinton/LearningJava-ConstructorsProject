package dev.lpa;

public record Person(String name, String dob) {
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



}
