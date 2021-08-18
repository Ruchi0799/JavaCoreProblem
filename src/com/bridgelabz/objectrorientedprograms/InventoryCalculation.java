package com.bridgelabz.objectrorientedprograms;

import java.util.Scanner;

class TotalInventory {

    public String Grainname;
    public double Weight;
    public double priceperkg;


    public TotalInventory(String Grainname, double Weight, double priceperkg) {
        this.Grainname = Grainname;
        this.Weight = Weight;
        this.priceperkg=priceperkg;


    }

    @Override
    public String toString() {
        return "TotalInventory{" +
                "Grainname='" + Grainname + '\'' +
                ", Weight=" + Weight +
                ", priceperkg=" + priceperkg +
                '}';
    }
}

    public class InventoryCalculation {
        Scanner sc = new Scanner(System.in);
        public int number = 0;
        public TotalInventory[] grainsarray;


        public InventoryCalculation() {
            System.out.println("How many Grains do you want to add?");
            int number = sc.nextInt();
            grainsarray = new TotalInventory[number];
            for (int i = 0; i < number; i++) {
                addGrain();
            }
        }



        public void addGrain() {
            System.out.println("Enter Grain name");
            String GrainName1 = sc.next();
            System.out.println("Enter how many kg");
            double Weight1 = sc.nextDouble();
            System.out.println("Enter price per kg");
            double priceperkg= sc.nextDouble();
            grainsarray[number] = new TotalInventory(GrainName1, Weight1,priceperkg);
            number++;

        }

        public void calculateTotalPrice() {

            for (int i=0;i<grainsarray.length;i++)
            {

                System.out.println("Grain Name: " + grainsarray[i].Grainname +"Total cost: " +grainsarray[i].Weight*grainsarray[i].priceperkg);
            }


        }

        public static void main(String[] args) {


            InventoryCalculation inventorycalculate = new InventoryCalculation();
            inventorycalculate.calculateTotalPrice();


        }


    }



