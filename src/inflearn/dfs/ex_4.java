package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//중복순열
public class ex_4 {
    static int N, M;
    static int[] arrNum;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int n) {
        if (n == M) {
            for (int x : arrNum) {
                sb.append(x).append(' ');
            }
            sb.append('\n');
            return;
        } else {
            for (int i = 0; i < N; i++) {
                arrNum[n] = i + 1;
                dfs(n + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arrNum = new int[M];

        dfs(0);

        System.out.println(sb);
    }
}
