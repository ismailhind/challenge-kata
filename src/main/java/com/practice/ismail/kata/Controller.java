package com.practice.ismail.kata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static com.practice.ismail.kata.KataConstants.*;

public class Controller {

    Logger LOGGER = LoggerFactory.getLogger(Controller.class);
    final private List<String> listDividers = Arrays.asList(THREE, FIVE, SEVEN);
    final private List<String> listContainersChars = Arrays.asList(THREE, FIVE, SEVEN, ZERO);


    String compute(String input) {
        String output = "";
        Pattern pattern = Pattern.compile("(3|5|7)");
        Matcher matcher = pattern.matcher(input);
        try {
            //LOGGER.debug("input is a valid number: "+input);
            output += addListDividersToOutput(input, listDividers);

            if ( !matcher.find() && output.isEmpty()) {
                //LOGGER.info("input is not divisible by list of dividers neither contains one of them: "+input);
                output = input.replaceAll(ZERO,WILDCARD);
            }
            else {
                char[] inputAsChars = input.toCharArray();
                for (char inputAsChar : inputAsChars) {
                    for (String divider : listContainersChars) {
                        output += addIfContainingDividerToOutput(""+inputAsChar, divider);
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("input = "+input+" is not a valid number");
        }

        return output;
    }

    private String addListDividersToOutput(String input, List<String> listDividers) {
        String output = "";
        for (String divider : listDividers) {
            output += addDividerToOutput(input, divider);
        }
        return output;
    }

    public String addDividerToOutput(String input, String divider) {
        Divider targetOperation = DividersFactory
                .getDivider(divider)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Divider"));
        return targetOperation.divideBy(input);
    }

    public String addIfContainingDividerToOutput(String input, String containerChar) {
        ContainedChar targetOperation = ContainerCharsFactory
                .getContainerChar(containerChar)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Char"));
        return targetOperation.contains(input);
    }
}
