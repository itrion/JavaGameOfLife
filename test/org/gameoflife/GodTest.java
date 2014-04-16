package org.gameoflife;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodTest {

    public static final String GOD_NAME = "Stallman";
    public static final String WORLD_NAME = "GNU";
    private God god;

    @Before
    public void setUp() {
        god = new God(GOD_NAME, WORLD_NAME);
    }

    @Test
    public void testGodName() {
        assertEquals(GOD_NAME, god.getName());
    }

    @Test
    public void worldCreationTest() {
        assertEquals(WORLD_NAME, god.getWorld().getName());
    }

    @Test
    public void addCellTest() {
        god.createNewCell(0,0);
        assertEquals(1, god.getAliveFollowers());
    }

    @Test
    public void godTimeTest() {
        god.nextDay();
        assertEquals(1, god.getDaysElapsed());
    }
}
