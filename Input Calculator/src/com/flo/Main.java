package com.flo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int counter = 0;

        while (true) {

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
        }
//        if (average != 0) {
        average = Math.round((double) sum / counter);
//        } else {
//            average = 0;
//        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
/*    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int counter = 0;

        while (true) {

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
        }
//        if (average != 0) {
        average = Math.round((double) sum / counter);
//        } else {
//            average = 0;
//        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
} */
