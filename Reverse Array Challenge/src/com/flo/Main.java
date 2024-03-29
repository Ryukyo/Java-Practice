package com.flo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] array = {1,5,3,7,11,9,15};
        System.out.println("Original array is " + Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed array is " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length-1;
        for(int i = 0; i <array.length/2; i++) {
            int tempVar = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = tempVar;
        }
    }
}
