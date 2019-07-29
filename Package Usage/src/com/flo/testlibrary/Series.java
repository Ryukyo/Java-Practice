package com.flo.testlibrary;

public class Series {

    public static long nSum (int n) {
        return (n * (n+1)) /2;
    }

    public static long factorial (int n) {
        if (n == 0) {
            return 1;
        }
        long factorSum = 1;
        for (int i = 1; i <=n; i++) {
            factorSum *= i;
        }
        return factorSum;
    }

    public static long fibonacci (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fiboValue =0;
        for (int i =1; i < n; i++) {
            fiboValue = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fiboValue;
        }
        return fiboValue;
    }
}
