package inflearn.array;

import java.io.*;
import java.util.StringTokenizer;

//임시반장 정하기
public class ex_11 {
    static int solution(int n, int[][] arr) {
        int answer = 0, max = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] arrNum = new int[num + 1][6];

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 5; j++) {
                arrNum[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(num, arrNum));
    }
}
