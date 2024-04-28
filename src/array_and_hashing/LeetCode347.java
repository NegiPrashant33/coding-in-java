package array_and_hashing;
import java.util.*;

// Top K frequent elements      https://leetcode.com/problems/top-k-frequent-elements/
public class LeetCode347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent1(nums, k)));
    }

    // Sorting Map based on Value
    public static int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        List<Map.Entry<Integer, Integer>> lst = new ArrayList<>(count.entrySet());
        Collections.sort(lst, (a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for(int i = 0; i < k; i++)
            result[i] = lst.get(i).getKey();

        return result;
    }

    // Bucket Sort
    public static int[] topKFrequent2(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : nums)
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

        for(int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if(bucket[frequency] == null)
                bucket[frequency] = new ArrayList<>();

            bucket[frequency].add(key);
        }

        int[] result = new int[k];
        int counter = 0;
        for(int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if(bucket[pos] != null) {
                for(Integer integer : bucket[pos]) {
                    result[counter++] = integer;
                }
            }
        }
        return result;
    }


    //  Min Heap ( Priority Queue )
    /*
        In Java, PriorityQueue uses natural ordering (i.e., elements must be comparable) by default.
        But when you're dealing with complex objects like Map.Entry, which don't have a natural ordering,
        you need to provide a Comparator or use a lambda function to specify the sorting order explicitly.

        In java PriorityQueue acts as a Min Heap by default.
    */
    public static int[] topKFrequent3(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums)
            count.put(num, count.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            pq.offer(entry);

            if(pq.size() > k)
                pq.poll();
        }


        int[] result = new int[k];
        for(int i = k - 1; i >= 0; i--)
            result[i] = pq.poll().getKey();

        return result;
    }
}
