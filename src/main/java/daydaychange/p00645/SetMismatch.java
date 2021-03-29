package daydaychange.p00645;

public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        boolean[] t = new boolean[nums.length];
        int dup = -1;
        for (int num : nums) {
            if (t[num - 1]) {
                dup = num;
            } else {
                t[num - 1] = true;
            }
        }
        int s = -1;
        for (int i = 0; i < nums.length; i++) {
            if (!t[i]) {
                s = i + 1;
            }
        }
        return new int[]{dup, s};
    }

}
