package io.codeforall.flowribellas;

import io.codeforall.flowribellas.cursor.Direction;
import io.codeforall.flowribellas.grid.Grid;
import io.codeforall.flowribellas.cursor.Cursor;

public class Editor {

    private Grid grid;
    private Cursor cursor;

    public void moveCursor(Direction direction){
        cursor.move(direction);
    }
}
