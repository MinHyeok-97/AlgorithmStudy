package inflearn.stacknqueue;

import java.io.*;

import java.util.Stack;

//괄호 안 문자 제거
public class ex_2 {
    static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);

            if (c == ')') {
                while (stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
