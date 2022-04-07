package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Bottom up
public class ex_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num + 1];

        dp[0] = dp[1] = 0;
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[num]);
    }
}

// Top Down
//    public static int[] dp;
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int num = Integer.parseInt(br.readLine());
//        dp = new int[num + 1];
//
//        System.out.println(calc(num));
//    }
//
//    public static int calc(int num) {
//        if (num == 1) {
//            return 0;
//        }
//
//        if (dp[num] > 0) {
//            return dp[num];
//        }
//
//        dp[num] = calc(num - 1) + 1;
//
//        if (num % 2 ==0) {
//            dp[num] = Math.min(dp[num], calc(num / 2) + 1);
//        }
//
//        if (num % 3 ==0) {
//            dp[num] = Math.min(dp[num], calc(num / 3) + 1);
//        }
//
//        return dp[num];
//    }
//}
