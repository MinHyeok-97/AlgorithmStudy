package inflearn.sort;

import java.io.*;
import java.util.StringTokenizer;

//선택 정렬
public class ex_1 {
    static int[] solution(int n, int[] arr) {
        int[] answer = arr;

        for (int i = 0; i < n; i++) {
            int idx = i;

            for (int j = i + 1; j < n; j++) {
                if (answer[j] < answer[idx]) {
                    idx = j;
                }
            }

            int temp = answer[i];
            answer[i] = answer[idx];
            answer[idx] = temp;
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

        for (int a : solution(num, arrNum)) {
            System.out.print(a + " ");
        }
    }
}
