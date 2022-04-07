package inflearn.array;

import java.io.*;
import java.util.StringTokenizer;

//점수 계산
public class ex_7 {
    static int solution(int[] arr) {
        int answer = 0;

        int plus = 0;
        for (int i : arr) {
            if (i == 0) {
                plus = 0;
            } else {
                plus++;
                answer = answer + plus;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arrNum = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arrNum));
    }
}
