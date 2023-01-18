package baekjoon.twopointer;

/*
부분합

문제
    10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다.
    이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.

입력
    첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다.
    둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.

출력
    첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.

 */

import java.io.*;
import java.util.*;

public class BOJ1806 {
    static int solution(int[] arr, int s) {
        int answer = Integer.MAX_VALUE;
        int sum = 0, p1 = 0;

        for (int p2 = 0; p2 < arr.length; p2++) {
            sum += arr[p2];

            while (sum >= s) {
                answer = Math.min(answer, (p2 - p1) + 1);
                sum -= arr[p1++];
            }
        }

        if (answer == Integer.MAX_VALUE) answer = 0;

        return answer;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st1.nextToken());
        int s = Integer.parseInt(st1.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(arr, s));
    }
}
