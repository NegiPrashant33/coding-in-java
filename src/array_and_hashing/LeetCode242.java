package array_and_hashing;
import java.util.*;

// Valid anagram, https://leetcode.com/problems/valid-anagram/
/*
    Anagram
    1. If we sort two strings that are said to be anagram then both of them will turn out to be same
    2. The frequency of each alphabet in both the strings will be same
    3. We can rearrange the alphabets of one string to match with another string

    Different approaches to solve this problem

    1. Brute force approach ( Sorting )
    2. Hash Table using HashMap
    3. Hash Table using Array

*/
public class LeetCode242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = Method3(s, t);

        if(result)
            System.out.println("Is Anagram");
        else
            System.out.println("Is not an Anagram");
    }

    static boolean Method1(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    static boolean Method2(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();

        for(char x : s.toCharArray())
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        for(char x : t.toCharArray())
            freq.put(x, freq.getOrDefault(x, 0) - 1);

        for(int val : freq.values()) {
            if(val != 0)
                return false;
        }

        return true;
    }

    static boolean Method3(String s, String t) {
        int[] count = new int[26];

        for(char x : s.toCharArray())
            count[x - 'a']++;

        for(char x : t.toCharArray())
            count[x - 'a']--;

        for(int val : count) {
            if(val != 0)
                return false;
        }

        return true;
    }
}
