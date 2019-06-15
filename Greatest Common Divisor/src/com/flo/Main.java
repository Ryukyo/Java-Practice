package com.flo;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
//        System.out.println(printFactors(26));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        else {
            int greatestCommonDivisor = 0;
            for (int i = 1; i <= first || i <= second; i++) {
                if (((first % i) == 0) && ((second % i) == 0)) {
                    greatestCommonDivisor = i;
                }
            }
            return greatestCommonDivisor;
        }
    }

    public static void printFactors(int number) { // in int ändern für test
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean isPerfectNumber (int number) {
        if (number < 1) {
            return false;
        }
        else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                return true;
            }
        } return false;
    }


    public static void numberToWords (int number) {
        int newNumber = 0;
        int numberToPrint;
        int numberOfZeros = 0;
        int count;

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            while (number % 10 == 0) {
                numberOfZeros++;
                number /= 10;
            }
        }
        number = reverse(number);

        while (number != 0) {
            numberToPrint = number % 10;

            switch (numberToPrint) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            newNumber = numberToPrint + newNumber;
            number /= 10;
            if (number != 0)
                newNumber *= 10;
        }
        for (count = 0; count < numberOfZeros; count++)
            System.out.println("Zero");
        }

    public static int reverse (int number) {
        int newNumber = 0;
        int lastDigit;
        while (number != 0) {
            lastDigit = number % 10;
            newNumber = newNumber + lastDigit;
            number /= 10;
            if (number != 0)
                newNumber *= 10;
        }
        return newNumber;
        }

    public static int getDigitCount (int number) {
        int digitCount = 0;
        if(number < 0) {
            return -1;
        }
        while (number != 0) {
            number /= 10;
            digitCount++;
        }
        if (digitCount <= 0) {
            return 1;
        } return digitCount;
    }
}

