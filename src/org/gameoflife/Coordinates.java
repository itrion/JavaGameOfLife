package org.gameoflife;

public class Coordinates {
    private int coordenateX;
    private int coordenateY;

    public Coordinates(int coordenateX, int coordenateY) {
        this.coordenateX = coordenateX;
        this.coordenateY = coordenateY;
    }

    public int getCoordenateX() {
        return coordenateX;
    }

    public int getCoordenateY() {
        return coordenateY;
    }

    @Override
    public int hashCode() {
        return (coordenateX + "," + coordenateY).hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof Coordinates && ((Coordinates) obj).coordenateX == this.coordenateX && ((Coordinates) obj).coordenateY == this.coordenateY;
    }

}
