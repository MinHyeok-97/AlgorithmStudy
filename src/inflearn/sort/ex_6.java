package inflearn.sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//장난꾸러기
public class ex_6 {
    static ArrayList<Integer> solution(int cnt, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] temp = arr.clone();
        Arrays.sort(arr);

        for (int i = 0; i < cnt; i++) {
            if (temp[i] != arr[i]) answer.add(i + 1);
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

        for (int a : solution(arrCnt, arrNum)) {
            System.out.print(a + " ");
        }
    }
}
