package inflearn.dfs;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//합이 같은 부분집합
public class ex_1 {
    static int arrCnt, total;
    static String answer = "NO";
    static boolean flag = false;

    static void dfs(int idx, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return;
        if (idx == arrCnt) {
            if (sum == total - sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(idx + 1, sum + arr[idx], arr);
            dfs(idx + 1, sum, arr);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arrCnt = Integer.parseInt(br.readLine());
        int [] arrNum = new int[arrCnt];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrCnt; i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
            total += arrNum[i];
        }

        dfs(0, 0, arrNum);

        System.out.println(answer);
    }
}
