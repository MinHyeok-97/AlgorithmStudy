package inflearn.stacknqueue;

import java.io.*;
import java.util.Stack;

//올바른 괄호
public class ex_1 {
    static String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    answer = "NO";
                }
            }
        }

        if (!stack.empty()) {
            answer = "NO";
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
