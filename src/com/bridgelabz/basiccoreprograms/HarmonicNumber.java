package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static final int NUMBER = 1;
    public static void main(String[] args) {
        System.out.println("Enter the Harmonic value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        double TotalHarmonic = 0;
            for (double i = 1; i <= ValueN; i++) {
                TotalHarmonic = TotalHarmonic + NUMBER / i;

            }

        System.out.println(TotalHarmonic);
    }
}
