package org.gameoflife.rules;

import org.gameoflife.Cell;
import org.gameoflife.World;

public class OverPopulation implements Rule {
    @Override
    public boolean appliesTo(Cell cell, World world) {
        return world.getAliveNeighbours(cell) > 3;
    }
}
