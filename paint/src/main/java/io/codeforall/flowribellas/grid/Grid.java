package io.codeforall.flowribellas.grid;


import io.codeforall.flowribellas.KeyboardController;
import io.codeforall.flowribellas.cursor.Cursor;
import io.codeforall.flowribellas.cursor.Direction;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 30;
    public final int cols;
    public final int rows;
    private Cell[][] cells;
    private Cursor cursor;
    private KeyboardController keyboardController;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

        this.cells = draw();

        this.cursor = new Cursor();
    }

    private Cell[][] draw(){

        this.cells = new Cell[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }

        return cells;
    }

    public boolean isEdge(Direction direction, Cursor cursor){
        switch (direction){
            case UP:
                return cursor.getPosition().getRow() == 0;

            case DOWN:
                return cursor.getPosition().getRow() == rows;

            case LEFT:
                return cursor.getPosition().getCol() == 0;
            case RIGHT:
                return cursor.getPosition().getCol() == cols;
        }
    }

    public static int convertToPix(int numb){
        return (numb * CELL_SIZE) + PADDING;
    }



/*
    private int getWidth(){
        return convertToPix(cols) - PADDING;
    }

    private int getHeight(){
        return convertToPix(rows) - PADDING;
    }
*/
}
