package daydaychange.p00078;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> r = subsets(nums);
        System.out.println(r);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;
        helper(res, new LinkedList<>(), nums, 0);
        return res;
    }

    private static void helper(List<List<Integer>> ans, LinkedList<Integer> res, int[] nums, int start) {
        List<Integer> r = new ArrayList<>(res);
        ans.add(r);
        for (int i = start; i < nums.length; i++) {
            res.add(nums[i]);
            helper(ans, res, nums, i + 1);
            res.removeLast();
        }
    }

}
