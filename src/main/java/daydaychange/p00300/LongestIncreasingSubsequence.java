package daydaychange.p00300;

import java.nio.IntBuffer;

public class LongestIncreasingSubsequence {


    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};

        System.out.println(lengthOfLIS1(nums));;

    }

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }

    public static int lengthOfLIS1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] tails = new int[nums.length];
        int size = 1;
        tails[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < tails[0]) {
                tails[0] = nums[i];
            } else if (nums[i] > tails[size - 1]) {
                tails[size++] = nums[i];
            } else {
                int r = size;
                int l = -1;
                while (r - l > 1) {
                    int m = l + (r - l) / 2;
                    if (tails[m] >= nums[i])
                        r = m;
                    else
                        l = m;
                }
                tails[r] = nums[i];
            }
        }

//        for (int x: nums) {
//            int i = 0, j = size;
//            while (i != j) {
//                int m = (i + j) / 2;
//                if (tails[m] < x) {
//                    i = m + 1;
//                } else j = m;
//            }
//            tails[i] = x;
//            if (i == size) ++size;
//        }
        return size;
    }


}
