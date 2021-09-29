package com.company;

public class armstrongnnum {
    public static void main(String[] args) {
        int number = 350, num2, remain;
        double result = 0;

        num2 = number;

        while (num2 != 0) {
            remain = num2 % 10;
            result = result + Math.pow(remain, 3);
            num2 = num2 / 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}