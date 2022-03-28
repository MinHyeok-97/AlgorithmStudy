package bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class ex_15649 {
    static int n, m;
    static int[] result;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    static void rec_func(int k) {
        if (k == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[k] = i + 1;
                rec_func(k + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        result = new int[m];
        visit = new boolean[n];

        rec_func(0);

        System.out.println(sb);
    }

}
