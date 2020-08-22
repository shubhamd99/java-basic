package com.scope;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

    public static void main(String[] args) {
        String pattern="[a-z]+";
        String stringToCheck = "Happy Learning!";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(stringToCheck);

        while (matcher.find()) {
            System.out.println(stringToCheck.substring(matcher.start(), matcher.end())); // appy // earning
        }
    }
}
