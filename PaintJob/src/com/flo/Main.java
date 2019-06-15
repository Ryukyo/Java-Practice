package com.flo;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0.0) || (height <= 0.0) || (areaPerBucket <= 0.0) || (extraBuckets < 0)) {
            return -1;
        } else {
            double area = width * height;
            int necessaryBuckets = (int) (Math.ceil(area / areaPerBucket));
            return necessaryBuckets - extraBuckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            return getBucketCount(width, height, areaPerBucket, 0);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            return (int) (Math.ceil(area / areaPerBucket));
        }
    }
}
