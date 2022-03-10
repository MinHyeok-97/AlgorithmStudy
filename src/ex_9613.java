import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ex_9613 {
    static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            ArrayList<Integer> list = new ArrayList<>();

            int tCase = Integer.parseInt(st.nextToken());

            for (int j = 0; j < tCase; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            long sum = 0;
            for (int n = 0; n < list.size() - 1; n++) {
                for (int m = n + 1; m < list.size(); m++) {
                    sum += getGCD(list.get(n), list.get(m));
                }
            }

            System.out.println(sum);
        }
    }
}
