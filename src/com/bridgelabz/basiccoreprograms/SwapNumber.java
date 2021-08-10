package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 and Number2");
        double Number1 = sc.nextDouble();
        double Number2 = sc.nextDouble();
        System.out.println("Number before swapping Num1: " +Number1 + "Num2: " +Number2);
        double Temp=0;
        Temp=Number1;
        Number1=Number2;
        Number2=Temp;
        System.out.println("Number after swapping Num1: " +Number1 + "Num2: " +Number2);

    }
}
