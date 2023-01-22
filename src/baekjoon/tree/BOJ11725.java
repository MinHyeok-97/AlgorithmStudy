package baekjoon.tree;

/*
트르의 부모 찾기

문제
    루트 없는 트리가 주어진다. 이때, 트리의 루트를 1이라고 정했을 때, 각 노드의 부모를 구하는 프로그램을 작성하시오.

입력
    첫째 줄에 노드의 개수 N (2 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N-1개의 줄에 트리 상에서 연결된 두 정점이 주어진다.

출력
    첫째 줄부터 N-1개의 줄에 각 노드의 부모 노드 번호를 2번 노드부터 순서대로 출력한다.
 */

import java.io.*;
import java.util.*;

public class BOJ11725 {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static ArrayList<Integer>[] adj;
    static int[] parent;

    static void dfs(int x, int par) {
        for (int y : adj[x]) {
            if (y == par) continue;

            parent[y] = x;

            dfs(y, x);
        }

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        adj = new ArrayList[n + 1];
        parent = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            adj[x].add(y);
            adj[y].add(x);
        }

        dfs(1, -1);

        for (int i = 2; i <= n; i++) {
            sb.append(parent[i]).append("\n");
        }

        System.out.println(sb);
    }
}
