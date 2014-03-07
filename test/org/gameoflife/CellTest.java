package org.gameoflife;

import org.junit.Test;

public class CellTest {

    @Test
    public void testCellCreation(){
        Cell cell = new Cell();
        assertEquals(State.ALIVE, cell.getState());
    }

    @Test
    public void testCellDie(){
        Cell cell = new Cell();
        cell.kill();
        assertEquals(State.DEAD, cell.getState());
    }

    @Test
    public void testCellAlive(){
        Cell cell = new Cell();
        cell.kill();
        cell.resurrect();
        assertEquals(State.ALIVE, cell.getState());

    }
}
