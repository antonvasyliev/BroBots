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
        if (!isPlugged) {
            System.out.println("You didn't plugged monitor to system block");
            System.exit(0);
        }
        else {
            System.out.println((isActive) ? "Monitor is turned on" : "Monitor is turned off");
        }
    }

}
