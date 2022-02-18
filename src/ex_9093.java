import java.io.*;
import java.util.Stack;

public class ex_9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tCase = Integer.parseInt(br.readLine());

        Stack<Character> charStack = new Stack<Character>();

        for (int i = 0; i < tCase; i++) {
            String sentence = br.readLine() + "\n";
            for (char c : sentence.toCharArray()) {
                if (c == ' ' || c == '\n') {
                    while (!charStack.empty()) {
                        bw.write(charStack.pop());
                    }
                    bw.write(c);
                } else {
                    charStack.push(c);
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
