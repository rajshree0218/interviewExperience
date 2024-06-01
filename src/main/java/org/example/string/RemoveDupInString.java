package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupInString {
    public static void main(String[] args) {
        String str = "Java is a programming language and Java is widely used in the software industry.";

        String[] arr = str.split("\\s+");
        Set<String> uniqueWord = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String word : arr){
            if(uniqueWord.add(word)){
                sb.append(word).append(" ");
            }
        }
        String reverse = sb.toString().trim();
        System.out.println(reverse);
    }
}
