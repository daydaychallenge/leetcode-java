package daydaychange.daily;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/9 3:42 PM
 */
public class RotatedDigits {

    /**
     * 时间复杂度O(nlogn)
     *
     * @param N
     * @return
     */
    public int rotatedDigits(int N) {
        if (N <= 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isValidNumber(i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValidNumber(int number) {
        int src = number, rotated = 0, loop = 1;
        while (number > 0) {
            int d = number % 10;
            int rd = getRotatedDigit(d);
            if (rd < 0) {
                return false;
            }
            rotated = rotated + rd * loop;
            loop = loop * 10;
            number = number / 10;
        }
        return src != rotated;
    }

    private int getRotatedDigit(int num) {
        switch (num) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 5;
            case 5:
                return 2;
            case 6:
                return 9;
            case 8:
                return 8;
            case 9:
                return 6;
            default:
                return -1;
        }
    }
}
