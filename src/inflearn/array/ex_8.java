package inflearn.array;

import java.io.*;
import java.util.StringTokenizer;

//등수 구하기
public class ex_8 {
    static int[] solution(int cnt, int[] arr) {
        int[] answer = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            answer[i] = 1;
            for (int j = 0; j < cnt; j++) {
                if (arr[i] < arr[j]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        int[] arrScore = new int[arrCnt];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrCnt; i++) {
            arrScore[i] = Integer.parseInt(st.nextToken());
        }

        for (int out : solution(arrCnt, arrScore)) {
            System.out.print(out + " ");
        }
    }
}
