package programmers.date.d20221103;

import java.io.*;
import java.util.Arrays;

//카펫 (완전 탐색)
public class ProblemA {
    static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int total = brown + yellow;

        for (int i = 1; i <= total; i++) {
            int row = i;
            int col = total / row;

            if (row > col) continue;

            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int brown = Integer.parseInt(br.readLine());
        int yellow = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(solution(brown, yellow)));
    }
}
