import java.io.*;
import java.util.ArrayList;

public class ex_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[1000001];

        //소수 구하기
        check[0] = check[1] = true;
        for (int i = 2; i < check.length - 1; i ++) {
            if (! check[i]) {
                for (int j = i + i; j < check.length - 1; j += i) {
                    check[j] = true;
                }
            }
        }

        int tCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < tCase; i++) {
            int num = Integer.parseInt(br.readLine());
            int result = 0;

            for (int j = 2; j <= num / 2; j++) {
                if (! check[j] && ! check[num - j]) {
                    result++;
                }
            }

            System.out.println(result);
        }

    }
}
