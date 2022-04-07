package inflearn.twopointer;

import java.io.*;
import java.util.StringTokenizer;

//최대매출 - sliding window
public class ex_3 {
    static int solution(int cnt, int range, int[] arr) {
        int sum = 0, answer;

        for (int i = 0; i < range; i++) sum += arr[i];

        answer = sum;
        for (int i = range; i < cnt; i++) {
            sum = sum + arr[i] - arr[i - range];
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int numCnt = Integer.parseInt(st1.nextToken());
        int range = Integer.parseInt(st1.nextToken());

        int[] arrNum = new int[numCnt];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < numCnt; i++) {
            arrNum[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(numCnt, range, arrNum));
    }
}
