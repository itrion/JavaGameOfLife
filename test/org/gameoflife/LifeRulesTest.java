package org.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LifeRulesTest {

    @Test
    public void justOneCellDie() {
        God god = new God("Hextor");
        god.createNewCell();
        assertEquals(1, god.getAliveFollowers());
        god.nextDay();
        assertEquals(0, god.getAliveFollowers());
        assertEquals(1, god.getDeadFollowers());
    }

    @Test
    public void justOneNeighboursDie() {
        God god = new God("Hextor");
        god.createNewCell(0, 1);
        god.createNewCell(1, 0);
        assertEquals(2, god.getAliveFollowers());
        god.nextDay();
        assertEquals(0, god.getAliveFollowers());
        assertEquals(2, god.getDeadFollowers());
    }

    @Test
    public void withTwoNeighboursSurvive() {
        God god = new God("Hextor");
        god.createNewCell(0, 0);
        god.createNewCell(0, 1);
        god.createNewCell(1, 1);
        assertEquals(3, god.getAliveFollowers());
        god.nextDay();
        assertEquals(3, god.getAliveFollowers());
        assertEquals(0, god.getDeadFollowers());
    }

    @Test
    public void withThreeNeighboursSurvive() {
        assertTrue(false);
    }

    @Test
    public void withThreeNeighboursBornNewCell() {
        assertTrue(false);
    }

    @Test
    public void withMoreThanThreeNeighboursDie() {
        assertTrue(false);
    }




}
