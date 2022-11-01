package programmers.date;

import java.io.*;

//다음 큰 숫자
public class D20221101b {
    static int solution(int n) {
        int answer = 0;

        for (int i = n + 1; i < 1000000; i++) {
            if (Integer.bitCount(n) == Integer.bitCount(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(Integer.parseInt(br.readLine())));
    }
}
