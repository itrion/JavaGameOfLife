package org.gameoflife.rules;

import org.gameoflife.Cell;

public interface Rule {
    public boolean apply(Cell cell);
}
