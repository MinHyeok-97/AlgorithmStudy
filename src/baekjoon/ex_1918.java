package baekjoon;

import java.io.*;
import java.util.Stack;

public class ex_1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String strCalc = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < strCalc.length(); i++) {
            char c = strCalc.charAt(i);

            switch (c) {
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!stack.empty() && priority(stack.peek()) >= priority(c)) {
                        sb.append(stack.pop());
                    }

                    stack.push(c);
                    break;
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    while (!stack.empty() && stack.peek() != '(') {
                        sb.append(stack.pop());
                    }
                    stack.pop();
                    break;
                default:
                    sb.append(c);
            }

        }

        while (!stack.empty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }

    static int priority(char c) {

        if (c == '(' || c == ')') {
            return 0;
        } else if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        }

        return -1;
    }
}
