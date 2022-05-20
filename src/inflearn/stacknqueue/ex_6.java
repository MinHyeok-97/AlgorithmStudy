package inflearn.stacknqueue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//공주 구하기
public class ex_6 {
    static int solution(int n, int k) {
        int answer;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }

        answer = queue.poll();

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(solution(n, k));
    }
}
