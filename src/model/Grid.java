package model;

public class Grid {
    public char[][] grid;

    public Grid(){
        grid = new char[8][8];
    }

    public static void clearBoard(char[][] grid){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                grid[i][j] = '.';

            }
        }
    }
    public static void setValue(char[][] grid,int i,int j,char x){
        grid[i][j] = x;
    }

    public static void displayGrid(char[][] grid){
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_WHITE = "\u001B[30m";
        System.out.println();
        System.out.println("   ----------------");
        for(int i = 0; i < 8; i++){
            System.out.print(i+1 + " |");
            for(int j = 0; j < 8; j++) {
                System.out.print(ANSI_BLUE_BACKGROUND + ANSI_WHITE + grid[i][j]+ " "+ANSI_RESET);
            }
            System.out.println("|");
        }
        System.out.println("   ----------------");
        System.out.print("   A B C D E F G H");
    }
}
