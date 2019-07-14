package com.flo;

import java.util.ArrayList;
import java.util.List;

public class DarkLord implements ISaveable {
    private String name;
    private int lifePoints;
    private int strength;

    public DarkLord(String name, int lifePoints, int strength) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,"" + this.lifePoints);
        values.add(2,"" + this.strength);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.lifePoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "DarkLord{" +
                "name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                ", strength=" + strength +
                '}';
    }
}
