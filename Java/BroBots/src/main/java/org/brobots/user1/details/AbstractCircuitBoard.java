package org.brobots.user1.details;

/**
 * Created by anton on 28.11.2016.
 */
public class AbstractCircuitBoard {

    private boolean isEnergized;

    public void energize() {
        isEnergized = true;
        System.out.println(this.getClass().getSimpleName() + " is turned on");
    }

    public boolean isEnergized() {
        return isEnergized;
    }

}
