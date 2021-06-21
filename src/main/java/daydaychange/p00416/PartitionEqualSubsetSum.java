package daydaychange.p00416;

import java.util.HashMap;
import java.util.Map;

public class PartitionEqualSubsetSum {

    public static void main(String[] args) {
        PartitionEqualSubsetSum sum = new PartitionEqualSubsetSum();
        boolean r = sum.canPartition(new int[]{100,100,100,100,100,100,100,100});
        System.out.println(r);
    }

    private Map<Integer, Boolean> memo = new HashMap<>();

    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if ((sum & 1) != 0) return false;
        int halfSum = sum >> 1;
        return subSum(nums, halfSum, 0);
    }

    private boolean subSum(int[] nums, int sum, int index) {
        if (index >= nums.length) return false;
        if (memo.containsKey(sum)) return memo.get(sum);
        int num = nums[index];
        if (num > sum) {
            boolean r = subSum(nums, sum, index + 1);
            memo.put(sum, r);
            return r;
        }
        int remain = sum - num;
        if (remain == 0) return true;
        boolean r = subSum(nums, remain, index + 1) || subSum(nums, sum, index + 1);
        memo.put(sum, r);
        return r;
    }



    public boolean canPartition1(int[] nums) {
        int sum= 0;
        for (int i=0; i<nums.length; i++){
            sum+= nums[i];
        }
        if (sum%2!=0) return false;
        sum/=2; //target sum

        // boolean[][] dp= new boolean[nums.length+1][sum+1];
        boolean[] dp= new boolean[sum+1];

        //whether a subset of nums[0..n] for some n can give us the target sum
        return dfs(nums, sum, 0, 0, dp);

    }

    //whether a subset of nums[0..idx] can give us target
    //sum is partial sum constructed so far
    public boolean dfs(int[] nums, int target, int sum, int idx, boolean[] dp){
        if (idx>= nums.length) return false;
        if (sum+ nums[idx]== target) return true;
        //if not the target sum and haven't seen the sum before
        //include nums[idx] in dfs sum
        if (sum+ nums[idx]<= target && !dp[sum+ nums[idx]]){
            dp[sum+ nums[idx]]= true;
            if (dfs(nums, target, sum+ nums[idx], idx+1, dp)) return true;
        }
        //ignore nums[idx]
        if (dfs(nums, target, sum, idx+1, dp)) return true;

        return false;
    }


}
