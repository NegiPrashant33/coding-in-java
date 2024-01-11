package array.and.hashing;
import java.util.*;

// Pascal's Triangle https://leetcode.com/problems/pascals-triangle/description/
public class LeetCode118 {
    public static void main(String[] args) {
        int numRows = 5;

        List<List<Integer>> result = Method(numRows);
        System.out.println(result);
    }

    static List<List<Integer>> Method(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1) return result;

        for(int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);

            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 0; j < i - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            row.add(1);

            result.add(row);
        }

        return result;
    }
}
