package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(result);

    }
}
