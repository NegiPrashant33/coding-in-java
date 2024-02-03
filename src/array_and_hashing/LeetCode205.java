package array_and_hashing;
import java.util.*;

// Isomorphic Strings https://leetcode.com/problems/isomorphic-strings/description/
public class LeetCode205 {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";

        if(Method(s, t))
             System.out.println("Strings are Isomorphic");
        else
            System.out.println("Strings are not Isomorphic");
    }
    
    static boolean Method(String s, String t) {
        if(s.length() != t.length())
            return false;

        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!map.containsKey(original)) {
                if(!map.containsValue(replacement)) {
                    map.put(original, replacement);
                }
                else
                    return false;
            }
            else {
                char mappedCharacter = map.get(original);
                if(mappedCharacter != replacement)
                    return false;
            }
        }

        return true;
    }
}
