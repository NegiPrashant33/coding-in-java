package array.and.hashing;

// Length of Last Word https://leetcode.com/problems/length-of-last-word/description/
public class LeetCode58 {
    public static void main(String[] args) {
        String s = "  fly me  to the   moon  ";
        System.out.println(Method1(s));
    }

    static int Method1(String s) {
        int track = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                track = i;
                break;
            }
        }

        String result = s.substring(track).trim();
        return result.length();
    }

    static int Method2(String s) {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
            }
            else {
                if(count > 0)
                    return count;
            }
        }

        return count;
    }
}
