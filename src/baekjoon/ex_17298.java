package baekjoon;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex_17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[numCnt];

        Stack<Integer> intStack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < numCnt; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < numCnt; i++) {
            while (!intStack.isEmpty() && numArr[intStack.peek()] < numArr[i]) {
                numArr[intStack.pop()] = numArr[i];
            }

            intStack.push(i);
        }

        while (!intStack.isEmpty()) {
            numArr[intStack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numCnt; i++) {
            sb.append(numArr[i]).append(' ');
        }

        System.out.println(sb);
    }
}
