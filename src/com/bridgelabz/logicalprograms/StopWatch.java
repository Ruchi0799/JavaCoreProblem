package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting time");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        System.out.println("Enter ending time");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        System.out.print(h2-h1 +":");
        System.out.print(m2-m1 +":");
        System.out.print(s2-s1);
    }
}
