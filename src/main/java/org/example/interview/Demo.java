package org.example.interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {


    //
    public void printtt(){
        // make steady string
        // i/p: "HBBBUBBB"
        // o/p: 5

        // BBBUB -> replace with this- UUDDH
        // HUUDDHBB
        // 1< size of the array <=100

        String input = "HBBBUBBB";



    }



    public void segregateArray(){
        //        1. Write a program to generate following output on the basis of following input
//        Input:
//[11,1000,1004,1275,10005,10177,10240,10641,10903,11495,11628,15629,
//                18630,21631,21680,23745,24827,28828,33955,44087,48755,50073]
//        Output:
//[[11],[1000,1004,1275],[10005,10177,10240],[10641,10903]...............]
//*Note: Each sub array should have elements like as
//        1st array should contain element less than 500, next array should contain elements falling under 500 to 1000 and so on.


        int[] arr = {11,500,950,1000,1004,1275,10005,10177,10240,10641,10903,11495,11628,15629,
                18630,21631,21680,23745,24827,28828,33955,44087,48755,50073};

        List<List<Integer>> subarrays = createSubarrays(arr);
        System.out.println(subarrays);
        System.out.println("--------------------------");
        // Print the sub arrays
        for (int i = 0; i < subarrays.size(); i++) {
            System.out.print("Sub array " + (i + 1) + ": " + subarrays.get(i));
        }
    }

    public static List<List<Integer>> createSubarrays(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> subarrays = new ArrayList<>();
        List<Integer> currentSubarray = new ArrayList<>();
        int threshold = 500;

        for (int num : arr) {
            if (num <= threshold) {
                currentSubarray.add(num);
            } else {
                subarrays.add(currentSubarray);
                currentSubarray = new ArrayList<>();
                currentSubarray.add(num);
                threshold += 500;
            }
        }

        // Append the last subarray
        subarrays.add(currentSubarray);

        return subarrays;
    }

    public static void main(String[] args) {

//        String a = null;
//        if(a.equals("fsdf")) // it will throw NPE bug, cannot invoke because a is null.
//            System.out.println("In If");
//        else if(a.equals("null"))
//            System.out.println("In else");
        maxIntValueFromStringArray();
        System.out.println(":: "+printCompress()+" :: "+printDecompress());
        print();
    }

    public static void print(){
        String[] strings = {"rajshree","jay","rajshree","aman","ajay","aman"};
        Set<String> set = new HashSet<>();
        Set<String> unique = Arrays.stream(strings).filter(set::add).collect(Collectors.toSet());
        System.out.println(":: "+unique);
        Map<String, Long> map = Arrays.stream(strings).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<String> duplicates = map.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
//        map.forEach((k,v)->System.out.println(k+" : "+v));

        System.out.println(duplicates);

        String[] arr = {};
        Map<String, Long> map1 = Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map1.entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());

    }

    public static String printCompress(){
        String str = "abc3de2f4";
        StringBuilder result = new StringBuilder();

        int[] j = {0}; // Using an array to act as a mutable variable
        str.chars().forEach(c -> {
            char currentChar = (char) c;
            if (Character.isDigit(currentChar)) {
                int repeatCount = Character.getNumericValue(currentChar);
                String previousChar = str.substring(j[0], str.indexOf(currentChar, j[0]));
                for (int i = 0; i < repeatCount; i++) {
                    result.append(previousChar);
                }
                j[0] = str.indexOf(currentChar, j[0]) + 1; // Update j to the index of the next character
            }
        });
        return result.toString();
    }

    // not working
    public static String printDecompress(){
        String str = "abcabcabcdedeffff";
        StringBuilder result = new StringBuilder();
        str.chars()
                .mapToObj(c -> (char) c)
                .reduce((prevChar, currentChar) -> {
                    if (prevChar == currentChar) {
                        return prevChar;
                    } else {
                        int count = (int) str.chars().filter(ch -> ch == prevChar).count();
                        result.append(prevChar);
                        if (count > 1) {
                            result.append(count);
                        }
                        return currentChar;
                    }
                }).ifPresent(lastChar -> {
                    int count = (int) str.chars().filter(ch -> ch == lastChar).count();
                    result.append(lastChar);
                    if (count > 1) {
                        result.append(count);
                    }
                });
        return result.toString();
    }

    public static void maxIntValueFromStringArray(){
        String[] arr = {"30","10","60","89","0","9","98"};
        Set<String> set = new HashSet<>(arr.length);
        set.addAll(Arrays.asList(arr));
        String max = Collections.max(set);
        String min = Collections.min(set);
        System.out.println(min +" :: "+ max);

        String maxNumber = Arrays.stream(arr)
                .sorted((s1,s2)-> (s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());
        System.out.println(maxNumber);
    }

    public static void reverseString(){
        String str = "code";
        String value = Stream.of(str)
                .map(s-> new StringBuilder(s).reverse())
                .collect(Collectors.joining());

        char[] chars = str.toCharArray();
        IntStream.range(0, str.length())
                .map(i-> chars[str.length()-i-1])
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

        str.chars().mapToObj(c-> (char) c)
                .reduce("", (a,b)-> b+a, (a1,b1)-> b1+a1);
    }
}