package daydaychange.p00249;

import java.util.*;

public class GroupShiftedStrings_ZJK {

    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> m = new HashMap<>();
        for (String str: strings) {
            StringBuilder b = new StringBuilder();
            for (int i = 1; i < str.length(); i ++) {
                int diff = str.charAt(i) - str.charAt(i - 1);
                diff = diff >= 0 ? diff : 26 + diff;
                b.append(diff);
            }
            String key = b.toString();
            m.putIfAbsent(key, new LinkedList<>());
            m.get(key).add(str);
        }
        return new ArrayList<>(m.values());
    }

}
