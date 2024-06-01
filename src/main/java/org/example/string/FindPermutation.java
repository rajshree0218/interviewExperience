package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = permutations(str);
        System.out.println(Arrays.toString(permutations.toArray()));
    }

    private static List<String> permutations(String str){
        if(str==null) return null;

        final List<String> list = new ArrayList<>();
        if(str.length()<2) {
            list.add(str);
            return list;
        }

        final List<String> permutations = permutations(str.substring(1));
        for(final String permutation: permutations){
            for(int i=0; i<=permutation.length();i++){
                String newPermutation = permutation.substring(0,i)
                        + str.charAt(i)
                        + permutation.substring(i);
                list.add(newPermutation);
            }
        }
        return list;
    }
}

