package org.gameoflife;

import java.util.LinkedHashMap;

public class Map {
    private java.util.Map<Long, Coordenates> map;

    public Map(int mapSize) {
        this.map = new LinkedHashMap<>();
    }

    public void placeCell(Coordenates coordenates, Long cellID) {
        map.put(cellID, coordenates);
    }

    public boolean isNeighbour(Long firstID, Long secondID) {
        if (firstID.equals(secondID))
            return false;

        return (Math.abs(map.get(firstID).getCoordenateX() - map.get(secondID).getCoordenateX()) <= 1) &&
                (Math.abs(map.get(firstID).getCoordenateY() - map.get(secondID).getCoordenateY()) <= 1);
    }
}
