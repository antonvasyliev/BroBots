package org.brobots.user1;

/**
 * Created by anton on 28.11.2016.
 */
class Monitor {

    private boolean isPlugged;

    void isPlugged(boolean isPlugged) {
        this.isPlugged = isPlugged;
    }

    void turnMonitor(boolean isActive) {
        System.out.println(
                (!isPlugged)
                        ? "You didn't plugged monitor to system block"
                        : (isActive)
                            ? "Monitor is turned on"
                            : "Monitor is turned off"
        );
    }

}
