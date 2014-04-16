package org.gameoflife.rules;


import org.gameoflife.Cell;
import org.gameoflife.World;

public class UnderPopulation implements Rule {

    @Override
    public boolean appliesTo(Cell cell, World world) {
        return world.getAliveNeighbours(cell) < 2;
    }
}
