import model.Grid;

public class Main {

    public static void main(String[] args) {
        Grid gameBoard = new Grid();
        Grid.clearBoard(gameBoard.grid);
        Grid.displayGrid(gameBoard.grid);
    }
}
