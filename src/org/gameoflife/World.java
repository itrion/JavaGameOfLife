package org.gameoflife;

import java.util.LinkedList;
import java.util.List;

public class World {
    private final String name;
    private List<Cell> cells;
    private Map map;

    public World(String name, int mapSize) {
        this.name = name;
        this.cells = new LinkedList<>();
        this.map = new Map();
    }

    public String getName() {
        return name;
    }

    public void putCell(Cell cell, Coordinates coordinates) {
        cells.add(cell);
        map.placeCell(coordinates, cell.getId());
    }

    public Cell[] getCells() {
        return cells.toArray(new Cell[cells.size()]);
    }

    public int getAliveCells() {
        int aliveCells = 0;
        for (Cell cell : cells) if (cell.isAlive()) aliveCells++;
        return aliveCells;
    }

    public int getAliveNeighbours(Cell cell) {
        int neighbours = 0;
        for (Cell cellInWorld : cells)
            if (map.isNeighbour(cellInWorld.getId(), cell.getId()) && cellInWorld.isAlive())
                neighbours++;
        return neighbours;
    }


    public Cell getCellAt(int coordinateX, int coordinateY) {
        Long cellId = map.getCellAt(new Coordinates(coordinateX, coordinateY));
        for (Cell cell : cells) if (cell.getId().equals(cellId)) return cell;
        throw new RuntimeException("Cell is not the World, maybe an alien?");
    }
}
