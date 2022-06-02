package inflearn.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//원더랜드(크루스칼)
class Edge2 implements Comparable<Edge2> {
    int v1;
    int v2;
    int cost;

    public Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.cost - o.cost; //오름차순 정렬
    }
}
public class ex_7 {
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
        int answer = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        unf = new int[n + 1];
        ArrayList<Edge2> arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) unf[i] = i;

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());
            int z = Integer.parseInt(st2.nextToken());
            arr.add(new Edge2(x, y, z));
        }
        Collections.sort(arr);

        for (Edge2 ob : arr) {
            int fv1 = find(ob.v1);
            int fv2 = find(ob.v2);
            if (fv1 != fv2) {
                answer += ob.cost;
                union(ob.v1, ob.v2);
            }
        }

        System.out.println(answer);

    }
}
