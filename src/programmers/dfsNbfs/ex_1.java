package programmers.dfsNbfs;

import java.io.*;
import java.util.StringTokenizer;

//타켓 넘버
public class ex_1 {
    static int answer = 0, n, target;

    static void dfs(int idx, int sum, int[] arr) {
        if (idx == n) {
            if (sum == target) {
                answer++;
            }
        } else {
            dfs(idx + 1, sum + arr[idx], arr);
            dfs(idx + 1, sum - arr[idx], arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        int[] numbers = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(0, 0, numbers);

        System.out.println(answer);
    }
}
