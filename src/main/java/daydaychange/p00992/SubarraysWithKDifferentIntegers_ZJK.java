package daydaychange.p00992;

/**
 * @author ZhangJk
 * @version 1.0
 * @date 2020/5/15 9:54 AM
 */
public class SubarraysWithKDifferentIntegers_ZJK {


     public int test(int[] A, int K) {
         int res = 0, prefix = 0;
         int[] m = new int[A.length + 1];
         for (int i = 0, j = 0, cnt = 0; i < A.length; ++i) {
             if (m[A[i]]++ == 0) cnt++;
             while (cnt > K) {
                 m[A[j++]]--;
                 cnt--;
                 prefix = 0;
             }
             while (m[A[j]] > 1) {
                 prefix++;
                 m[A[j++]]--;
             }
             if (cnt == K) res += prefix + 1;
         }
         return res;
     }

    /**
     * Time Limit Exceeded
     */
    public int subarraysWithKDistinct(int[] A, int K) {
        int len = A.length;
        int[] subArray = new int[len + 1];
        int ans = 0;
        int marked = K;
        for (int i = 0, left = 0; i < len; ) {
            while (marked > 0 && i < len) {
                int elem = A[i];
                int val = subArray[elem];
                if (val == 0) {
                    marked --;
                }
                if (marked == 0) {
                    ans ++;
                }
                subArray[elem] ++;
                i ++;
            }

            for (int j = i; j < len; j ++) {
                int elem = A[j];
                int val = subArray[elem];
                if (val > 0) {
                    subArray[elem] ++;
                    ans ++;
                } else if (j >= i) {
                    while (j > i) {
                        elem = A[j - 1];
                        subArray[elem] --;
                        j --;
                    }
                    break;
                }
            }

            // 从左往右删除， 如果marked还是0， 则 ans ++
            while (left < i) {
                int elem = A[left];
                int val = subArray[elem];
                left ++;
                subArray[elem] --;
                if (val == 1) {
                    marked ++;
                    break;
                } else {
                    ans ++;
                }
            }
        }
        return ans;
    }


}
