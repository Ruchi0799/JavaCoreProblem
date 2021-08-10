package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend and Divisor");
        double Dividend = sc.nextInt();
        double Divisor = sc.nextInt();
        System.out.println("Quotient is" + Dividend/Divisor);
        System.out.println("Remainder is" + Dividend%Divisor);
    }
}
