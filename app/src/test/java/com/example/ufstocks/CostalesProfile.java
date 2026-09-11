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
        String myName = "Prince Dylan A. Costales";
        String hobby = "Drawing";
        String nickname = "Shinzo";
        String game = "Roblox";
        String game2 = "Geometry Dash";
        String game3 = "Limbus Company";
        int age = 16;


        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello everyone, my name is " + myName + ", and i'm also " + age + " years old.");
        System.out.println("My favorite hobby is " + hobby + ".");
        System.out.println("My nickname i go for is " + nickname + ".");
        System.out.println("And my favorite games that i play the most are " + game + ", " + game2 + ", " + game3 + ".");
    }
}