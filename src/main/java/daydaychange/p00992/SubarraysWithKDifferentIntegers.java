package daydaychange.p00992;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/7 2:43 PM
 */
public class SubarraysWithKDifferentIntegers {

    /**
     * 仅(exactly)包含K个不同数字的子数组的个数
     */
    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostK(A, K) - atMostK(A, K - 1);
    }

    public int atMostK(int[] A, int K) {
        int n = A.length;
        int total = 0;
        int l = 0, r = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (l < n) {
            while (r < n) {
                if (map.size() == K && !map.containsKey(A[r])) {
                    break;
                } else {
                    updateMap(map, A[r], 1);
                }

                r++;
            }

            System.out.println("total:" + total);
            System.out.println("l: " + l + " r:" + r + " inc:" + (r - l - 1));

            total += (r - l - 1);

            updateMap(map, A[l], -1);
            l++;
        }

        System.out.println("total atMostK:" + total);
        return total;
    }

    private void updateMap(Map<Integer, Integer> map, Integer key, Integer valueInc) {
        Integer count = map.getOrDefault(key, 0);
        map.put(key, count + valueInc);
        if (map.get(key) == 0) {
            map.remove(key);
        }

    }
}
