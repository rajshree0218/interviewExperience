package org.example.string;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String str = "Java";
        char ch = 'a';

        String result = str.chars().filter(c-> c!=ch)
                .mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(result);
    }

    public static String removeCharacterV1(String str, char ch) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input String can't be null");
        }

        StringBuilder sb = new StringBuilder();
        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] != ch) {
                sb.append(chArray[i]);
            }
        }

        return sb.toString();
    }

    public static String removeCharacterV2(String str, char ch) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input String can't be null");
        }

        return str.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    public static String removeCharacterV3(String str, char ch) {

        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input String can't be null");
        }
        return str.chars().filter(c -> c != ch).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }


}
