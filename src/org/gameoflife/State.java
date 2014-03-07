package org.gameoflife;

public class State {
    public static final State DEAD = new State("DEAD");
    public static final State ALIVE = new State("ALIVE");
    private final String stateName;

    private State(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return stateName;
    }
}
