package baekjoon.bruteforce;

/*
N과 M(1)

문제
    자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

    1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열

입력
    첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

출력
    한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

    수열은 사전 순으로 증가하는 순서로 출력해야 한다.

 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15649 {
    static int n, m;
    static boolean[] check;
    static int[] select;
    static StringBuilder sb = new StringBuilder();

    static void rec_func(int k) {
        if (k == m) {
            for (int i = 0; i < m; i++) {
                sb.append(select[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 0; i < n; i++) {
                if (check[i]) continue;

                check[i] = true;
                select[k] = i + 1;
                rec_func(k + 1);
                check[i] = false;
                select[k] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        check = new boolean[n];
        select = new int[m];

        rec_func(0);

        System.out.println(sb);
    }
}
