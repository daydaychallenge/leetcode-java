package daydaychange.p00525;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length - maxLen; i ++) {
            int count = 0;
            if (nums[i] == 0) count = -1; else count = 1;
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[j] == 0) {
                    count -= 1;
                } else count += 1;

                if (count == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public int findMaxLength1(int[] nums) {
        int maxLen = 0;
        int count = 0;
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(0, -1);
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 0) count += -1; else count += 1;

            Integer c = memo.get(count);
            if (Objects.isNull(c)) {
                memo.put(count, i);
            } else {
                maxLen = Math.max(maxLen, i - c);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

        ContiguousArray contiguousArray = new ContiguousArray();
        contiguousArray.findMaxLength(new int[]{0, 1});

    }

}
