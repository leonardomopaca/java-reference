package com.mopaca.javareference.test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int longest(String str){
        int lenMax = 0;
        int right = 0;
        int left = 0;
        Set<Character> unique = new HashSet<>();
        StringBuilder strng = new StringBuilder();

        while(right < str.length()){
            if(!unique.contains(str.charAt(right))){
                unique.add(str.charAt(right));
                lenMax = Math.max(lenMax, right - left +1);
                strng.append(str.charAt(right));
                right ++;
            }else{
                unique.remove(str.charAt(left));
                left++;
            }

        }
        return lenMax;
    }

    public static void main(String[] args) {
        String input = "ABCDEFGABEF";
        int longestLength = longest(input);
        System.out.println("Length of the longest substring without repeating characters: " + longestLength);
    }
}
