package programmers.stackNqueue;

import java.io.*;
import java.util.*;

//기능 개발
public class ex_1 {
    static ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.offer((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        ArrayList<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            int day = queue.poll();
            int cnt = 1;

            while (!queue.isEmpty() && day >= queue.peek()) {
                cnt++;
                queue.poll();
            }

            answer.add(cnt);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        for (int j = 0; j < n; j++) {
            arr2[j] = Integer.parseInt(st3.nextToken());
        }

        for (int r : solution(arr1, arr2)) {
            System.out.print(r + " ");
        }
    }
}
