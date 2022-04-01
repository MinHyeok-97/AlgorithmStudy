package inflearn.array;

import java.io.*;

//피보나치 수열
public class ex_4 {
    static int[] solution(int n) {
        int[] answer = new int[n];

        for (int i = 0; i < answer.length; i++) {
            if (i < 2) {
                answer[i] = 1;
            } else {
                answer[i] = answer[i - 1] + answer[i - 2];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i : solution(num)) {
            System.out.print(i + " ");
        }
    }
}
