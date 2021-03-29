package daydaychange.p00287;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        boolean[] t = new boolean[nums.length];
        for (int num : nums) {
            if (t[num - 1]) {
                return num;
            } else {
                t[num - 1] = true;
            }
        }
        return -1;
    }
}
