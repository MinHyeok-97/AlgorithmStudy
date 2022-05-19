package inflearn.array;

import java.io.*;
import java.util.StringTokenizer;

//봉우리
public class ex_10 {
    static int solution(int cnt, int[][] arr) {
        int answer = 0;
        int[] dirX = {0, 0, -1, 1};
        int[] dirY = {-1, 1, 0, 0};

        for (int i = 0; i < cnt; i ++) {
            for (int j = 0; j < cnt; j++) {
                boolean flag = true;
                for (int d = 0; d < 4; d++) {
                    int nx = i + dirX[d];
                    int ny = j + dirY[d];
                    if (nx >= 0 && nx < cnt && ny >= 0 && ny < cnt && arr[i][j] <= arr[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        int[][] arrNum = new int[arrCnt][arrCnt];

        for (int i = 0; i < arrCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < arrCnt; j++) {
                arrNum[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(arrCnt, arrNum));
    }
}
