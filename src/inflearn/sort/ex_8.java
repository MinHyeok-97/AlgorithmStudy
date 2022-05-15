package inflearn.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//이분 검색
public class ex_8 {
    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int first = 0;
        int last = n-1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }

            if (m > arr[mid]) first = mid + 1;
            else last = mid - 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arrNum = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arrNum[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(n, m, arrNum));
    }
}
