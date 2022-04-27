package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//순열 구하기
public class ex_6 {
    static int n, m;
    static int[] arr, result;
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static void dfs(int idx) {
        if (idx == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 0; i < n; i++) {
                if (!check[i]) {
                    result[idx] = arr[i];
                    check[i] = true;
                    dfs(idx + 1);
                    check[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        arr = new int[n];
        result = new int[m];
        check = new boolean[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(0);

        System.out.println(sb);
    }
}
