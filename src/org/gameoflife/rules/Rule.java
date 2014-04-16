package org.gameoflife.rules;

import org.gameoflife.Cell;
import org.gameoflife.World;

public interface Rule {
    public boolean appliesTo(Cell cell, World world);
}
