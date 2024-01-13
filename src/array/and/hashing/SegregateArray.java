package array.and.hashing;

import java.util.Arrays;

public class SegregateArray {
    public static void main(String[] args) {
        // Example array with negative numbers
        int[] nums1 = {5, -2, 9, -1, 3, -6, 7, -4};
        int[] nums2 = {5, -2, 9, -1, 3, -6, 7, -4};

        moveNegativesToFront(nums1);
        moveNegativesToEnd(nums2);

        // Printing the modified array
        System.out.println("Array with negative numbers moved to the front: "
                + Arrays.toString(nums1));
        System.out.println("Array with negative numbers moved to the end: "
                + Arrays.toString(nums2));
    }

    private static void moveNegativesToFront(int[] array) {
        int left = 0;
        int right = 0;

        while (right < array.length) {
            if (array[right] < 0) {
                // Swap negative value with the first occurrence of non-negative value
                int temp = array[left];
                array[left++] = array[right];
                array[right] = temp;
            }

            // Move right pointer
            right++;
        }
    }

    private static void moveNegativesToEnd(int[] array) {
        int left = 0;
        int right = 0;

        while (right < array.length) {
            if (array[right] >= 0) {
                // Swap non-negative value with the first occurrence of negative value
                int temp = array[left];
                array[left++] = array[right];
                array[right] = temp;
            }

            // Move right pointer
            right++;
        }
    }
}
