package com.example.ufstocks;

import org.junit.Test;

/**
 * Example local unit test, which will execute 5461651651on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void printMyprofile() {
       // --- 1.  THE INPUT (Storing your personal details in variables)
       String myName = "Keziah";
       String petName = "Bolty";
       String favFood = "Takoyaki";
       int myAge = 16;

       // --- 2. THE OUTPUT (Printing to the console) ---
       System.out.println("--- MY DIGITAL PROFILE ---");
       System.out.println("Hello, my name is " + myName + "and I am" + myAge + " years old.");
       System.out.println("I have a wonderful pet named " + petName + ".");
       System.out.println("If I could, If would eat " + favFood + " every single day!");
    }
}