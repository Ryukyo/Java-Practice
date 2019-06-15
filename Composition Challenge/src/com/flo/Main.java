package com.flo;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Floor floor = new Floor(10, "blue");

        Table table = new Table("brown", 4, 50);

        Couch couch = new Couch("modern", 3,"black");

        Room room = new Room("Flo", wall1,wall2,wall3,wall4,table,floor,couch);
        room.cleanTable();

        room.getCouch().shakePillow();
    }
}
