package array.and.hashing;
import java.util.*;

// Group anagrams https://leetcode.com/problems/group-anagrams/description/

public class LeetCode49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat"," bat"};

        List<List<String>> result = Method(strs);
        System.out.println(result);
    }

    static List<List<String>> Method(String[] strs) {
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
