package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//조합의 경우 수
public class ex_7 {
    static int[][] comb = new int[34][34];
    static int dfs(int n, int r) {
        if (comb[n][r] > 0) return comb[n][r];
        if (n == r || r == 0) return 1;
        else {
            return comb[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.println(dfs(n,r));
    }
}
