package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class VendingMachine1 {
    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        int Temp = ValueN;
        int count = 0;
        int thou = 0;
        int a[] = {1000, 500, 100, 50, 10, 5, 2, 1};
        while (ValueN != 0) {
            for (int i = 0; i < a.length; i++) {

                if (ValueN >= a[i]) {
                    thou = ValueN / a[i];
                    ValueN=ValueN%a[i];
                   for(int j=0;j<thou;j++)
                    {
                        System.out.println(a[i]);
                    }

                }

            }


        }
    }
}