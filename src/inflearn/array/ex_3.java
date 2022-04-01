package inflearn.array;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//가위 바위 보
public class ex_3 {
    static ArrayList<Character> solution(int n, int[] a, int[] b) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer.add('D');
            else if (a[i] == 1 && b[i] == 3) answer.add('A');
            else if (a[i] == 2 && b[i] == 1) answer.add('A');
            else if (a[i] == 3 && b[i] == 2) answer.add('A');
            else answer.add('B');
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arrA = new int[N];
        StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(stA.nextToken());
        }

        int[] arrB = new int[N];
        StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arrB[i] = Integer.parseInt(stB.nextToken());
        }

        for (char c : solution(N, arrA, arrB)) {
            System.out.println(c);
        }
    }
}
