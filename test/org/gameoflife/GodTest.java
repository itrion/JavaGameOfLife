package org.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodTest {

    @Test
    public void worldCreationTest() {
        God god = new God("Stallman");
        god.createNewWorld("GNU");
        assertEquals("GNU", god.getWorld().getName());
    }

    @Test
    public void addCellTest() {
        God god = new God("Stallman");
        god.createNewWorld("GNU");
        god.createNewCell();
        assertEquals(1, god.getAliveFollowers().size());
    }

    @Test
    public void godTimeTest() {
        God god = new God("Stallman");
        god.nextDay();
        assertEquals(1, god.daysElapsed());
    }

    @Test
    public void cellDieBecauseInanitionTest() {
        God god = new God("Stallman");
        god.createNewWorld("GNU");
        god.createNewCell();
        god.nextDay();
        assertEquals(0, god.getAliveFollowers().size());
    }

}
