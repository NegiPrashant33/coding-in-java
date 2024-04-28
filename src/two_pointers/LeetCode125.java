package two_pointers;
import java.util.*;

// Valid Palindrome     https://leetcode.com/problems/valid-palindrome/description/
public class LeetCode125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;

        while(start <= end){
            char currStart = s.charAt(start);
            char currEnd = s.charAt(end);

            if(!Character.isLetterOrDigit(currStart))
                start++;
            else if(!Character.isLetterOrDigit(currEnd))
                end--;
            else {
                if(Character.toLowerCase(currStart) != Character.toLowerCase(currEnd))
                    return false;

                start++;
                end--;
            }
        }

        return true;
    }
}
