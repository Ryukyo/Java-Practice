package com.flo;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
	        if (isDividable3And5(i)) {
	            count++;
                System.out.println("Number " + i + " is dividable by 3 and 5");
                sum += i;
                if (count == 5) {
                    System.out.println("The total sum is " + sum);
                    break;
                }
        }
    }
    }
    public static boolean isDividable3And5 (int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return true;
        } return false;
    }


    public static boolean isOdd (int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int sumOdd (int start, int end) {
        int sum = 0;
        if ((end >= start) && (start > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
