package io.codeforall.flowribellas.grid;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private Position position;
    private boolean isPainted;

    public Cell(int col, int row) {
        this.position = new Position(col, row);
        this.isPainted = false;
    }

    public void paint(){
        position.paint();
    }

    public Position getPosition() {
        return position;
    }


    public void setColor(Color color) {
        this.position.getRectangle().setColor(color);
    }
}
