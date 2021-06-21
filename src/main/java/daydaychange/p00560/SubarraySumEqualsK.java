package daydaychange.p00560;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int remain = k - nums[i];
            if (remain == 0) {
                ans ++;
            }
            for (int j = i + 1; j < len; j ++) {
                remain = remain - nums[j];
                if (remain == 0) {
                    ans ++;
                }
            }
        }
        return ans;
    }

}
