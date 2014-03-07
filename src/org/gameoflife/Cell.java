package org.gameoflife;

public class Cell {

    private State state;

    public Cell() {
        this.state = State.ALIVE;
    }

    public State getState() {
        return state;
    }

    public void kill() {
        state = State.DEAD;
    }

    public void resurrect() {
        state = State.ALIVE;
    }
}
