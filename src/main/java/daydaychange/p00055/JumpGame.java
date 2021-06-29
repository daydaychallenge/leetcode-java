package daydaychange.p00055;

public class JumpGame {

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();

        System.out.println(jumpGame.canJump(new int[]{2, 0, 0}));

    }

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return true;
        int len = nums.length;
        int curr = nums[0];
        if (curr == 0) return false;
        for (int i = 1; i < len; i++) {
            if (nums[i] < curr - 1) {
                curr -= 1;
            } else if (nums[i] == 0 && curr == 1 && i != len - 1) {
                return false;
            } else if ( nums[i] >= curr - 1) {
                curr = nums[i];
            }
        }
        return true;
    }

}
