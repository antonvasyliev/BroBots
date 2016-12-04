package org.brobots.user2;

/**
 * Created by anton on 03.12.2016.
 */
public class Screen {

    private static DialogWindow dialogWindow;

    static String name;

    static int age;

//    public Screen() {
//        dialogWindow = new DialogWindow();
//    }
//
    private static void test() {

    }

    public DialogWindow getDialogWindow() {
        return dialogWindow;
    }

    public void setName(String name) {
        Screen.name = name;
    }

    public void setAge(int age) {
        Screen.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    static class DialogWindow {

        DialogWindow() {

        }

        public void setName(String name) {
            Screen.name = name;
        }

        public void setAge(int age) {
            Screen.age = age;
        }



    }

}
