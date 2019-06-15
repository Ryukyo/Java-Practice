package com.flo;

public class Table {
    private String color;
    private int legs;
    private int height;

    public Table(String color, int legs, int height) {
        this.color = color;
        this.legs = legs;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

    public int getHeight() {
        return height;
    }

    public void cleaning(){
        System.out.println("Table: cleaning");
    }
}
