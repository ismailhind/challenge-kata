package com.practice.ismail.kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.practice.ismail.kata.KataConstants.*;

public class DividersFactory {

    static Map<String, Divider> dividersMap = new HashMap<>();
    static {
        dividersMap.put(THREE, new ThreeDivider());
        dividersMap.put(FIVE, new FiveDivider());
        dividersMap.put(SEVEN, new SevenDivider());

    }

    public static Optional<Divider> getDivider(String divider) {
        return Optional.ofNullable(dividersMap.get(divider));
    }

}
