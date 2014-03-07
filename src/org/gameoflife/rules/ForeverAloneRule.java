package org.gameoflife.rules;

import org.gameoflife.Cell;

public class ForeverAloneRule implements Rule{
    @Override
    public boolean apply(Cell cell) {
        return false;
    }
}
