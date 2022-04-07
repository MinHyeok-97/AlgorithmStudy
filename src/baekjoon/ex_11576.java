package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex_11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        int count = Integer.parseInt(br.readLine());

        //numA진법 -> 10진법
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        for (int i = count - 1; i >= 0; i--) {
            int num = Integer.parseInt(st2.nextToken());
            result += (num * (int) Math.pow(numA, i));
        }

        //10진법 -> numB진법
        Stack<Integer> stack = new Stack<>();
        while (result != 0) {
            stack.push(result % numB);
            result /= numB;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
