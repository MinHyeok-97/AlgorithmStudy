package inflearn.array;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//뒤집은 소수
public class ex_6 {
    static ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        //숫자 뒤집기
        int[] reverse = new int[num];
        for (int i = 0; i < num; i++) {
            while (arr[i] > 0) {
                reverse[i] = reverse[i] * 10 + arr[i] % 10;
                arr[i] /= 10;
            }
        }

        //소수 구하기
        boolean[] check = new boolean[100000];
        check[0] = check[1] = true;
        for(int i = 2; i < check.length; i++) {
            for (int j = i + i; j < check.length; j += i) {
                check[j] = true;
            }
        }

        for(int i : reverse) {
            if (!check[i]) {
                answer.add(i);
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

        for (int i : solution(num, arrNum)) {
            System.out.print(i + " ");
        }
    }
}
