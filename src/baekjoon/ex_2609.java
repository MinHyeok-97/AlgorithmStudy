package baekjoon;

import java.io.*;
import java.util.StringTokenizer;


public class ex_2609 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = getGCD(num1, num2);

        System.out.println(gcd);
        System.out.println(num1 * num2 / gcd);
    }

    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }
}
