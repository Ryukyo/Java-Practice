package com.flo;

public class Couch {
    private String style;
    private int pillows;
    private String color;

    public Couch(String style, int pillows, String color) {
        this.style = style;
        this.pillows = pillows;
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public String getColor() {
        return color;
    }

    public void shakePillow(){
        System.out.println("Couch -> Shake Pillow");
    }
}
