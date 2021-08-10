package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a NUMBER to check whether it is even or odd");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if(Number%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
