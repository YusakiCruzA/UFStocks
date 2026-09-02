package com.example.ufstocks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute 5461651651on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void printMyProfile() {
        // --- 1. THE INPUT (Storing your personal details in variables) ---
        String itemname = "Regular Uniform";
        String itemname2 = "T-Shirt";
        String itemname3 = "Long Pants";
        String itemname4 = "P.E Uniform";
        String itemname5 = "Activity Shirt";
        int item1 = 50;
        int item2 = 57;
        int item3 = 45;
        int item4 = 32;
        int item5 = 36;


        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("The " + itemname + " has " + item1 + " in stock");
        System.out.println("The " + itemname2 + " has " + item2 + " in stock");
        System.out.println("The " + itemname3 + " has " + item3 + " in stock");
        System.out.println("The " + itemname4 + " has " + item4 + " in stock");
        System.out.println("The " + itemname5 + " has " + item5 + " in stock");
    }
}