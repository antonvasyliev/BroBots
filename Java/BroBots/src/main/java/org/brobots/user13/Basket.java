package org.brobots.user13;

import java.util.Arrays;

/**
 * Created by anton on 17.11.2016.
 */
public class Basket {

    private AbstractApple[] apples = {};

    public void putApple(AbstractApple apple) {
        AbstractApple[] apples = new AbstractApple[this.apples.length + 1];
        apples[apples.length - 1] = apple;
        this.apples = apples;
    }

    public int getApplesCount() {
        return apples.length;
    }

}
