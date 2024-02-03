package array.and.hashing;

// Can place flowers        https://leetcode.com/problems/can-place-flowers/description/
public class LeetCode605 {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        
        System.out.println(Method(flowerbed, n));
    }
    
    static boolean Method(int[] flowerbed, int n) {
        if(n == 0)
            return true;
        
        int len = flowerbed.length - 1;
        for(int i = 0; i < len; i++) {
            if(flowerbed[i] == 0) {
                boolean leftEmpty  =  (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

                if(leftEmpty && rightEmpty) {
                    n--;
                    flowerbed[i] = 1;

                    if(n == 0)
                        return true;
                }
            }
        }
        return false;
    }
}
