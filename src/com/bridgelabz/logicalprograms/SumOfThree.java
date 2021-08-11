package com.bridgelabz.logicalprograms;

public class SumOfThree {
    public static void main(String[] args) {
        int a[]={2,3,1,-5,8,-4,-3};
        int count=0;
        for(int i=0;i< a.length-2;i++) {
            for (int j = 2; j < a.length; j++) {
                if (a[i] + a[i + 1] + a[j] == 0) {
                    count++;
                    System.out.println(a[i] + " " + a[i + 1] + " " + a[j]);
                }
            }
        }
        System.out.println("Total sum of 3 equals 0 are:"+count);
    }
}
