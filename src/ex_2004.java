import java.io.*;
import java.util.StringTokenizer;

public class ex_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());

        long count5 = fivePower(num1) - fivePower(num1 - num2) - fivePower(num2);
        long count2 = twoPower(num1) - twoPower(num1 - num2) - twoPower(num2);

        System.out.println(Math.min(count5, count2));
    }

    static long fivePower(long num) {
        int count = 0;

        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }

        return count;
    }

    static long twoPower(long num) {
        int count = 0;

        while (num >= 2) {
            count += num / 2;
            num /= 2;
        }

        return count;
    }
}
