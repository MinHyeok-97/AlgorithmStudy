package inflearn.sort;

import java.io.*;
import java.util.StringTokenizer;

//버블 정렬
public class ex_2 {
    static int[] solution(int n, int[] arr) {
        int[] answer = arr;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
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

        for (int a : solution(num, arrNum)) {
            System.out.print(a + " ");
        }
    }
}
