package org.gameoflife;

public class Cell {

    private State state;
    private Long id;

    public Cell() {
        this.state = State.ALIVE;
        this.id = System.nanoTime();
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

    public Long getId() {
        return id;
    }

    public boolean isAlive() {
        return state == State.ALIVE;
    }

    public boolean isDead() {
        return state == State.DEAD;
    }
}
