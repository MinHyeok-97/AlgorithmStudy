import java.io.*;
import java.util.Stack;

public class ex_1874 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int numCount = Integer.parseInt(br.readLine());
        int popVal = 0;

        while (numCount --> 0) {
            int intVal = Integer.parseInt(br.readLine());

            if (intVal > popVal) {
                for (int i = popVal + 1; i <= intVal; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                popVal = intVal;
            } else if (stack.peek() != intVal) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        System.out.println(sb);
    }
}
