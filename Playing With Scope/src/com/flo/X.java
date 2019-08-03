package com.flo;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number between 1 and 12: ");
        this.x = x.nextInt();
    }

    public void x () {
        for (int x=1; x<13; x++) {
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
