package inflearn.dfs;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//피자배달거리(dfs)
public class ex_15 {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] comb;
    static ArrayList<Point> hs, pz;

    static void dfs(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : comb) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }

            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
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
        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                int tmp = Integer.parseInt(st2.nextToken());
                if (tmp == 1) hs.add(new Point(i, j));
                else if (tmp == 2) pz.add(new Point(i, j));
            }
        }

        len = pz.size();
        comb = new int[m];
        dfs(0, 0);

        System.out.println(answer);
    }
}
