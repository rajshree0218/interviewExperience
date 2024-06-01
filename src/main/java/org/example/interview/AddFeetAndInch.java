package org.example.interview;

import java.util.stream.Stream;

public class AddFeetAndInch {
    public static void main(String[] args) {
        int feet1 = 6;
        int inches1 = 11;

        int feet2 = 4;
        int inches2 = 7;

        // Convert feet and inches to inches
        int totalInches1 = feet1 * 12 + inches1;
        int totalInches2 = feet2 * 12 + inches2;

        // Add the lengths without Java8
        int totalInches = totalInches1 + totalInches2;

        // in java8
        // Convert feet and inches to inches and sum them using streams
        int totalInchesJava8 = Stream.of(feet1 * 12 + inches1, feet2 * 12 + inches2)
                .reduce(0, Integer::sum);

        // Calculate the resulting feet and inches
        int resultFeet = totalInches / 12;
        int resultInches = totalInches % 12;

        // Print the result
        System.out.println("Total length: " + resultFeet + "'" + resultInches + "\"");
    }
}

