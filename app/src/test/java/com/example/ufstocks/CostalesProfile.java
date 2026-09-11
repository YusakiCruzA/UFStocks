package com.example.ufstocks;

import org.junit.Test;

/**
 * Example local unit test, which will execute 5461651651on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CostalesProfile {
    @Test
    public void printMyProfile() {
        // --- 1. THE INPUT (Storing your personal details in variables) ---
        String myName = "Costales Prince Dylan A.";
        String petName = "Fiona";
        String favFood = "Adobo";
        int myAge = 16;

        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello my name is " + myName + " and my age is " + myAge + " years old.");
        System.out.println("I have a pet named " + petName + ".");
        System.out.println("And my favorite food is " + favFood + ".");
    }
}