package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//바둑이 승차
public class ex_2 {
    static int limit, arrCnt, answer = 0;

    static void dfs(int idx, int sum, int[] arr){
        if (limit < sum) return;
        if (idx == arrCnt) {
            answer = Math.max(sum, answer);
        } else {
            dfs(idx + 1, sum + arr[idx], arr);
            dfs(idx + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        limit = Integer.parseInt(st.nextToken());
        arrCnt = Integer.parseInt(st.nextToken());

        int[] arrWeight = new int[arrCnt];
        for (int i = 0; i < arrCnt; i++) {
            arrWeight[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, 0, arrWeight);

        System.out.println(answer);
    }
}
