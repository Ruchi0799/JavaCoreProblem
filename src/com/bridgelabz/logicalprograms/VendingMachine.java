package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        int count = 0;
        while (ValueN != 0)
        {
            System.out.println(ValueN);
            if (ValueN > 1000) {
                while (ValueN < 1000) {
                    System.out.println(1000);
                    count++;
                    ValueN = ValueN - 1000;
                }
            }
            else if (ValueN > 500)
            {
                while (ValueN < 500)
                {
                    System.out.println(500);
                    count++;
                    ValueN = ValueN - 500;

                }
            }
            else if (ValueN > 100)
            {
                while (ValueN < 100)
                {
                    System.out.println(100);
                    count++;
                    ValueN = ValueN - 100;

                }
            }
            else if (ValueN > 50)
            {
                while (ValueN < 50)
                {
                    System.out.println(50);
                    count++;
                    ValueN = ValueN - 50;

                }
            }
            else if (ValueN > 10)
            {
                while (ValueN < 10)
                {
                    System.out.println(10);
                    count++;
                    ValueN = ValueN - 10;

                }
            }
            else if (ValueN > 5)
            {
                while (ValueN < 5)
                {
                    System.out.println(5);
                    count++;
                    ValueN = ValueN - 5;

                }
            }
            else if (ValueN > 2)
            {
                while (ValueN < 2)
                {
                    System.out.println(2);
                    count++;
                    ValueN = ValueN - 2;

                }
            }
            else if (ValueN > 1)
            {
                while (ValueN < 1)
                {
                    System.out.println(1);
                    count++;
                    ValueN = ValueN - 1;

                }
            }
        }
        System.out.println("Minimum number of notes required:" +count);
    }
}
