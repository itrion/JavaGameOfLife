package org.gameoflife;

public class LifeRules {

    public static boolean surviveNextDay(Cell cell, World world) {
        return !appliesJustOneNeighboursDieRule(cell, world);
    }

    private static boolean appliesJustOneNeighboursDieRule(Cell cell, World world) {
        return world.getAliveNeighbours(cell) == 1;
    }


}
