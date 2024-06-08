package io.codeforall.flowribellas.player;

import io.codeforall.flowribellas.grid.Cell;
import io.codeforall.flowribellas.grid.Grid;
import io.codeforall.flowribellas.grid.Position;

public class Player extends Cell {

    private Position position;

    public Player() {
        super(Grid.PADDING, Grid.PADDING);
        this.position = new Position(0, 0);
    }
}
