package com.practice.ismail.kata;

import static com.practice.ismail.kata.KataConstants.ZERO;
import static com.practice.ismail.kata.KataConstants.WILDCARD;

public class WildCardContainerChar implements ContainedChar {

    @Override
    public String contains(String input) {
        return input.contains(ZERO) ? WILDCARD : "";
    }
}