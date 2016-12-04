package org.brobots.user2;

/**
 * Created by anton on 23.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setName("Anton");
        screen.setAge(25);

        Screen.DialogWindow dialogWindow = new Screen.DialogWindow();
        dialogWindow.setAge(18);
        dialogWindow.setName("Alex");


    }

}
