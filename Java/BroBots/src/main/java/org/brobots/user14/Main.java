package org.brobots.user14;

import java.util.Random;

/**
 * Created by anton on 23.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        int min = 1000000;
        int max = 9999999;

        Random random = new Random();

        int cypher = random.nextInt((max - min) + 1) + min;

        KeyFactory keyFactory = new KeyFactory();
        keyFactory.setCypher(cypher);

        Car car = new Car();
        car.setCypher(cypher);

        Key key = keyFactory.getKey();

        car.startEngine(key);

    }

}
