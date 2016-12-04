package org.brobots.user1.details;

/**
 * Created by anton on 28.11.2016.
 */
public class AbstractCircuitBoard {

    private boolean isEnergized;

    public void energize(boolean isEnergized) {
        this.isEnergized = isEnergized;
        String className = this.getClass().getSimpleName();
        System.out.println((isEnergized) ? className + " is turned on" : className + " is turned off");
    }

    public boolean isEnergized() {
        return isEnergized;
    }

}
