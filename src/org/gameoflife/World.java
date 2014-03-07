package org.gameoflife;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class World {
    private final String name;
    private List<Cell> cells;
    private Map map;

    public World(String name, int mapSize) {
        this.name = name;
        this.cells = new LinkedList<>();
        this.map = new Map(mapSize);
    }

    public String getName() {
        return name;
    }

    public void putCell(Cell cell) {
        cells.add(cell);
    }

    public Cell[] getCells() {
        return cells.toArray(new Cell[cells.size()]);
    }

    public int getAliveCells() {
        int aliveCells = 0;
        for (Cell cell : cells) if (cell.getState().equals(State.ALIVE)) aliveCells++;
        return aliveCells;
    }


}
