package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a Letter to check Vowel or Consonant");
        Scanner sc = new Scanner(System.in);
        char Letter = sc.next().charAt(0);
        if (Letter=='a' || Letter=='e' || Letter=='i' || Letter=='o' || Letter=='u' || Letter=='A' || Letter=='E' || Letter=='I' || Letter=='O' || Letter=='U') {
            System.out.println("The entered letter is Vowel");
        } else {
            System.out.println("The entered letter is Consonant");
        }
    }
}
//Letter.equals('a') || Letter.equals('e') || Letter.equals('i') || Letter.equals('o') || Letter.equals('u') || Letter.equals('A') || Letter.equals('E') || Letter.equals('I') || Letter.equals('O') || Letter.equals('U')
