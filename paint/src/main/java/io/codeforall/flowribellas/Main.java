package io.codeforall.flowribellas;

import io.codeforall.flowribellas.grid.Grid;
import io.codeforall.flowribellas.player.Player;

public class Main {

    public static void main(String[] args) {

        Grid squareGrid = new Grid(25, 20);
        Player player = new Player();
        Game game = new Game(squareGrid, player);
    }
}
