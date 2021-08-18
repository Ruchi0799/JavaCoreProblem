package com.bridgelabz.objectrorientedprograms;
import java.util.Collection;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DeckCards {

    public static void main(String[] args) {
        Random rn=new Random();
        Scanner sc=new Scanner(System.in);
        String[] suit={"spade","diamond","heart","clubs"};
        String[] rank={ "Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King" };
        String[] cards=new String[52];
        int k=0;

        for (int i=0;i<suit.length;i++)
        {
            for (int j=0;j< rank.length;j++)
            {
                cards[k]=suit[i]+rank[j];
                k++;
            }
        }

        System.out.println("How many player are there?");
        int n=sc.nextInt();
       while (n!=0)
       {


       }


        for (String element:cards)
        {
            System.out.println(element);
        }

    }


}
