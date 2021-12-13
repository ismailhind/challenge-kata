package com.practice.ismail.kata;

import static com.practice.ismail.kata.KataConstants.QIX;
import static com.practice.ismail.kata.KataConstants.SEVEN;

public class SevenDivider implements Divider,ContainedChar {

    @Override
    public String divideBy(String input) {
        return Integer.parseInt(input) % Integer.parseInt(SEVEN) == 0 ? QIX : "";
    }

    @Override
    public String contains(String input) {
        return input.contains(SEVEN) ? QIX : "";
    }
}
