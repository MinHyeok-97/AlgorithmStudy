package inflearn.dp;

import java.io.*;
import java.util.StringTokenizer;

//최대 부분 증가수열
public class ex_3 {
    static int[] length;

    static int solution(int cnt, int[] arr) {
        length = new int[cnt];
        length[0] = 1;

        int answer = length[0];

        for (int i = 1; i < cnt; i++) {
            int max = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j] && max < length[j]) {
                    max = length[j];
                }
            }

            length[i] = max + 1;

            if (length[i] > answer) {
                answer = length[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        int[] arrNum = new int[arrCnt];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrCnt; i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arrCnt, arrNum));
    }

}
