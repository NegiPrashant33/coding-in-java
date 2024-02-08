package array_and_hashing;
import java.util.*;

// Maximum number of balloons       https://leetcode.com/problems/maximum-number-of-balloons/description/

public class LeetCode1189 {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(Method2(text));
    }

    private static int Method1(String text) {
        String str = "balloon";
        Map<Character, Integer> balloonCount = new HashMap<>();
        for(char word : str.toCharArray())
            balloonCount.put(word, balloonCount.getOrDefault(word, 0) + 1);

        Map<Character, Integer> charCount = new HashMap<>();
        for(char word : text.toCharArray())
            charCount.put(word, charCount.getOrDefault(word, 0) + 1);

        int instances = Integer.MAX_VALUE;
        for(Map.Entry<Character, Integer> entry : balloonCount.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (!charCount.containsKey(ch)) {
                return 0;
            }

            instances = Math.min(instances, charCount.get(ch) / count);
        }

        return instances;
    }

    private static int Method2(String text) {
        int[] balloonCount = new int[26];
        for(int i = 0; i < text.length(); i++)
            balloonCount[text.charAt(i) - 'a']++;

		/*

		int min = balloonCount[1]; // b
		min = Math.min(min, balloonCount[0]); // a
		min = Math.min(min, balloonCount[11] / 2); // l
 		min = Math.min(min, balloonCount[14] / 2); // o
		min = Math.min(min, balloonCount[13]); // n

		*/

        String str = "balon";
        int min = Integer.MAX_VALUE;
        for(char ch : str.toCharArray()) {
            if(ch == 'l' || ch == 'o')
                min = Math.min(min, balloonCount[ch - 'a'] / 2);
            else
                min = Math.min(min, balloonCount[ch - 'a']);
        }
        return min;
    }
}
