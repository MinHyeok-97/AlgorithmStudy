package programmers.heap;

import java.io.*;
import java.util.*;

//더 맵게
public class ex_1 {
    static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : scoville) {
            pq.offer(x);
        }

        while (pq.peek() <= K) {
            if (pq.size() == 1) return -1;

            int sum = pq.poll() + (pq.poll() * 2);
            pq.offer(sum);

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(arr, k));

    }
}
