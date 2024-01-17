package array.and.hashing;

// Is Subsequence https://leetcode.com/problems/is-subsequence/description/392
public class LeetCode392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        boolean result = Method(s, t);
        if(result)
            System.out.println("Is Subsequence");
        else
            System.out.println("Is not Subsequence");
    }

    static boolean Method(String s, String t) {

        if(s.length() > t.length())
            return false;

        int i = 0, j = 0;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                 i++;
                 j++;
            }
            else
                 j++;
        }

        if(i == s.length())
            return true;

        return false;
    }
}
