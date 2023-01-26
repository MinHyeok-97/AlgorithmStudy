package baekjoon.topologicalsort;

/*
줄 세우기

문제
    N명의 학생들을 키 순서대로 줄을 세우려고 한다. 각 학생의 키를 직접 재서 정렬하면 간단하겠지만, 마땅한 방법이 없어서 두 학생의 키를 비교하는 방법을 사용하기로 하였다.
    그나마도 모든 학생들을 다 비교해 본 것이 아니고, 일부 학생들의 키만을 비교해 보았다.

    일부 학생들의 키를 비교한 결과가 주어졌을 때, 줄을 세우는 프로그램을 작성하시오.

입력
    첫째 줄에 N(1 ≤ N ≤ 32,000), M(1 ≤ M ≤ 100,000)이 주어진다. M은 키를 비교한 회수이다.
    다음 M개의 줄에는 키를 비교한 두 학생의 번호 A, B가 주어진다. 이는 학생 A가 학생 B의 앞에 서야 한다는 의미이다.

    학생들의 번호는 1번부터 N번이다.

출력
    첫째 줄에 학생들을 앞에서부터 줄을 세운 결과를 출력한다. 답이 여러 가지인 경우에는 아무거나 출력한다.

 */

import java.io.*;
import java.util.*;

public class BOJ2252 {
    static StringBuilder sb = new StringBuilder();

    static int n, m;
    static int[] inDeg;
    static ArrayList<Integer>[] adj;

    static void solution() {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            if (inDeg[i] == 0) queue.add(i);
        }

        while (!queue.isEmpty()) {
            int x = queue.poll();
            sb.append(x).append(' ');

            for (int y : adj[x]) {
                inDeg[y]--;

                if (inDeg[y] == 0) queue.add(y);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        inDeg = new int[n + 1];
        adj = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());

            adj[x].add(y);

            inDeg[y]++;
        }

        solution();

        System.out.println(sb);
    }
}
