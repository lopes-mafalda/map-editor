package io.codeforall.flowribellas.grid;

public class Position {

    private int col;
    private int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
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
}
