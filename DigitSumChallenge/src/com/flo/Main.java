package com.flo;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in the number is " + sumDigits(375));

    }
    private static int sumDigits (int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
