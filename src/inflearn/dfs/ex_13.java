package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//섬나라 아일랜드
public class ex_13 {
    static int size, answer;
    static int[] dirX = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dirY = {0, 1, 1, 1, 0, -1, -1, -1};

    static void dfs(int x, int y, int[][] map) {
        for (int dir = 0; dir < 8; dir++) {
            int nx = x + dirX[dir];
            int ny = y + dirY[dir];

            if (nx >= 0 && nx < size && ny >= 0 && ny < size && map[nx][ny] == 1) {
                map[nx][ny] = 0;
                dfs(nx, ny, map);
            }
        }
    }

    static void solution(int[][] map) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == 1) {
                    answer++;
                    map[i][j] = 0;
                    dfs(i, j, map);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        int[][] map = new int[size][size];

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < size; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(map);

        System.out.println(answer);
    }
}
