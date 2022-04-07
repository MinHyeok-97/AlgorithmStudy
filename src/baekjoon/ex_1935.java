package baekjoon;

import java.io.*;
import java.util.Stack;

public class ex_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[numCnt];

        Stack<Double> stack = new Stack<>();

        String strCalc = br.readLine();

        for (int i = 0; i < numCnt; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < strCalc.length(); i++) {
            char c = strCalc.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                stack.push((double)numArr[c - 'A']);
            } else {
                double popVal2 = stack.pop();
                double popVal1 = stack.pop();

                switch (c) {
                    case '+' :
                        stack.push(popVal1 + popVal2);
                        break;
                    case '-' :
                        stack.push(popVal1 - popVal2);
                        break;
                    case '/' :
                        stack.push(popVal1 / popVal2);
                        break;
                    case '*' :
                        stack.push(popVal1 * popVal2);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
