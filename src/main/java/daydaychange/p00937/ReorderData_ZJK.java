package daydaychange.p00937;

import java.util.Arrays;

public class ReorderData_ZJK {
    public String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length <= 1) return logs;
        Arrays.sort(logs, (log1, log2) -> {

            int index1 = log1.indexOf(" "), index2 = log2.indexOf(" ");


            String str1 = log1.substring(index1 + 1);
            String str2 = log2.substring(index2 + 1);
            char f1 = str1.charAt(0);
            char f2 = str2.charAt(0);
            if (f1 <= '9' && f2 <= '9') return 0;
            else if (f1 <= '9') return 1;
            else if (f2 <= '9') return -1;
            else {
                int c = str1.compareTo(str2);
                if (c == 0) return log1.substring(0, index1 - 1).compareTo(log2.substring(0, index2 - 1));
                return c;
            }
        });
        return logs;
    }
}
