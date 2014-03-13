package org.gameoflife;

import org.gameoflife.exception.LifeException;

import java.util.List;

public class God {
    private final String name;
    private World world;
    private int daysElapsed;

    public God(String name) {
        this.name = name;
    }

    public void newWorld(String worldName) {
        this.world = new World(worldName, 20);
    }

    public World getWorld() {
        return world;
    }

    public void createNewCell(int coordenateX, int coordenateY) {
        if (world == null) throw new LifeException("Cannot create cell without a world");
        world.putCell(new Cell(), new Coordenates(coordenateX, coordenateY));
    }

    public int getAliveFollowers() {
        return world.getAliveCells();
    }

    public void nextDay() {
        daysElapsed++;
        updateWorld();
    }

    private void updateWorld() {
        for (Cell cell : cells)
            lifeRules.applyTo(cell);
    }

    public int getDaysElapsed() {

        return daysElapsed;
    }

    public String getName() {
        return name;
    }

    public int getDeadFollowers() {
        int deadCells = 0;
        for (Cell cell : world.getCells())
            if (cell.getState().equals(State.DEAD))
                deadCells++;
        return deadCells;
    }

    public void killCell(int coordinateX, int coordinateY) {

    }

}
