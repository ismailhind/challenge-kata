package com.practice.ismail.kata;

public class main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        for (int i = 10101; i < 10102 ; i++) {
            System.out.println("  " + i + "  => " + controller.compute("" + i));
        }
    }
}
