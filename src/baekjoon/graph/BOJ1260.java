package baekjoon.graph;

/*
DFS와 BFS

문제
    그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
    단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
    정점 번호는 1번부터 N번까지이다.

입력
    첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다.
    다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
    첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

 */

import java.io.*;
import java.util.*;

public class BOJ1260 {
    static StringBuilder sb = new StringBuilder();

    static int n, m, v;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;

    static void dfs(int start) {
        visit[start] = true;

        sb.append(start).append(' ');
        for (Integer i : adj[start]) {
            if (visit[i]) continue;

            dfs(i);
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visit[start] = true;

        while (!queue.isEmpty()) {
            Integer tmp = queue.poll();

            sb.append(tmp).append(' ');
            for (Integer i : adj[tmp]) {
                if (visit[i]) continue;

                queue.offer(i);

                visit[i] = true;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());
        v = Integer.parseInt(st1.nextToken());

        adj = new ArrayList[n + 1];
        visit = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(adj[i]);
        }

        dfs(v);

        sb.append("\n");

        for (int i = 1; i <= n; i++) visit[i] = false;

        bfs(v);

        System.out.println(sb);
    }
}
