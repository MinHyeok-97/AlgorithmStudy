package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//N과 M(1)
public class B_15649 {
    static int n, m;
    static int[] arr, chk;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int k) {
        if (k == m) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 1; i <= n; i++) {
                if (chk[i] == 1) continue;
                arr[k] = i;
                chk[i] = 1;
                dfs(k + 1);
                chk[i] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        chk = new int[n + 1];

        dfs(0);

        System.out.println(sb);
    }
}
