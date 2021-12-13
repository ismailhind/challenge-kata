package com.practice.ismail.kata;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static com.practice.ismail.kata.KataConstants.*;
import static org.junit.Assert.assertTrue;

class ControllerTest {

    Controller controller = new Controller();

    @Before
    public void setUp() {
        controller = new Controller();
    }

    @Test
    void inputAsOneTest() {
        String input = "1";
        assertTrue(controller.compute(input).equals("1"));
    }

    @Test
    void inputAsTwoTest() {
        String input = "2";
        assertTrue(controller.compute(input).equals("2"));
    }

    @Test
    void dividedByThreeTest() {
        String input = THREE;
        assertTrue(controller.compute(input).equals(FOO+FOO));
    }

    @Test
    void inputAsFourTest() {
        String input = "4";
        assertTrue(controller.compute(input).equals("4"));
    }

    @Test
    void dividedByFiveTest() {
        String input = FIVE;
        assertTrue(controller.compute(input).equals(BAR+BAR));
    }

    @Test
    void inputAsSixTest() {
        String input = "6";
        assertTrue(controller.compute(input).equals(FOO));
    }

    @Test
    void dividedBySevenTest() {
        String input = SEVEN;
        assertTrue(controller.compute(input).equals(QIX+QIX));
    }

    @Test
    void inputAsEightTest() {
        String input = "8";
        assertTrue(controller.compute(input).equals("8"));
    }
    @Test
    void inputAsNineTest() {
        String input = "9";
        assertTrue(controller.compute(input).equals(FOO));
    }
    @Test
    void inputAsTenTest() {
        String input = "10";
        assertTrue(controller.compute(input).equals(BAR+WILDCARD));
    }
    @Test
    void inputAsThirteenTest() {
        String input = "13";
        assertTrue(controller.compute(input).equals(FOO));
    }

    @Test
    void inputAsFifteenTest() {
        String input = "15";
        assertTrue(controller.compute(input).equals(FOO+BAR+BAR));
    }
    @Test
    void inputAsTwentyOneTest() {
        String input = "21";
        assertTrue(controller.compute(input).equals(FOO+QIX));
    }
    @Test
    void inputAsThirtyThreeTest() {
        String input = "33";
        assertTrue(controller.compute(input).equals(FOO+FOO+FOO));
    }
    @Test
    void inputAsFiftyOneTest() {
        String input = "51";
        assertTrue(controller.compute(input).equals(FOO+BAR));
    }
    @Test
    void inputAsFiftyThreeTest() {
        String input = "53";
        assertTrue(controller.compute(input).equals(BAR+FOO));
    }

    @Test
    void inputAsHundredAndOneTest() {
        String input = "101";
        assertTrue(controller.compute(input).equals("1*1"));
    }

    @Test
    void inputAsHundredAndFiveTest() {
        String input = "105";
        assertTrue(controller.compute(input).equals(FOO+BAR+QIX+"*"+BAR));
    }

    @Test
    void inputAsThreeHundredsAndThreeTest() {
        String input = "303";
        assertTrue(controller.compute(input).equals(FOO+FOO+"*"+FOO));
    }

    @Test
    void inputAsTenThousandsHundredAndOneTest() {
        String input = "10101";
        assertTrue(controller.compute(input).equals(FOO+QIX+"**"));
    }
}