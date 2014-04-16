package org.gameoflife;

import org.gameoflife.exception.LifeException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GodTest {

    public static final String GOD_NAME = "Stallman";
    public static final String WORLD_NAME = "GNU";
    private God god;

    @Before
    public void setUp() {
        god = new God.Builder().withName(GOD_NAME).toWorld(WORLD_NAME).build();
        god = new God(GOD_NAME);
    }

    @Test
    public void testGodName() {
        assertEquals(GOD_NAME, god.getName());
    }

    @Test
    public void worldCreationTest() {
        god.newWorld(WORLD_NAME);
        assertEquals(WORLD_NAME, god.getWorld().getName());
    }

    @Test
    public void addCellTest() {
        god.newWorld(WORLD_NAME);
        god.createNewCell(0,0);
        assertEquals(1, god.getAliveFollowers());
    }

    @Test
    public void cantCreateCellsWithoutWorld() {
        try {
            god.createNewCell(0,0);
            assertTrue("Exception expected", false);
        } catch (LifeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void godTimeTest() {
        god.nextDay();
        assertEquals(1, god.getDaysElapsed());
    }
}
