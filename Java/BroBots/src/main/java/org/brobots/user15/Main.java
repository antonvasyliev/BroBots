package org.brobots.user15;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by anton on 23.10.2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 13; i >= 0; i--) {
            if (i == 11) {
                continue;
            }
            Thread.sleep(1000);
            System.out.println((i == 0) ? "BOOM!" : i + " seconds");
        }




        int min = 8;
        int max = 122;

        Random random = new Random();
        //System.out.println(random.nextInt((max - min) + 1) + min);

        int[][] integers = new int[10][10];
        String message = null;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                integers[i][j] = random.nextInt((max - min) + 1) + min;
                if (integers[i][j] % 3 == 0) {
                    System.out.print('?');
                }
                else if (integers[i][j] % 10 == 0) {
                    System.out.print("ten");
                }
                else {
                    System.out.print(integers[i][j]);
                }
                if (message == null & integers[i][j] == max) {
                    message = "First max value appearance was detected in " + (i + 1) + "x" + (j + 1) + " cell";
                }
                System.out.print(" | ");

            }

            System.out.println("");
        }

        if (message != null)
            System.out.println("\n" + message);
    }

}
