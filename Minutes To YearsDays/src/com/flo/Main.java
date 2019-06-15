package com.flo;

public class Main {

    public static void main(String[] args) {
        System.out.println(printYearsAndDays(10000));

    }
    public static String printYearsAndDays (long minutes) {
        if (minutes < 0) {
            return "Invalid Value";
        }
        long days = minutes / (60 * 24);
        long years = days / 365;
        long totalDays = days + (days / 365);
        return minutes + " min = " + years + " y and " + totalDays + " d";
    }
}
/* public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
        System.out.println("Invalid Value");
        }
        else {
        long days = minutes / (60 * 24);
        long years = days / 365;
        long remainingDays = days % 365;
        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
    }
} */