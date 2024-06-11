package io.codeforall.flowribellas;

import io.codeforall.flowribellas.grid.Grid;
import io.codeforall.flowribellas.player.Player;

public class Game {
    private Grid grid;
    private Player player;

    public Game(Grid grid, Player player) {
        this.grid = grid;
        grid.start();

        this.player = player;
    }
}
