package org.gameoflife;

import java.util.LinkedHashMap;

public class Map {
    private java.util.Map<Coordenates, Long> map;

    public Map(int mapSize) {
        this.map = new LinkedHashMap<>();
    }

    public void placeCell(Coordenates coordenates, Long cellID) {
        map.put(coordenates, cellID);
    }
}
