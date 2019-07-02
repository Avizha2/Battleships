import model.Grid;
import model.Player;
import model.Ship;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Grid gameBoard1 = new Grid();
        Grid.clearBoard(gameBoard1.grid);
        Grid.displayGrid(gameBoard1.grid);
        Player p1 = new Player();
        p1.setId(1);
        p1.setScore(100);
        p1.setShips();
        p1.setPlayerName("Alex");

        p1.ships.get(0).Loc.Col = 3;
        p1.ships.get(0).Loc.Row = 3;
        for(int i = 0; i < p1.ships.get(0).size; i++){
            Grid.setValue(gameBoard1.grid,  p1.ships.get(0).Loc.Col, i+p1.ships.get(0).Loc.Row,'~' );
        }


        Grid.displayGrid(gameBoard1.grid);

    }
}
