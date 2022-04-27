package inflearn.greedy;

import java.io.*;
import java.util.*;

//최대 수입 스케줄 Priority Queue
class Lecture implements Comparable<Lecture> {
    int m, d;

    public Lecture(int m, int d) {
        this.m = m;
        this.d = d;
    }

    @Override
    public int compareTo(Lecture o) {
        if (this.d == o.d) return o.m - this.m;
        return o.d - this.d;
    }
}
public class ex_4 {
    static int solution(int cnt, ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //최대값 우선

        int max = arr.get(0).d;
        int j = 0;
        for (int i = max; i > 0; i--) {
            for ( ; j < cnt; j++) {
                if (arr.get(j).d < i) break;
                pq.offer(arr.get(j).m);
            }

            if (!pq.isEmpty()) answer += pq.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < arrCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.add(new Lecture(a, b));
        }
        Collections.sort(arr);

        System.out.println(solution(arrCnt, arr));

    }
}
