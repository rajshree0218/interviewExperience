package org.example.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {


        List<String> list3 = Arrays.asList("a", "b", "c", "def", "g", "h");
        List<String> list1 = Arrays.asList("a", "b", "c", "acb", "g", "h");//h, g, bca, c, b, a
        List<String> ls = list1.stream().map(obj->{
            int left = 0;
            int right = obj.length()-1;
            char[] ch = obj.toCharArray();
            while(left<right){
                char temp = ch[left];
                ch[left] =  ch[right];
                ch[right] = temp;
                right--;
                left++;
            }
            return String.valueOf(ch);// a, b, c, fed, g, h
        }).collect(Collectors.toList());
        for(int i=ls.size()-1;i>=0;i--) {
            System.out.print(ls.get(i)+", ");
        }
        System.out.println();
        System.out.println(ls);


        List<String> ab = list3.stream().map(obj -> {
            if(obj.length()>1){
                char[] chars = obj.toCharArray();
                int length = chars.length;
                for(int i=0; i<length/2;i++){
                    char temp = chars[i];
                    chars[i]  =  chars[length-1-i];
                    chars[length-1-i] = temp;
                }
                return new String(chars);
            }
            return obj;
        }).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(ab);

//        Collections.sort(list3, (s1, s2)->Integer.compare(list3.indexOf(s1), list3.indexOf(s2)));
        List<String> news = list3.stream().sorted((s1,s2)->Integer.compare(list3.indexOf(s2), list3.indexOf(s1)))
                .collect(Collectors.toList());
        System.out.println(news);




        String originalString = "code";
        String reverseString = reverseString(originalString);
        System.out.println("code : original String : "+originalString);
        System.out.println("edoc : reversed String : "+reverseString);

        String reverse = Stream.of(originalString)
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining());
        System.out.println("using stream.of method "+reverse);

        //another way
        String s = originalString.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a2, b2) -> b2 + a2);
        System.out.println(s );

    }

    private static String reverseString(String originalString) {

        char[] charArray = originalString.toCharArray();
        return IntStream.range(0, originalString.length())
                .mapToObj(i -> charArray[originalString.length() - i - 1]) // mapToObj() to get each character starting from the end.
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
