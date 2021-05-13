package daydaychange.p00078;

import java.util.ArrayList;
import java.util.List;

public class Subsets1 {

    public static void main(String[] args) {
        Subsets1 s = new Subsets1();
        List<List<Integer>> ans = s.subsets(new int[]{1, 2, 3});
        System.out.println(ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, ans, new ArrayList<>(), 0);
        return ans;
    }

    private void helper(int[] nums, List<List<Integer>> ans, List<Integer> curr, int start) {
        if (start > nums.length) return;
        ans.add(new ArrayList<>(curr));
        for (int i = start; i < nums.length; i ++) {
            curr.add(nums[i]);
            helper(nums, ans, curr, i + 1);
            curr.remove(curr.size() - 1);
        }
    }

}
