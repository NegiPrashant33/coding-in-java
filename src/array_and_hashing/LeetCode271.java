package array_and_hashing;
import java.util.*;

// Encode Decode

public class LeetCode271 {
    public static void main(String[] args) {
        List<String> strs = List.of("we","say",":","yes");
        String encodedString = encode(strs);
        System.out.println(strs);

        List<String> decodedString = decode(encodedString);
        System.out.println(decodedString);

    }

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs)
            sb.append(str.length()).append("#").append(str);

        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            int len = 0;
            if(Character.isDigit(str.charAt(i)))
                len = Character.getNumericValue(str.charAt(i));


            String word = str.substring(i + 2, i + 2 + len);
            result.add(word);

            i += len + 1;
        }

        return result;
    }
}
