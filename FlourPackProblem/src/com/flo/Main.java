package com.flo;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 5));
        System.out.println(getLargestPrime(21));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigBag = bigCount * 5;
        int sum = bigBag + smallCount;
        int remainderGoal = goal % 5;

        if(sum > goal){
            if(bigBag > goal && smallCount != 0 && remainderGoal > smallCount){
                return false;
            }else if(bigBag > goal && smallCount!= 0 || smallCount > goal){
                return true;
            }else if(bigBag < goal && sum > goal){
                return true;
            }
        }
        return (sum == goal);
    }
    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        }
        int copyOfNumber = number;

        for (int i = copyOfNumber-1; i > 1; i--) {
            if (number % i == 0) {
                number = i;
            }
        } return number;
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || i == (number - 1) || j == 0 || j == (number - 1) || i == j || j == number - (i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}