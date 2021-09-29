package com.company;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        int prime;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num greater than 5 : ");
        prime = sc.nextInt();
        {
            if (prime % 2 == 0 || prime % 3 == 0 || prime % 5 == 0) {
                System.out.println(prime + " Not a prime number");
            } else {
                System.out.println(prime + " is a prime number");
            }
        }
    }
}