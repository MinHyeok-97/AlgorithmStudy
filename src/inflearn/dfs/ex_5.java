package inflearn.dfs;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//동전 교환
public class ex_5 {
    static int arrCnt, total, answer;

    static void dfs(int n, int sum, Integer[] arr) {
        if (sum > total) return;
        if (n >= answer) return; //최소 개수보다 큰 것은 계산 할 필요 없음.
        if (sum == total) {
            answer = Math.min(n, answer);
        } else {
            for (int i = 0; i < arrCnt; i++) {
                dfs(n + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arrCnt = Integer.parseInt(br.readLine());
        Integer[] arrNum = new Integer[arrCnt];
        answer = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrCnt; i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrNum, Collections.reverseOrder()); //내림차순 정렬 -> total 값이 되는 최소 개수를 찾는 것이기 때문에 큰 수부터 계산하여 정답 빨리 찾기

        total = Integer.parseInt(br.readLine());

        dfs(0, 0, arrNum);

        System.out.println(answer);
    }
}
