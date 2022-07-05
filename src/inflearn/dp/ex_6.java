package inflearn.dp;

import java.io.*;
import java.util.StringTokenizer;

//최대점수구하기 (냅색 알고리즘)
public class ex_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dy = new int[m + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int ps = Integer.parseInt(st2.nextToken());
            int pt = Integer.parseInt(st2.nextToken());

            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }
}
