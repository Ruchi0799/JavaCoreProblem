package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        int a=0;
        for(int i=2;i<ValueN;i++)
        {
            if(ValueN%i==0)
            {
                a=1;
                break;
            }

        }
        if(a==1)
        {
            System.out.println("It is not a prime number");
        }
        else
        {
            System.out.println("It is a prime number");
        }
    }
}
