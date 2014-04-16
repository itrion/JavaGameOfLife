package org.gameoflife;

public class God {
    private final String name;
    private World world;
    private int daysElapsed;

    public God(String name, String worldName) {
        this.name = name;
        this.world = new World(worldName, 20);
    }

    public World getWorld() {
        return world;
    }

    public void createNewCell(int coordenateX, int coordenateY) {
        world.putCell(new Cell(), new Coordinates(coordenateX, coordenateY));
    }

    public int getAliveFollowers() {
        return world.getAliveCells();
    }

    public void nextDay() {
        daysElapsed++;
        updateWorld();
    }

    private void updateWorld() {
        for (Cell cell : world.getCells()){
            if (GameOfLifeRules.resurrects(cell, world)) cell.resurrect();
            else if(!GameOfLifeRules.surviveNextDay(cell, world)) cell.kill();
        }
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
        world.getCellAt(coordinateX, coordinateY).kill();
    }
}
