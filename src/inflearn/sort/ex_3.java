package inflearn.sort;

import java.io.*;
import java.util.StringTokenizer;

//삽입 정렬
public class ex_3 {
    static int[] solution(int n, int[] arr) {
        int[] answer = arr;

        for (int i = 1; i < n; i++) {
            int temp = answer[i], j;

            for (j = i - 1; j >= 0; j--) {
                if (answer[j] > temp) {
                    answer[j + 1] = answer[j];
                } else {
                    break;
                }
            }

            answer[j + 1] = temp;
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
