package daydaychange.p00013;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nate guo
 * @version 1.0
 * @date 2020/4/13 2:15 PM
 */
public class RomanToInteger {

    private static final Map<Character, Integer> labelMap;

    static {
        labelMap = new HashMap<>();
        labelMap.put('I', 1);
        labelMap.put('V', 5);
        labelMap.put('X', 10);
        labelMap.put('L', 50);
        labelMap.put('C', 100);
        labelMap.put('D', 500);
        labelMap.put('M', 1000);

    }

    public int romanToInt(String s) {
        int last = s.length() - 1;
        char pre = s.charAt(last);
        int res = labelMap.get(pre);
        for (int i = last - 1; i >= 0; i--) {
            char cur = s.charAt(i);
            if (cur == 'I' && (pre == 'V' || pre == 'X')) {
                res -= labelMap.get(cur);
            } else if (cur == 'X' && (pre == 'L' || pre == 'C')) {
                res -= labelMap.get(cur);
            } else if (cur == 'C' && (pre == 'D' || pre == 'M')) {
                res -= labelMap.get(cur);
            } else {
                res += labelMap.get(cur);
            }
            pre = cur;
        }

        return res;
    }
}
