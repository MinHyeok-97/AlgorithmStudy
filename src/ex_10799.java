import java.io.*;
import java.util.Stack;

public class ex_10799 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.substring(i, i+1).equals("("))
                stack.push(i);
            else {
                if(stack.peek() == i-1) {
                    stack.pop();
                    count += stack.size();
                }
                else {
                    stack.pop();
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
