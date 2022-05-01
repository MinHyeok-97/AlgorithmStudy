package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//수열 추측하기
public class ex_8 {
    static int n, f;
    static int[] b, p;
    static int[][] dy = new int[11][11];
    static boolean[] check;
    static boolean flag = false;

    static int comb(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else {
            return dy[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
        }
    }

    static void dfs(int l, int sum) {
        if (flag) return;
        if (l == n) {
            if (sum == f) {
                flag = true;
                for (int result : p) {
                    System.out.print(result + " ");
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if(!check[i]) {
                    check[i] = true;
                    p[l] = i;
                    dfs(l + 1, sum + (p[l] * b[l]));
                    check[i] = false;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        b = new int[n];
        p = new int[n];
        check = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = comb(n - 1, i);
        }

        dfs(0, 0);
    }
}
