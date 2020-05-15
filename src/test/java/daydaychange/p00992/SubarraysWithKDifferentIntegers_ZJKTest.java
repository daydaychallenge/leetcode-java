package daydaychange.p00992;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/5/7 3:15 PM
 */
class SubarraysWithKDifferentIntegers_ZJKTest {

    SubarraysWithKDifferentIntegers_ZJK solution = new SubarraysWithKDifferentIntegers_ZJK();

    @Test
    void subarraysWithKDistinctCase1() {
        int[] arr = {1, 2, 1, 2, 3};
        assertEquals(7, solution.subarraysWithKDistinct(arr, 2));
    }

    @Test
    void subarraysWithKDistinctCase2() {
        int[] arr = {1, 2, 1, 3, 4};
        assertEquals(3, solution.subarraysWithKDistinct(arr, 3));
    }

    @Test
    void subarraysWithKDistinctCase3() {
        int[] arr = {1, 2};
        assertEquals(2, solution.subarraysWithKDistinct(arr, 1));
    }

    @Test
    void subarraysWithKDistinctCase4() {
        int[] arr = {2,1,1,1,2};
        assertEquals(8, solution.subarraysWithKDistinct(arr, 1));
    }

}