package inflearn.sort;

import java.io.*;
import java.util.StringTokenizer;

//LRU
public class ex_4 {
    static int[] solution(int size, int[] arr) {
        int[] answer = new int[size];

        for (int num : arr) {
            int pos = -1;

            for (int x = 0; x < size; x++) {
                if (num == answer[x]) pos = x;
            }

            if (pos == -1) {
                for (int i = size - 1; i > 0; i--) {
                    answer[i] = answer[i - 1];
                }
                answer[0] = num;
            } else {
                for (int i = pos; i > 0; i--) {
                    answer[i] = answer[i - 1];
                }
                answer[0] = num;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st1.nextToken());
        int arrCnt = Integer.parseInt(st1.nextToken());
        int[] arrNum = new int[arrCnt];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrCnt; i++) {
            arrNum[i] = Integer.parseInt(st2.nextToken());
        }

        for (int a : solution(size, arrNum)) {
            System.out.print(a + " ");
        }
    }
}
