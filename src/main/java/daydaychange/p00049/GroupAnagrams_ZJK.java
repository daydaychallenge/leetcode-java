package daydaychange.p00049;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams_ZJK {

    private int[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53, 59, 61, 67,
            71, 73, 79, 83, 89, 97, 101};

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        if (strs == null || strs.length == 0) return ans;

        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String ele = strs[i];
            int hash = 1;
            for (int j = 0; j < ele.length(); j ++) {
                hash *= primes[ele.charAt(j) - 'a'];
            }
            List<String> r = map.get(hash);
            if (r == null) {
                r = new ArrayList<>();
                map.put(hash, r);
                ans.add(r);
            }
            r.add(ele);
        }
        return ans;
    }

}
