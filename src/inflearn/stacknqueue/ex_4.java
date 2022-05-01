package inflearn.stacknqueue;

import java.io.*;
import java.util.Stack;

//후위식 연산
public class ex_4 {
    static int solution(String str) {
        int answer;

        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                switch (ch) {
                    case '+' :
                        stack.push(lt + rt);
                        break;
                    case '-' :
                        stack.push(lt - rt);
                        break;
                    case '*' :
                        stack.push(lt * rt);
                        break;
                    case '/' :
                        stack.push(lt / rt);
                        break;
                }
            }
        }
        answer = stack.pop();

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String postfix = br.readLine();

        System.out.println(solution(postfix));
    }
}
