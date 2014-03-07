package org.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LifeRulesTest {

    private God god;

    @Before
    public void setUp(){
        god = new God("Hextor");
        god.newWorld("Pandora");
    }

    @Test
    public void justOneCellDie() {
        god.createNewCell(0, 0);
        assertEquals(1, god.getAliveFollowers());
        god.nextDay();
        assertEquals(0, god.getAliveFollowers());
        assertEquals(1, god.getDeadFollowers());
    }

    @Test
    public void justOneNeighboursDie() {
        god.createNewCell(0, 1);
        god.createNewCell(1, 0);
        assertEquals(2, god.getAliveFollowers());
        god.nextDay();
        assertEquals(0, god.getAliveFollowers());
        assertEquals(2, god.getDeadFollowers());
    }

    @Test
    public void withTwoNeighboursSurvive() {
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
        god.createNewCell(0, 0);
        god.createNewCell(0, 1);
        god.createNewCell(1, 1);
        god.createNewCell(1, 0);
        assertEquals(4, god.getAliveFollowers());
        god.nextDay();
        assertEquals(4, god.getAliveFollowers());
        assertEquals(0, god.getDeadFollowers());
    }

    @Test
    public void aDeadCellwithThreeNeighboursBecomeToLive() {
        god.createNewCell(0, 0);
        god.createNewCell(0, 1);
        god.createNewCell(1, 1);

        god.createNewCell(1, 0);
        god.killCell(1, 0);

        assertEquals(3, god.getAliveFollowers());
        assertEquals(1, god.getDeadFollowers());
        god.nextDay();
        assertEquals(4, god.getAliveFollowers());
        assertEquals(0, god.getDeadFollowers());
    }

    @Test
    public void withMoreThanThreeNeighboursDie() {
        god.createNewCell(0, 0);
        god.createNewCell(0, 1);
        god.createNewCell(1, 1);
        god.createNewCell(1, 0);
        god.createNewCell(1, 2);
        assertEquals(5, god.getAliveFollowers());
        god.nextDay();
        assertEquals(4, god.getAliveFollowers());
        assertEquals(1, god.getDeadFollowers());
    }




}
