package model;

import java.util.ArrayList;

public class Player {
    public String playerName;
    public ArrayList<Ship> ships = new ArrayList<>();
    private long id;
    private long score;

    public Player(String playerName, ArrayList<Ship> ships, long id, long score) {
        this.playerName = playerName;
        this.ships = ships;
        this.id = id;
        this.score = score;
    }

    public Player() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public void setShips() {
         this.ships.add(new Ship(5,false,"Carrier", 20));
         this.ships.add(new Ship(4,false,"Battleship", 20));
         this.ships.add(new Ship(3,false,"Cruiser", 20));
         this.ships.add(new Ship(3,false,"Submarine ", 20));
         this.ships.add(new Ship(2,false,"Destroyer", 20));
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }



}
