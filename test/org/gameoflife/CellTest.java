package org.gameoflife;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

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
        assertEquals(true, cell.isDead());
    }

    @Test
    public void testCellAlive(){
        Cell cell = new Cell();
        cell.kill();
        cell.resurrect();
        assertEquals(true, cell.isAlive());
    }

    @Test
    public void newCellHasId(){
        Cell cell = new Cell();
        assertNotNull(cell.getId());
    }

}
