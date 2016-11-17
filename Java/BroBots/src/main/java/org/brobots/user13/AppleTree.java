package org.brobots.user13;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by anton on 17.11.2016.
 */
public class AppleTree {

    private AbstractApple[] apples = {new GreenApple(), new YellowApple(), new OrangeApple(), new RedApple()};

    private int fruitsNumber = ThreadLocalRandom.current().nextInt(51) + 100;

    public AbstractApple[] getApples() {
        AbstractApple[] apples = new AbstractApple[fruitsNumber];

        for (int i = 0; i < fruitsNumber; i++)
            apples[i] = getRandomApple();

        return apples;
    }

    private AbstractApple getRandomApple() {
        return apples[ThreadLocalRandom.current().nextInt(apples.length)];
    }

}
