package com.wartsila.camelcase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class CamelCase {

    static String toCamelCase(String s){

        char[] chars = s.toCharArray();

        boolean toUppercase = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {

            char aChar = chars[i];
            if(aChar == '-' || aChar == '_') {
                toUppercase = true;
            }
            else {
                stringBuilder.append(toUppercase ? Character.toUpperCase(aChar) : aChar);
                toUppercase = false;
            }
        }
        return stringBuilder.toString();
    }

    static String toCamelCaseUsingRegex(String s) {

        String[] split = s.split("[_\\-]+");

        List<String> toBeJoined = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String str = split[i];
            String r = str;
            if(i>0)
                r = str.substring(0, 1).toUpperCase() + str.substring(1);
            toBeJoined.add(r);

        }
        return toBeJoined.stream().collect(Collectors.joining());
    }
}