package com.bridgelabz.objectrorientedprograms;


import java.util.Scanner;

class StockAccountComputation {
    public String stockname;
    public double noofshare;
    public double shareprice;

    public double totalallstock=0;

    public StockAccountComputation(String stockname, double noofshare,double shareprice) {
        this.stockname = stockname;
        this.noofshare = noofshare;
        this.shareprice = shareprice;
    }




    @Override
    public String toString() {
        return "StockAccountComputation{" +
                "stockname='" + stockname + '\'' +
                ", noofshare=" + noofshare +
                ", shareprice=" + shareprice +
                ", totalallstock=" + totalallstock +
                '}';
    }
}

public class StockAccount{

    Scanner sc=new Scanner(System.in);
    public int number=0;
    public StockAccountComputation[] stockarray;

    public StockAccount(){
        System.out.println("How many stocks you want to add");
        int number= sc.nextInt();
        stockarray=new StockAccountComputation[number];
        for (int i=0;i<number;i++)
        {
            addStock();
        }
    }

    public void addStock(){
        System.out.println("Enter stock name");
        String stockname=sc.next();
        System.out.println("Enter no of shares");
        double noofshare=sc.nextDouble();
        System.out.println("Enter price of share");
        double shareprice= sc.nextDouble();

        stockarray[number]=new StockAccountComputation(stockname,noofshare,shareprice);
        number++;
    }


    public void calculatetotalstock(){
        double totalallstock1=0;
        for (int i=0;i<stockarray.length;i++)
        {
            double value=stockarray[i].noofshare*stockarray[i].shareprice;
            totalallstock1=totalallstock1+value;

            System.out.println("Stock Name: " + stockarray[i].stockname +" Total share: "+stockarray[i].noofshare+ " Total cost: " +value);
        }
        System.out.println("Total value of all stocks: "+totalallstock1);

        }





    public static void main(String[] args) {

        StockAccount stockAccount1 =new StockAccount();

        stockAccount1.calculatetotalstock();


    }

}
