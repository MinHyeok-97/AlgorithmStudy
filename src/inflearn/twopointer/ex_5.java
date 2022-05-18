package inflearn.twopointer;

import java.io.*;

//연속된 자연수의 합
public class ex_5 {
    static int solution(int n) {
        int answer = 0;
        int size = n /2 + 1;
        int[] numArr = new int[size];

        for (int i = 0; i < size; i ++) {
            numArr[i] = i + 1;
        }

        int lt = 0, sum = 0;
        for (int rt = 0; rt < size; rt++) {
            sum += numArr[rt];

            while (sum >= n) {
                if (sum == n) answer++;

                sum -= numArr[lt++];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }
}
