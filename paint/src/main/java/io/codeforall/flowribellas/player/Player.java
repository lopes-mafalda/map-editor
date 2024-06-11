package io.codeforall.flowribellas.player;

import io.codeforall.flowribellas.grid.Cell;
import io.codeforall.flowribellas.grid.Position;

public class Player{

    private Cell cell;
    private KeyboardController keyboardController;

    public Player() {
        this.cell = new Cell(0, 0);
        cell.paint();
    }

    public Position getPosition(){
        return cell.getPosition();
    }

    public void moveUp() {
        cell.getPosition().moveUp();
    }

    public void moveDown() {
        cell.getPosition().moveDown();
    }

    public void moveLeft() {
        cell.getPosition().moveLeft();
    }

    public void moveRight() {
        cell.getPosition().moveRight();
    }
}
