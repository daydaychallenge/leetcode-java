package daydaychange.p00929;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_ZJK {

    public int numUniqueEmails(String[] emails) {
        if (emails == null || emails.length == 0) return 0;
        Set<String> address = new HashSet<>();
        for (String email: emails) {
            char[] data = email.toCharArray();
            StringBuilder sb = new StringBuilder();
            boolean append = false;
            boolean skipped = false;
            for (char c : data) {
                if (c == '.' && append) {
                    sb.append(c);
                } else if (c == '+' && append) {
                    sb.append(c);
                } else if (c == '+') {
                    skipped = true;
                } else if (c == '@') {
                    append = true;
                    skipped = false;
                    sb.append(c);
                } else if ((c != '.' && c != '+') && !skipped) {
                    sb.append(c);
                }
            }
            address.add(sb.toString());
        }
        return address.size();
    }

}
