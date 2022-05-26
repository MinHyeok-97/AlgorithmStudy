package inflearn.dp;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//동전교환
public class ex_5 {
    static int n, m;
    static int[] dy;
    static int solution(int[] arr) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }

        return dy[m];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[] coin = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(st.nextToken());
        }

        m = Integer.parseInt(br.readLine());
        dy = new int[m + 1];

        System.out.println(solution(coin));
    }
}
