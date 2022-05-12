package inflearn.dfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//토마토 bfs
public class ex_12 {
    static int x, y;
    static int[][] box, day;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static Queue<Point> queue = new LinkedList<>();

    static void bfs() {
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Point p = queue.poll();

                for (int dir = 0; dir < 4; dir++) {
                    int nx = p.x + dirX[dir];
                    int ny = p.y + dirY[dir];

                    if (nx >= 0 && ny >= 0 && nx < x && ny < y && box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        queue.offer(new Point(nx, ny));
                        day[nx][ny] = day[p.x][p.y] + 1;
                    }
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        boolean check = true;
        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        y = Integer.parseInt(st1.nextToken());
        x = Integer.parseInt(st1.nextToken());
        box = new int[x][y];
        day = new int[x][y];

        for (int i = 0; i < x; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < y; j++) {
                box[i][j] = Integer.parseInt(st2.nextToken());

                if (box[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        bfs();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (box[i][j] == 0) check = false;
            }
        }

        if (check) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    answer = Math.max(answer, day[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
