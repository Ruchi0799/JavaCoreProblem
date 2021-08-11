package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        int total=0;
        for(int i=1;i<ValueN;i++)
        {
            if(ValueN%i==0)
            {
                total=total+i;
            }
        }
        if(total==ValueN)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }
    }
}
