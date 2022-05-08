package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//조합 구하기
public class ex_10 {
    static int n, m;
    static int[] comb;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int L, int S) {
        if (L == m) {
            for (int i = 0; i < m; i ++) {
                sb.append(comb[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = S; i <= n; i++) {
                comb[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        comb = new int[m];

        dfs(0, 1);

        System.out.println(sb);
    }
}
