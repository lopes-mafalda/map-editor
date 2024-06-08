package io.codeforall.flowribellas.grid;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 30;
    public int cols;
    public int rows;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        draw();
    }

    private void draw(){
        Rectangle field = new Rectangle(PADDING, PADDING, getWidth(), getHeight());
        field.draw();
    }

    public void start(){

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                Cell cell = new Cell(i, j);
            }
        }
    }

    public int getWidth(){
        return convertToPix(cols) - PADDING;
    }

    public int getHeight(){
        return convertToPix(rows) - PADDING;
    }

    public static int convertToPix(int numb){
        return (numb * CELL_SIZE) + PADDING;
    }


}
