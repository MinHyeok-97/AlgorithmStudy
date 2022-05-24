package inflearn.greedy;

import java.io.*;
import java.util.StringTokenizer;

//친구인가(Union&Find)
public class ex_6 {
    static int[] unf;

    static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 1; i <= m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            union(a, b);
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        int fa = find(Integer.parseInt(st3.nextToken()));
        int fb = find(Integer.parseInt(st3.nextToken()));
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
