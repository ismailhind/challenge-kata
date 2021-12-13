package com.practice.ismail.kata;

import static com.practice.ismail.kata.KataConstants.FOO;
import static com.practice.ismail.kata.KataConstants.THREE;

public class ThreeDivider implements Divider,ContainedChar {

    @Override
    public String divideBy(String input) {
        return Integer.parseInt(input) % Integer.parseInt(THREE) == 0 ? FOO : "";
    }

    @Override
    public String contains(String input) {
        return input.contains(THREE) ? FOO : "";
    }
}