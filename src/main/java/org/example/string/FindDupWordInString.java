package org.example.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupWordInString {
    public static void main(String[] args) {
        String input = "rajshree is great developer and she loves to do code. she is amazing";

        //in java8
        Map<String, Long> findDupWordMap = Arrays.stream(input.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        findDupWordMap.entrySet().stream().filter(e-> e.getValue() != 1)
                .forEach(e-> System.out.println(e.getKey()+" - "+e.getValue()));

        // without java 8
        final String[] words = input.toLowerCase().split(" ");
        Map<String, Integer> findDupMap = new HashMap<>();
        for(String word : words){
            if(findDupMap.containsKey(word)){
                findDupMap.put(word, findDupMap.get(word)+1);
            } else {
                findDupMap.put(word, 1);
            }
        }

        Set<String> set = findDupMap.keySet();
        for(String word : set){
            if(findDupMap.get(word)>1)
                System.out.println(word +" : "+findDupMap.get(word));
        }
    }
}
