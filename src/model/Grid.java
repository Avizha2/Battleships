package model;

public class Grid {
    public int[][] grid;

    Grid(){
        grid = new int[8][8];
    }

    public static void clearBoard(int[][] grid){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                grid[i][j] = 0;

            }
        }
    }
    public static void setValue(int[][] grid,int i,int j,int x){
        grid[i][j] = x;
    }
}
