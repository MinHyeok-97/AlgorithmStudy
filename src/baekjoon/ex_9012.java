package baekjoon;

import java.io.*;
import java.util.Stack;

public class ex_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < tCase; i++) {
            String ps = br.readLine();
            Stack<Character> stack = new Stack<>();

            boolean vpsNo = false;

            for (char c : ps.toCharArray()) {
                vpsNo = false;
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.empty()) {
                        vpsNo = true;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if(!stack.empty() || vpsNo){
                bw.write("NO" + "\n");
            } else {
                bw.write("YES" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
