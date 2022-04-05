package inflearn.twopointer;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

//공통원소 구하기 two pointer
public class ex_2 {
    static ArrayList<Integer> solution(int a, int b, int[] arrA, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int pA = 0, pB = 0;
        while (pA < a && pB < b) {
            if (arrA[pA] == arrB[pB]) {
                answer.add(arrA[pA++]);
                pB++;
            } else if (arrA[pA] < arrB[pB]) {
                pA++;
            } else {
                pB++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numA = Integer.parseInt(br.readLine());
        int[] arrA = new int[numA];
        StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numA; i++) {
            arrA[i] = Integer.parseInt(stA.nextToken());
        }

        int numB = Integer.parseInt(br.readLine());
        int[] arrB = new int[numB];
        StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < numB; j++) {
            arrB[j] = Integer.parseInt(stB.nextToken());
        }

        for (int a : solution(numA, numB, arrA, arrB)) {
            System.out.print(a + " ");
        }
    }
}
