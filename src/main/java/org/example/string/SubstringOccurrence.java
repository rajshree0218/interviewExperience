package org.example.string;

public class SubstringOccurrence {
    public static void main(String[] args) {
        String input = "Java is a widely used programming language. Java is versatile.";
        String substring = "Java";
        int count = 0;
        int index = 0;
        while((index = input.indexOf(substring, index)) != -1){
            count++;
            index += substring.length();
        }
        System.out.println("Number of occurrences of "+substring +" : "+count);
    }
}
