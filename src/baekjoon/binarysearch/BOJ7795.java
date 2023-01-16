package baekjoon.binarysearch;

/*
먹을 것인가 먹힐 것인가

문제
    심해에는 두 종류의 생명체 A와 B가 존재한다. A는 B를 먹는다. A는 자기보다 크기가 작은 먹이만 먹을 수 있다. 예를 들어, A의 크기가 {8, 1, 7, 3, 1}이고,
    B의 크기가 {3, 6, 1}인 경우에 A가 B를 먹을 수 있는 쌍의 개수는 7가지가 있다. 8-3, 8-6, 8-1, 7-3, 7-6, 7-1, 3-1.

    두 생명체 A와 B의 크기가 주어졌을 때, A의 크기가 B보다 큰 쌍이 몇 개나 있는지 구하는 프로그램을 작성하시오.

입력
    첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스의 첫째 줄에는 A의 수 N과 B의 수 M이 주어진다. 둘째 줄에는 A의 크기가 모두 주어지며, 셋째 줄에는 B의 크기가 모두 주어진다. 크기는 양의 정수이다. (1 ≤ N, M ≤ 20,000)

출력
    각 테스트 케이스마다, A가 B보다 큰 쌍의 개수를 출력한다.
 */

import java.io.*;
import java.util.*;

public class BOJ7795 {
    static int solution(int[] a, int[] b) {
        int answer = 0;

        Arrays.sort(b);

        for (int i = 1; i < a.length; i++) {
            int left = 1;
            int right = b.length - 1;

            while (left <= right) {
                int middle = (left + right) / 2;

                if (b[middle] < a[i]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }

            answer += right;
        }

        return answer;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int[] arrA = new int[Integer.parseInt(st1.nextToken()) + 1];
            int[] arrB = new int[Integer.parseInt(st1.nextToken()) + 1];

            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j < arrA.length; j++) {
                arrA[j] = Integer.parseInt(st2.nextToken());
            }

            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            for (int k = 1; k < arrB.length; k++) {
                arrB[k] = Integer.parseInt(st3.nextToken());
            }

            sb.append(solution(arrA, arrB)).append("\n");
        }

        System.out.println(sb);

    }
}