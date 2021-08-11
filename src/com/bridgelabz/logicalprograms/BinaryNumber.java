package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner sc = new Scanner(System.in);
        int ValueN = sc.nextInt();
        int temp=0;
        String binaryno=Integer.toBinaryString(ValueN);
        String padded=String.format("%08d",Integer.parseInt(binaryno));
        //System.out.println(padded);
        int total=0;
        int total1=0;

        int[] newGuess = new int[padded.length()];
        for (int i = 0; i < padded.length(); i++)
        {
            newGuess[i] = padded.charAt(i) - '0';
        }
       for (int i=0; i<padded.length(); i++)
        {
            System.out.println(newGuess[i]);    //Array Traversal
        }
        for(int j=0;j<8;j++)
        {
            if(newGuess[j]==1)
            {
                total= (int) (total+Math.pow(2,7-j));

            }
        }
        System.out.println(total);

        //reversing nibbles
        for(int i=0;i<4;i++)
        {
            temp=newGuess[i];
            newGuess[i]=newGuess[4-1-i];
            newGuess[4-1-i]=temp;
        }
        for(int j=0;j<8;j++)
        {
            if(newGuess[j]==1)
            {
                total1= (int) (total1+Math.pow(2,7-j));

            }
        }
        System.out.println(total1);



    }
}
