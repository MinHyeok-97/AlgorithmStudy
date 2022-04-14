package inflearn.dp;

import java.io.*;

//돌다리 건너기
public class ex_2 {
    static int[] bridge;

    static int solution(int n) {
        bridge[0] = 1;
        bridge[1] = 2;
        for (int i = 2; i <= n; i++) {
            bridge[i] = bridge[i - 2] + bridge[i - 1];
        }

        return bridge[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        bridge = new int[num + 1];

        System.out.println(solution(num));
    }
}
