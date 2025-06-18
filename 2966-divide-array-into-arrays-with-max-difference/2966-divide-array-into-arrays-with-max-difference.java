import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n / 3][3];
        
        for (int i = 0, idx = 0; i < n; i += 3, idx++) {
            int a = nums[i], b = nums[i + 1], c = nums[i + 2];
            if (c - a > k) return new int[0][];
            result[idx][0] = a;
            result[idx][1] = b;
            result[idx][2] = c;
        }
        
        return result;
    }
}
