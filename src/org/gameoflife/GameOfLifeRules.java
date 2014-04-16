package org.gameoflife;

import org.gameoflife.rules.*;

import java.util.LinkedList;
import java.util.List;

public class GameOfLifeRules {
    private static List<Rule> deadRules;

    static {
        deadRules = new LinkedList<>();
        deadRules.add(new UnderPopulation());
        deadRules.add(new OverPopulation());
    }

    public static boolean surviveNextDay(Cell cell, World world) {
        for (Rule deadRule : deadRules)
            if (deadRule.appliesTo(cell, world)) return false;
        return true;
    }

    public static boolean resurrects(Cell cell, World world) {
        return new Resurrection().appliesTo(cell, world);
    }
}
