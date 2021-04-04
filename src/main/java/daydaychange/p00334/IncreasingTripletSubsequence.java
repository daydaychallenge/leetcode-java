package daydaychange.p00334;

public class IncreasingTripletSubsequence {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 0, 0, -1, 0, 0, 10};
        boolean b = increasingTriplet(nums);
        System.out.println(b);
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int smallest = nums[0];
        int middle = 0;
        boolean middleFlag = true;
        for (int i = 1; i < nums.length; i ++) {
            if (smallest >= nums[i]) smallest = nums[i];
            else if (middleFlag || nums[i] <= middle) {
                middle = nums[i];
                middleFlag = false;
            }
            else {
                return true;
            }
        }
        return false;

    }
}
