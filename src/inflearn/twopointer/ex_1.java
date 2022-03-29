package inflearn.twopointer;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//두 배열 합치기(오름차순)
public class ex_1 {
    static ArrayList<Integer> solution(int size1, int size2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 =0;

        while (p1 < size1 && p2 < size2) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }

        while (p1 < size1) answer.add(arr1[p1++]);
        while (p2 < size2) answer.add(arr2[p2++]);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrSize1 = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int[] arr1 = new int[arrSize1];
        for (int i = 0; i < arrSize1; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
        }

        int arrSize2 = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int[] arr2 = new int[arrSize2];
        for (int i = 0; i < arrSize2; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }


        for (int x : solution(arrSize1, arrSize2, arr1, arr2)) System.out.print(x + " ");
    }
}
