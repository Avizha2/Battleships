package model;

public class Ship {
    public int size;
    public Location Loc = new Location();//points to head of ship
    public boolean isSunk;
    public String name;
    public long value;

    public Ship(int size, boolean isSunk, String name, long value) {
        this.size = size;
        this.isSunk = isSunk;
        this.name = name;
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Location getLoc() {
        return Loc;
    }

    public void setLoc(Location loc) {
        this.Loc = loc;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        this.isSunk = sunk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}

