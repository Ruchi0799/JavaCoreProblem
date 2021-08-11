package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);
        for (i=2;i<ValueN;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
