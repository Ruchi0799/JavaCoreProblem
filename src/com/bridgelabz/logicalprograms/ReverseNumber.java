package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        int temp=ValueN;
        int reverse=0;
        int rem=0;
        while (temp!=0)
        {
            rem=temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;

        }
        if(ValueN==reverse)
        {
            System.out.println("Equal Number");
        }
        else
        {
            System.out.println("not an Equal Number");
        }

    }
}
