import java.io.*;
import java.util.StringTokenizer;

public class ex_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < tCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int gcd = getGCD(num1, num2);

            sb.append(num1 * num2 / gcd).append("\n");
        }

        System.out.println(sb);
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }
}
