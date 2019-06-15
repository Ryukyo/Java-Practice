package com.flo;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
       byte aByte = -10;
       short aShort = 5;
       int aInt = 15;
       long aLong = 50000L + 10L * (aByte + aShort + aInt);
        short shortsum = (short) (1000 + 10 * (aByte + aShort + aInt));
        System.out.println(shortsum);

    }
}
