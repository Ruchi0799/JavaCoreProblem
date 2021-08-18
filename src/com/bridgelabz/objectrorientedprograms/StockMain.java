package com.bridgelabz.objectrorientedprograms;

import java.util.Scanner;

public class StockMain {
    Scanner sc=new Scanner(System.in);
    public int number=0;
    public int quantity=0;
    public StockAccount2[] stockarray1;
    public StockAccount2[] stockarraybuy;

    public  StockMain() {
        System.out.println("How many stocks do you want to add?");
        int number = sc.nextInt();
        stockarray1 = new StockAccount2[number];
        for (int i = 0; i < number; i++) {
            addshares();
        }
    }


    void Valueof(){

        for (int i=0;i<stockarraybuy.length;i++)
        {

            System.out.println("Stock Name: " + stockarraybuy[i].stockname +"Total no of share : "+stockarraybuy[i].noofshare+ " Total cost: " +stockarraybuy[i].noofshare*stockarraybuy[i].pricepershare);
        }

    }

    void addshares()
    {
        System.out.println("Enter Stock name");
        String StockName1 = sc.next();
        System.out.println("Enter total number of stocks");
        double Quantity1 = sc.nextDouble();
        System.out.println("Enter price per stock");
        double pricepershare= sc.nextDouble();

        stockarray1[number] = new StockAccount2(StockName1, Quantity1,pricepershare);
        number++;

    }

    void buy(){
        System.out.println("How many shares you want to buy?");
        int quantity= sc.nextInt();
        stockarraybuy = new StockAccount2[quantity];
        for (int i=0;i<quantity;i++){
            buy1();
        }
    }

    void buy1(){

        System.out.println("Enter Stock name");
        String StockName1 = sc.next();
        System.out.println("Enter how many stocks you want?");
        double Quantity1 = sc.nextDouble();
        System.out.println("Enter price per stock");
        double pricepershare= sc.nextDouble();
        for (int i = 0; i < stockarray1.length; i++) {
            if (stockarray1[i].stockname.equals(StockName1)) {
                stockarray1[i].noofshare = stockarray1[i].noofshare - Quantity1;
            }
        }

        stockarraybuy[quantity] = new StockAccount2(StockName1, Quantity1,pricepershare);
        quantity++;




    }

    void sell() {
        System.out.println("Which stock you want to sell?");
        String sellstock = sc.next();
        System.out.println("How many you want to sell");
        int nosell= sc.nextInt();
        for (int i = 0; i < stockarraybuy.length; i++) {
            if (stockarraybuy[i].stockname.equals(sellstock))
            {
                stockarraybuy[i].noofshare=stockarraybuy[i].noofshare-nosell;
            }

        }
    }

    void save()
    {

    }

    void printavailableshares()
    {
        for (int i = 0; i < stockarray1.length; i++) {
            System.out.println(stockarray1[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StockMain stockcalculate=new StockMain();

        int choice=1;

        while (choice!=0)
        {
            System.out.println("What do you want to do \n 1.Buy stocks \n 2.Sell stocks \n 3.displaystock \n 4.Display shares you have \n 5.Sell stock \n 6.EXIT");
            choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                    stockcalculate.buy();
                    break;

                case 2:
                    stockcalculate.sell();
                    break;

                case 3:
                    stockcalculate.printavailableshares();
                    break;

                case 4:
                    stockcalculate.Valueof();
                    break;

                case 5:
                    stockcalculate.sell();
                    break;

                case 6:
                    choice=0;
                    break;


            }

        }

    }
}
