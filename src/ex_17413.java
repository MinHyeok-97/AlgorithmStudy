import java.io.*;
import java.util.Stack;

public class ex_17413 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String sentence = br.readLine();

        Stack<Character> stack = new Stack<>();

        boolean tag = false;

        for (char c : sentence.toCharArray()) {
            if (c == ' ' || c == '<') {
                if (c == '<'){
                    tag = true;
                }

                while(!stack.empty()) {
                    sb.append(stack.pop());
                }

                sb.append(c);
            } else if (tag) {
                if (c == '>') {
                    tag = false;
                }

                sb.append(c);
            }
            else {
                stack.push(c);
            }
        }

        while (!stack.empty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
