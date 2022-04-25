package inflearn.array;

import java.io.*;
import java.util.StringTokenizer;

//격자판 최대합
public class ex_9 {
    static int solution(int n, int[][] arr) {
        int answer = 0;

        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2=0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(sum1, answer);
        answer = Math.max(sum2, answer);

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
