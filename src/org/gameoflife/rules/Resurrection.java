package org.gameoflife.rules;

import org.gameoflife.Cell;
import org.gameoflife.World;

public class Resurrection implements Rule {
    @Override
    public boolean appliesTo(Cell cell, World world) {
        return cell.isDead() && world.getAliveNeighbours(cell) == 3;
    }
}
