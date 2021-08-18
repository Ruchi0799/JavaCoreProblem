package com.bridgelabz.objectrorientedprograms;

public class StockAccount2 {
    public String stockname;
    public double noofshare;
    public double pricepershare;
    public double noofshareavailble;
    public double totalshare;

    public StockAccount2(String stockname, double noofshare, double pricepershare) {
        this.stockname = stockname;
        this.noofshare = noofshare;
        this.pricepershare = pricepershare;
        //this.totalshare=totalshare;
        //this.noofshareavailble=noofshareavailble;
    }

    public double getTotalshare() {
        return totalshare;
    }

    public void setTotalshare(double totalshare) {
        this.totalshare = totalshare;
    }

    @Override
    public String toString() {
        return "StockAccount2{" +
                "stockname='" + stockname + '\'' +
                ", pricepershare=" + pricepershare +
                ", noofshare=" + noofshare +
                '}';
    }
}
