package programmers.date.d20221101;

import java.io.*;

//피보나치 수
public class problemA {
    static int[] f;
    static int solution(int n) {
        f = new int[n + 1];

        return dfs(n);
    }

    static int dfs(int n) {
        if (n == 1 || n == 2) return f[n] = 1;
        else if (f[n] > 0) return f[n];

        return f[n] = (dfs(n - 1) + dfs(n - 2)) % 1234567;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(Integer.parseInt(br.readLine())));
    }
}
