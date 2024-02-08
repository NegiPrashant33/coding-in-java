package array_and_hashing;
import java.util.*;

// Word pattern     https://leetcode.com/problems/word-pattern/
/*
    One to one mapping from both sides.
*/
public class LeetCode290 {
    public static void main(String[] args) {
        String  pattern = "abba", s = "dog cat cat dog";
        System.out.println(Method(pattern, s));
    }

    private static boolean Method(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");

        if(str.length != pattern.length())
            return false;

        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch))
                if(!map.containsValue(str[i]))
                    map.put(ch, str[i]);
                else
                    return false;
            else {
                String mappedString = map.get(ch);
                if(!mappedString.equals(str[i]))
                    return false;
            }
        }

        return true;
    }
}
