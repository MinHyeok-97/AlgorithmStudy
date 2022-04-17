package inflearn.twopointer;

import java.io.*;
import java.util.StringTokenizer;

//연속 부분 수열
public class ex_4 {
    static int solution(int cnt, int s, int[] arr) {
        int answer = 0, sum = 0, p1 = 0;

        for (int p2 = 0; p2 < cnt; p2++) {
            sum += arr[p2];

            while (sum >= s) {
                if(sum == s) answer++;

                sum -= arr[p1++];
            }
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int arrCnt = Integer.parseInt(st1.nextToken());
        int sum = Integer.parseInt(st1.nextToken());
        int[] arrNum = new int[arrCnt];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrCnt; i++) {
            arrNum[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(arrCnt, sum, arrNum));
    }
}
