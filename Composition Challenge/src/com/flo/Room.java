package com.flo;

public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Table table;
    private Floor floor;
    private Couch couch;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Table table, Floor floor, Couch couch) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.table = table;
        this.floor = floor;
        this.couch = couch;
    }

    public Couch getCouch() {
        return this.couch;
    }

    public void cleanTable(){
        System.out.println("Room - Table cleaning");
        table.cleaning();
    }
}
