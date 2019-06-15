package com.flo;

public class Floor {
    private int area;
    private String carpetColor;

    public Floor(int area, String carpetColor) {
        this.area = area;
        this.carpetColor = carpetColor;
    }

    public int getArea() {
        return area;
    }

    public String getCarpetColor() {
        return carpetColor;
    }
}
