package org.gameoflife;

import java.util.LinkedList;
import java.util.List;

public class World {
    private final String name;
    private List<Cell> cells;

    public World(String name) {
        this.name = name;
        this.cells = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void putCell(Cell cell) {
        cells.add(cell);
    }

    public int getAliveCells() {
        int aliveCells = 0;
        for (Cell cell : cells) if (cell.getState().equals(State.ALIVE)) aliveCells++;
        return aliveCells;
    }
}
