package com.bridgelabz.objectrorientedprograms;


import java.util.Scanner;

class StockAccountComputation {
    public String stockname;
    public double noofshare;
    public double sharepriceRL=100;
    public double sharepriceAD=122;
    public double sharepriceTT=110;
    public double totaleachRL=0;
    public double totaleachAD=0;
    public double totaleachTT=0;
    public double totalallstock=0;

    public StockAccountComputation(String stockname, double noofshare) {
        this.stockname = stockname;
        this.noofshare = noofshare;
        //this.shareprice = shareprice;
    }

    public void setTotaleachRL(double totaleachRL) {
        this.totaleachRL = totaleachRL;
    }

    public void setTotaleachAD(double totaleachAD) {
        this.totaleachAD = totaleachAD;
    }

    public void setTotaleachTT(double totaleachTT) {
        this.totaleachTT = totaleachTT;
    }

    public void setTotalallstock(double totalallstock) {
        this.totalallstock = totalallstock;
    }

    @Override
    public String toString() {
        return "StockAccountComputation{" +
                "stockname='" + stockname + '\'' +
                ", noofshare=" + noofshare +
                ", sharepriceRL=" + sharepriceRL +
                ", sharepriceAD=" + sharepriceAD +
                ", sharepriceTT=" + sharepriceTT +
                ", totaleachRL=" + totaleachRL +
                ", totaleachAD=" + totaleachAD +
                ", totaleachTT=" + totaleachTT +
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

        stockarray[number]=new StockAccountComputation(stockname,noofshare);
        number++;
    }

    public void displayStock() {
        for (int i = 0; i < stockarray.length; i++) {
            System.out.println(stockarray[i]);
        }
    }

    public void calculatetotalstock(){
        double totalallstock1=0;
        for (int i=0;i<stockarray.length;i++)
        {
            if (stockarray[i].stockname.equals("RL"))
            {
                double totalrelstock1=stockarray[i].noofshare*stockarray[i].sharepriceRL;
                stockarray[i].setTotaleachRL(totalrelstock1);
                totalallstock1=totalallstock1+totalrelstock1;
            }
            else if(stockarray[i].stockname.equals("AD"))
            {
                double totaladstock1=stockarray[i].noofshare*stockarray[i].sharepriceAD;
                stockarray[i].setTotaleachAD(totaladstock1);
                totalallstock1=totalallstock1+totaladstock1;
            }
            else if(stockarray[i].stockname.equals("TT"))
            {
                double totalttstock1=stockarray[i].noofshare*stockarray[i].sharepriceTT;
                stockarray[i].setTotaleachTT(totalttstock1);
                totalallstock1=totalallstock1+totalttstock1;
            }
            stockarray[i].setTotalallstock(totalallstock1);
        }


    }


    public static void main(String[] args) {

        StockAccount stockAccount1 =new StockAccount();
        stockAccount1.displayStock();
        stockAccount1.calculatetotalstock();
        stockAccount1.displayStock();

    }

}
