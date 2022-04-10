package inflearn.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//중복 확인
public class ex_5 {
    static char solution(int cnt, int[] arr) {
        char answer = 'U';

        Arrays.sort(arr);
        for (int i = 0; i < cnt - 1; i++) {
            if (arr[i] == arr[i + 1]) return 'D';
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        int[] arrNum = new int[arrCnt];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arrCnt; i++) {
            arrNum[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arrCnt, arrNum));
    }
}
