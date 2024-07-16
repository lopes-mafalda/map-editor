package io.codeforall.flowribellas.grid;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Position {

    private int col;
    private int row;
    private Rectangle rectangle;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;

        this.rectangle = new Rectangle(Grid.convertToPix(col), Grid.convertToPix(row), Grid.CELL_SIZE, Grid.CELL_SIZE);
        this.rectangle.draw();
    }

    public int moveUp() {
        this.row -= 1;
        return this.row;
    }

    public int moveDown() {
        this.row += 1;
        return this.row;
    }

    public int moveLeft() {
        this.col -=1;
        return this.col;
    }

    public int moveRight() {
        this.col +=1;
        return this.col;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void paint(){
        this.rectangle.fill();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
