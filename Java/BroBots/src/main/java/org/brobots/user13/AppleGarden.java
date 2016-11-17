package org.brobots.user13;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by anton on 23.10.2016.
 */
public class AppleGarden {

    private static int treesNumber = ThreadLocalRandom.current().nextInt(21) + 30;


    public static void main(String[] args) {

        Basket
                redApplesBasket = new Basket(),
                greenApplesBasket = new Basket(),
                orangeApplesBasket = new Basket(),
                yellowApplesBasket = new Basket();

        for (int i = 0; i < treesNumber; i++) {
            AppleTree appleTree = new AppleTree();

            AbstractApple[] apples = appleTree.getApples();

            for (int j = 0; j < apples.length; j++) {
                AbstractApple apple = apples[j];
                switch (apple.getColor()) {
                    case "red":
                        redApplesBasket.putApple(apple);
                        break;
                    case "orange":
                        orangeApplesBasket.putApple(apple);
                        break;
                    case "green":
                        greenApplesBasket.putApple(apple);
                        break;
                    case "yellow":
                        yellowApplesBasket.putApple(apple);
                        break;
                }
            }

        }

        System.out.println("Basket with red apples contains " + redApplesBasket.getApplesCount() + " apples");
        System.out.println("Basket with orange apples contains " + orangeApplesBasket.getApplesCount() + " apples");
        System.out.println("Basket with green apples contains " + greenApplesBasket.getApplesCount() + " apples");
        System.out.println("Basket with yellow apples contains " + yellowApplesBasket.getApplesCount() + " apples");

    }

}
