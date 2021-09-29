package com.company;

import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        int i, Perfectnum, sum=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the num : ");
        Perfectnum = sc.nextInt();
        for (i=1; i<Perfectnum; i++){
            if (Perfectnum%i == 0){
                sum =sum+i;
            }
        }
        if (sum == Perfectnum){
            System.out.println(Perfectnum + " is the Perfect number");
        } else {
            System.out.println(Perfectnum +" is not a Perfect number");
        }
    }
}
