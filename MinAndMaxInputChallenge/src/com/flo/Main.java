package com.flo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter number") ;
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {

                int number = scanner.nextInt();
//                if (first) {    oder statt if flag first: min auf max int value, max auf min int value
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number > max) {
                    max = number;
                }
                if (number < min){
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("min = " + min + " max = " + max);



        scanner.close();
    }
}
