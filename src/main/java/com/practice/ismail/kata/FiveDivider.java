package com.practice.ismail.kata;

import static com.practice.ismail.kata.KataConstants.BAR;
import static com.practice.ismail.kata.KataConstants.FIVE;

public class FiveDivider implements Divider,ContainedChar {

    @Override
    public String divideBy(String input) {
        return Integer.parseInt(input) % Integer.parseInt(FIVE) == 0 ? BAR : "";
    }

    @Override
    public String contains(String input) {
        return input.contains(FIVE) ? BAR : "";
    }
}
