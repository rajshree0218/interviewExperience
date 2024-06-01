package org.example.string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDupCharInString {
    public static void main(String[] args) {
        String input = "rajshreesoni";
        //in java 8
        Map<Character, Long> result = input.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        result.forEach((k,v)-> {
            if(v>1)
                System.out.println(k+"-"+v);
        });

        // without java 8
        Map<Character, Integer> countDupMap = new HashMap<>();
        char[] charArray = input.toCharArray();
        for(char c : charArray){
            if(countDupMap.containsKey(c)){
                countDupMap.put(c, countDupMap.get(c)+1);
            } else {
                countDupMap.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : countDupMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
