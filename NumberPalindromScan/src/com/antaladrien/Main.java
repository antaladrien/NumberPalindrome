package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("If the number is a palindrom it should return true.");
        System.out.println("Enter number:");

        long num = myObj.nextLong();
        System.out.println("Result: " + isPalindrome(num));
    }

    public static boolean isPalindrome(long number) {
        long start = number;

        long reverse = 0;
        while (number != 0) {
            long lastDigit = number % 10;
            reverse += lastDigit;
            reverse *= 10;
            number /= 10;
        }
        reverse /= 10;

        if (reverse == start) {
            return true;
        } else {
            return false;
        }
    }
}
