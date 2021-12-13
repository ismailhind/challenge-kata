package com.practice.ismail.kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.practice.ismail.kata.KataConstants.*;

public class ContainerCharsFactory {

    static Map<String, ContainedChar> containerCharsMap = new HashMap<>();
    static {
        containerCharsMap.put(THREE, new ThreeDivider());
        containerCharsMap.put(FIVE, new FiveDivider());
        containerCharsMap.put(SEVEN, new SevenDivider());
        containerCharsMap.put(ZERO, new WildCardContainerChar());

    }

    public static Optional<ContainedChar> getContainerChar(String containersChar) {
        return Optional.ofNullable(containerCharsMap.get(containersChar));
    }
}