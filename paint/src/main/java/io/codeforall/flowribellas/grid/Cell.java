package io.codeforall.flowribellas.grid;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Position position;
    private Rectangle rectangle;

    public Cell(int col, int row) {
        this.position = new Position(col, row);
        this.rectangle = new Rectangle(Grid.convertToPix(col), Grid.convertToPix(row), Grid.CELL_SIZE, Grid.CELL_SIZE);
        this.rectangle.draw();
    }


}
