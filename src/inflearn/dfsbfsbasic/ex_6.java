package inflearn.dfsbfsbasic;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//송아지 찾기
public class ex_6 {
    static int[] distance = {1, -1, 5};
    static boolean[] visit = new boolean[10001];
    static Queue<Integer> queue = new LinkedList<>();

    static int bfs(int s, int e) {
        int answer = 0;
        visit[s] = true;

        queue.offer(s);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int x = queue.poll();

                for (int j = 0; j < distance.length; j++) {
                    int pos = x + distance[j];
                    if (pos == e) return answer + 1;
                    if (pos >= 1 && pos <= 10000 && !visit[pos]) {
                        visit[pos] = true;
                        queue.offer(pos);
                    }
                }
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        System.out.println(bfs(S, E));
    }
}
