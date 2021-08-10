package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digit year to check whether it s leap year or not");
        int Year = sc.nextInt();
        while (Year > 999 && Year < 10000) {
            if (Year % 4 == 0) {
                if (Year % 100 == 0) {
                    if (Year % 400 == 0) {
                        System.out.println("It is a leap year");
                    } else {
                        System.out.println("Not a leap year");
                    }
                } else {
                    System.out.println("It is a leap year");
                }
            } else {
                System.out.println("Not a leap year");
            }

        }
    }
}
