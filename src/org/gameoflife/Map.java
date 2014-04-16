package org.gameoflife;

import java.util.LinkedHashMap;

public class Map {
    private java.util.Map<Long, Coordinates> map;

    public Map() {
        this.map = new LinkedHashMap<>();
    }

    public void placeCell(Coordinates coordinates, Long cellID) {
        map.put(cellID, coordinates);
    }

    public boolean isNeighbour(Long firstID, Long secondID) {
        return !firstID.equals(secondID) && (Math.abs(map.get(firstID).getCoordenateX() - map.get(secondID).getCoordenateX()) <= 1) && (Math.abs(map.get(firstID).getCoordenateY() - map.get(secondID).getCoordenateY()) <= 1);
    }

    public Long getCellAt(Coordinates coordinatesToFind) {
        for (java.util.Map.Entry<Long, Coordinates> coordenatesInMap : map.entrySet()) {
            if(coordenatesInMap.getValue().equals(coordinatesToFind)) return coordenatesInMap.getKey();
        }
        throw new RuntimeException("Coordinates are not in map");
    }
}
