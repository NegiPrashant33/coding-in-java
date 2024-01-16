package array.and.hashing;

// Longest Common Prefix https://leetcode.com/problems/longest-common-prefix/description/
public class LeetCode14 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(Method(strs));
    }

    static String Method(String[] strs) {
        if(strs.length == 0)
            return "";

        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
