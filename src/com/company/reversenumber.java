package com.company;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        int num, reverse =0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the num you want to reverse : ");
            num = sc.nextInt();
            while (num != 0) {
                int remainder = num%10;
                reverse = reverse*10 + remainder;
                num = num/10;
            }
            System.out.println("The num is reversed :" + reverse);
    }
}
