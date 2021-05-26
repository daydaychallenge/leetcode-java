package daydaychange.p00581;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

    public static void main(String[] args) {
        ShortestUnsortedContinuousSubarray s = new ShortestUnsortedContinuousSubarray();

        int a = s.findUnsortedSubarray(new int[]{2,6,4,8,10,9,15});
        System.out.printf(a + "");


    }

    public int findUnsortedSubarray(int[] nums) {
        int[] copyed = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyed);
        int start = 0, end = 0, equal = 0;
        boolean hasStart = false;
        for (int i = 0; i < nums.length; i ++) {
            int c = copyed[i];
            int n = nums[i];
            if (c != n) {
                if (!hasStart) {
                    hasStart = true;
                    start = i;
                }
                end = i;
            }
        }
        return end == 0 ? 0 : end - start + 1;
    }

    public int findUnsortedSubarray1MS(int[] A) {
        int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n-1-i]);
            if (A[i] < max) end = i;
            if (A[n-1-i] > min) beg = n-1-i;
        }
        return end - beg + 1;
    }

}
