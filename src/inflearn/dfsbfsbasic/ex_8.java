package inflearn.dfsbfsbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//경로탐색 dfs - 인접리스트
public class ex_8 {
    static int n, m, answer;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visit;

    static void dfs(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int g : graph.get(v)) {
                if (!visit[g]) {
                    visit[g] = true;
                    dfs(g);
                    visit[g] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        graph = new ArrayList<>();
        visit = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            graph.get(a).add(b);
        }

        visit[1] = true;
        dfs(1);

        System.out.println(answer);
    }
}
