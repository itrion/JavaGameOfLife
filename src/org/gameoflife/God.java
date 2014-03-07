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
        this.world = new World(worldName);
    }

    public World getWorld() {
        return world;
    }

    public void createNewCell() {
        if (world == null) throw new LifeException("Cannot create cell without a world");
        world.putCell(new Cell());
    }

    public int getAliveFollowers() {
        return world.getAliveCells();
    }

    public void nextDay() {
        daysElapsed++;
    }

    public int getDaysElapsed() {

        return daysElapsed;
    }

    public String getName() {
        return name;
    }
}
