package com.flo;

public class Main {
  //  private static String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(area(10, 10));
        System.out.println(area(10));

    }
    public static double area (double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }
    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

}
