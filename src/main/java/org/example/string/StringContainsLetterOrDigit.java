package org.example.string;

public class StringContainsLetterOrDigit {
    public static void main(String[] args) {
        CharSequence cs = "asd456";
        boolean isDigitOrLetter = isAlphanumeric(cs);
        System.out.println(isDigitOrLetter);
    }

    private static boolean isAlphanumeric(CharSequence cs) {
        if(cs == null || cs.length() == 0)
            return false;
        final int sz = cs.length();
        for(int i=0; i<sz; i++){
            if(!Character.isLetterOrDigit(cs.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
