package io.codeforall.flowribellas.cursor;

import io.codeforall.flowribellas.grid.Cell;
import io.codeforall.flowribellas.grid.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor {

    private Cell cell;

    public Cursor() {
        this.cell = new Cell(0, 0);
        cell.setColor(Color.CYAN);
        cell.paint();
    }

    public Position getPosition(){
        return cell.getPosition();
    }

    public void move(Direction direction){
        switch (direction){
            case DOWN:
                moveDown();
                break;

            case UP:
                moveUp();
                break;

            case LEFT:
                moveLeft();
                break;

            case RIGHT:
                moveRight();
                break;
        }
    }

    private void moveUp() {
        cell.getPosition().moveUp();
    }

    private void moveDown() {
        cell.getPosition().moveDown();
    }

    private void moveLeft() {
        cell.getPosition().moveLeft();
    }

    private void moveRight() {
        cell.getPosition().moveRight();
    }
}
