package inflearn.dp;

import java.io.*;

//계단 오르기
public class ex_1 {
    static int[] floor;
    static int solution(int n) {
        floor[1] = 1;
        floor[2] = 2;
        for (int i = 3; i <= n; i++) {
            floor[i] = floor[i - 2] + floor[i - 1];
        }

        return floor[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        floor = new int[num + 1];

        System.out.println(solution(num));
    }
}
