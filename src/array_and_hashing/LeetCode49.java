package array_and_hashing;
import java.util.*;

// Group anagrams https://leetcode.com/problems/group-anagrams/description/

public class LeetCode49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat"," bat"};

        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] chars =  word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!map.containsKey(sortedWord))
                map.put(sortedWord, new ArrayList<>());

            map.get(sortedWord).add(word);
        }


        return new ArrayList<>(map.values());
    }
}
