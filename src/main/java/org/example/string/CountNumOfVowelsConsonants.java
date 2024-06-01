package org.example.string;

import java.util.Locale;

public class CountNumOfVowelsConsonants {
    public static void main(String[] args) {
        String str = "Java is popular programming language";
        long vowels = 0;
        long consonants = 0;

        // in java8
        str = str.toLowerCase();
        vowels = str.chars().filter(ch -> (ch=='a'|| ch=='e'|| ch=='i' || ch=='o' ||ch=='u')).count();
        consonants = str.chars().filter(ch -> (ch!='a'&& ch!='e'&& ch!='i' && ch!='o' && ch!='u'))
                .filter(ch-> ch>='a' && ch<='z').count();

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        vowels = 0;
        consonants = 0;
        // without java8
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' ||ch=='u'){
                vowels++;
            } else if(ch>='a' && ch<='z'){
                consonants++;
            }
        }

    }
}
