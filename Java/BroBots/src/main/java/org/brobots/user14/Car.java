package org.brobots.user14;

/**
 * Created by anton on 07.11.2016.
 */
public class Car {

    private int mCypher;

    public void setCypher(int cypher) {
        mCypher = cypher;
    }

    public void startEngine(Key key) {

        if (key.getCypher() == mCypher)
            System.out.println("Engine is started");
        else
            System.out.println("Engine is not started");
    }

}
