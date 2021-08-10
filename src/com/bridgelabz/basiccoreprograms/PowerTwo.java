package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PowerTwo {
    public static final int NUMBER = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which power you want to print");
        int PowerN = sc.nextInt();
        double Total=0;
        if (PowerN < 31)
        {
            for (int i = 0; i < PowerN; i++)
            {
                System.out.println(Math.pow(NUMBER,i));

            }
        }
    }
}
