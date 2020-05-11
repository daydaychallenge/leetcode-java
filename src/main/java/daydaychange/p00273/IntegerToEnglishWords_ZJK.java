package daydaychange.p00273;

import java.util.Stack;

/**
 * @author ZhangJk
 * @version 1.0
 * @date 2020/5/3 6:22 AM
 */
public class IntegerToEnglishWords_ZJK {

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] units = {"", "Thousand", "Million", "Billion"};
        int index = 0;
        while (num != 0) {
            int oneAndTwos = num % 100;
            int hundreds = (num = num / 100) % 10;
            String unit = units[index];
            StringBuilder r = new StringBuilder();
            String hundredStr = numLT20(hundreds);
            if (!hundredStr.isEmpty()) {
                r.append(hundredStr).append(" Hundred ");
            }
            if (oneAndTwos != 0) {
                String s = numLT20(oneAndTwos);
                if (!s.isEmpty()) {
                    r.append(s).append(" ");
                } else {
                    int ones = oneAndTwos % 10;
                    int tens = oneAndTwos / 10;
                    String tensStr = ten(tens);
                    if (!tensStr.isEmpty()) r.append(ten(tens)).append(" ");
                    String onesStr = numLT20(ones);
                    if (!onesStr.isEmpty()) {
                        r.append(onesStr).append(" ");
                    }
                }
            }
            if (!unit.isEmpty() && r.length() > 0) r.append(unit).append(" ");
            index ++;
            num /= 10;
            stack.push(r.toString());
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString().trim();
    }

    public String numLT20(int num) {
        switch (num) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            default: return "";
        }
    }


    public String ten(int num) {
        switch (num) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
            default: return "";
        }
    }

}
