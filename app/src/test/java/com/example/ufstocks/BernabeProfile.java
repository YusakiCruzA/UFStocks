package com .example.ufstocks;
import org.junit.Test;

/**
 * Example local unit test, which will execute 5461651651on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BernabeProfile {
    @Test
    public void BernabeProfile() {
        // --- 1. THE INPUT (Storing your personal details in variables) ---
        String myName = "Jazzlee bernabe";
        String nickName = "Jajazz";
        String favGame = "Mobile legends";
        int myAge = 16;

        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("--- My Profile ---");
        System.out.println("Hello my name is" + myName + "and my age is" + myAge + "years old.");
        System.out.println("my Nickname are" + nickName + "and please call my that name.");
        System.out.println("My favorite game are always" + favGame + "and i will play it everyday if i could.");
    }
}