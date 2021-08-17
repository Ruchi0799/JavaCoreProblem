package com.bridgelabz.objectrorientedprograms;

import java.util.Scanner;

class TotalInventory{

    public String Grainname;
    public double Weight;
    public double ricepriceperkg=32;
    public double pulsespriceperkg=45;
    public double wheatpriceperkg=38;
    public double ricetotalPrice=0;
    public double pulsetotalPrice=0;
    public double wheattotalPrice=0;

    @Override
    public String toString() {
        return "TotalInventory{" +
                "Grainname='" + Grainname + '\'' +
                ", Weight=" + Weight +
                ", ricepriceperkg=" + ricepriceperkg +
                ", pulsespriceperkg=" + pulsespriceperkg +
                ", wheatpriceperkg=" + wheatpriceperkg +
                ", ricetotalPrice=" + ricetotalPrice +
                ", pulsetotalPrice=" + pulsetotalPrice +
                ", wheattotalPrice=" + wheattotalPrice +
                '}';
    }

    public TotalInventory(String Grainname, double Weight){
        this.Grainname=Grainname;
        this.Weight=Weight;
        //this.priceperkg=priceperkg;


    }

    public void setRicetotalPrice(double ricetotalPrice) {
        this.ricetotalPrice = ricetotalPrice;
    }

    public void setPulsetotalPrice(double pulsetotalPrice) {
        this.pulsetotalPrice = pulsetotalPrice;
    }

    public void setWheattotalPrice(double wheattotalPrice) {
        this.wheattotalPrice = wheattotalPrice;
    }


}

public class InventoryCalculation {
    Scanner sc = new Scanner(System.in);
    public int number = 0;
    public  TotalInventory[] grainsarray;

    public InventoryCalculation() {
        System.out.println("How many Grains do you want to add?");
        int number = sc.nextInt();
        grainsarray = new TotalInventory[number];
        for (int i = 0; i < number; i++) {
            addGrain();
        }
    }

    public void displayContact() {
        for (int i = 0; i < grainsarray.length; i++) {
            System.out.println(grainsarray[i]);
        }
    }

    public void addGrain()
        {
            System.out.println("Enter Grain name");
            String GrainName1 = sc.next();
            System.out.println("Enter how many kg");
            double Weight1 = sc.nextDouble();
            grainsarray[number] = new TotalInventory(GrainName1,Weight1);
            number++;

        }

        public void calculateTotalPrice() {
            for (int i = 0; i < grainsarray.length; i++) {
                if (grainsarray[i].Grainname.equals("rice"))
                {
                  double ricetotalprice1=grainsarray[i].Weight*grainsarray[i].ricepriceperkg;
                  grainsarray[i].setRicetotalPrice(ricetotalprice1);
                }
                else if(grainsarray[i].Grainname.equals("pulses"))
                {
                    double pulsestotalprice1=grainsarray[i].Weight*grainsarray[i].pulsespriceperkg;
                    grainsarray[i].setPulsetotalPrice(pulsestotalprice1);
                }
                else if(grainsarray[i].Grainname.equals("wheat"))
                {
                    double ricetotalprice1=grainsarray[i].Weight*grainsarray[i].ricepriceperkg;
                    grainsarray[i].setWheattotalPrice(ricetotalprice1);
                }
            }
        }

    public static void main(String[] args) {


        InventoryCalculation inventorycalculate=new InventoryCalculation();
        inventorycalculate.displayContact();
        inventorycalculate.calculateTotalPrice();
        inventorycalculate.displayContact();

        }


    }


