package inflearn.dfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//섬나라 아일랜드(BFS)
public class ex_14 {
    static int n, answer;
    static int[] dirX = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dirY = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> queue = new LinkedList<>();

    static void bfs(int x, int y, int[][] map) {
        queue.offer(new Point(x, y));
        while (!queue.isEmpty()) {
            Point pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dirX[i];
                int ny = pos.y + dirY[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
                    map[nx][ny] = 0 ;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }

    static int solution(int[][] map) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    map[i][j] = 0;
                    bfs(i, j, map);
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(arr);

        System.out.println(answer);
    }
}
