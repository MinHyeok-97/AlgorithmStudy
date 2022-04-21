package inflearn.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//결혼식 - 동시에 존재하는 최대 인원 출력
class Visit implements Comparable<Visit> {
    public int  t;
    public char s;

    public Visit(int t, char s) {
        this.t = t;
        this.s = s;
    }

    @Override
    public int compareTo(Visit o) {
        if (this.t == o.t) return this.s - o.s; //오름차순
        else return this.t - o.t;
    }
}

public class ex_3 {
    static int solution(int cnt, ArrayList<Visit> arr) {
        int answer = 0;

        int count = 0;
        for (Visit v : arr) {
            if (v.s == 's') {
                count++;

            } else if (v.s == 'e') {
                count--;
            }

            answer = Math.max(answer, count);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        ArrayList<Visit> arr = new ArrayList<>();

        for (int i = 0; i < arrCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            arr.add(new Visit(start, 's'));
            int end = Integer.parseInt(st.nextToken());
            arr.add(new Visit(end, 'e'));
        }

        Collections.sort(arr);

       System.out.println(solution(arrCnt, arr));

    }
}
