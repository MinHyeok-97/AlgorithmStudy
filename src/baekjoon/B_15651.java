package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

//N과 M(3)
public class B_15651 {
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int k) {
        if (k == m) {
            for (int x : arr) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 0; i < n; i++) {
                arr[k] = i + 1;
                dfs(k + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];

        dfs(0);

        System.out.println(sb);
    }
}
