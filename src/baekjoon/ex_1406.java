package baekjoon;

import java.io.*;
import java.util.Stack;

public class ex_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String inputStr = br.readLine();
        int cmdCount = Integer.parseInt(br.readLine());

        Stack<Character> firstStack = new Stack<>();
        Stack<Character> secondStack = new Stack<>();


        for (char c : inputStr.toCharArray()) {
            firstStack.push(c);
        }

        for (int i = 0; i < cmdCount; i++) {
            char[] cmd = br.readLine().toCharArray();

            switch (cmd[0]) {
                case 'L':
                    if (!firstStack.empty()) {
                        secondStack.push(firstStack.pop());
                    }
                    break;
                case 'D':
                    if (!secondStack.empty()) {
                        firstStack.push(secondStack.pop());
                    }
                    break;
                case 'B':
                    if (!firstStack.empty()) {
                        firstStack.pop();
                    }
                    break;
                case 'P':
                    firstStack.push(cmd[2]);
                    break;
            }
        }

        while(!firstStack.empty()) {
            secondStack.push(firstStack.pop());
        }
        while (!secondStack.empty()) {
            sb.append(secondStack.pop());
        }

        System.out.println(sb);

    }
}
