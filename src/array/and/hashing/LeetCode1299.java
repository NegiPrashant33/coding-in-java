package array.and.hashing;

// Replace Elements with Greatest Element on Right Side, https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
/*

    Different approaches to solve this problem

    1. Brute Force approach O(n^2)
    2. Reverse Traversal O(n)

*/
public class LeetCode1299 {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        for(int num : Method2(arr)) {
            System.out.print(num + " ");
        }
    }

    static int[] Method1(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int max = 0;
            for(int j = i + 1; j < arr.length; j++) {
                if(max < arr[j]) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length - 1] = -1;

        return arr;
    }

    static int[] Method2(int[] arr) {
        int rightMax = -1;
        for(int i = arr.length - 1; i >= 0; i --) {
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }

        return arr;
    }
}
