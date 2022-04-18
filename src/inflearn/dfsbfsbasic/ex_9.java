package inflearn.dfsbfsbasic;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//그래프 최단거리 bfs
public class ex_9 {
    static int n, m;
    static int[] answer;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> graph;

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visit[v] = true;

        queue.offer(v);
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int nv : graph.get(x)) {
                if (!visit[nv]) {
                    visit[nv] = true;
                    queue.offer(nv);
                    answer[nv] = answer[x] + 1;
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
        answer = new int[n + 1];
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

        bfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " +answer[i]);
        }


    }
}
