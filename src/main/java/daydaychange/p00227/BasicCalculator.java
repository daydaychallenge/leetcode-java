package daydaychange.p00227;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/basic-calculator-ii/
 * 227. Basic Calculator II
 * Given a string s which represents an expression, evaluate this expression and return its value.
 *
 * The integer division should truncate toward zero.
 *
 * You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
 *
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 *
 *
 *
 * Example 1:
 *
 * Input: s = "3+2*2"
 * Output: 7
 * Example 2:
 *
 * Input: s = " 3/2 "
 * Output: 1
 * Example 3:
 *
 * Input: s = " 3+5 / 2 "
 * Output: 5
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 3 * 105
 * s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
 * s represents a valid expression.
 * All the integers in the expression are non-negative integers in the range [0, 231 - 1].
 * The answer is guaranteed to fit in a 32-bit integer.
 */
public class BasicCalculator {


    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        int r = calculator.calculate("3+2*2 - 3 + 4 * 5 / 6 - 12 +13 -20");
        System.out.println(r);
    }

    List<Node> elements = new ArrayList<>();

    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        convertSuffixExpression(s);
        Stack<Integer> r = new Stack<>();
        for (Node node : elements) {
            if (node.operate == '0') {
                r.push(node.value);
            } else {
                char o = node.operate;
                int r2 = r.pop();
                int r1 = r.pop();
                if (o == '+') {
                    r.push(r1 + r2);
                } else if (o == '-') {
                    r.push(r1 - r2);
                } else if (o == '*') {
                    r.push(r1 * r2);
                } else if (o == '/') {
                    r.push(r1 / r2);
                }
            }
        }
        return r.pop();
    }

    private void convertSuffixExpression(String s) {
        int len = s.length();
        Stack<Node> operate = new Stack<>();
        int num = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len) {
                elements.add(new Node(num));
                break;
            }
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '*' || c == '-' || c == '+' || c == '/') {
                elements.add(new Node(num));
                num = 0;
                int level = c == '*' || c == '/' ? 1 : 0;
                if (!operate.isEmpty()) {
                    // 判断
                    Node top = operate.peek();
                    int topLevel = top.level;

                    // 如果栈顶的 level > 要入站的
                    if (topLevel >= level) {
                        while (!operate.isEmpty() && operate.peek().level >= level) {
                            elements.add(operate.pop());
                        }
                    }
                }
                operate.push(new Node(c, level));
            }
        }
        while (!operate.isEmpty()) {
            elements.add(operate.pop());
        }
    }

}

class Node {
    public char operate = '0';
    public int level = -1;
    public int value;

    public Node(int value) {
        this.value = value;
    }

    public Node(char operate, int level) {
        this.operate = operate;
        this.level = level;
    }
}