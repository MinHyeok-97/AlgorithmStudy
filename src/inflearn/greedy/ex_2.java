package inflearn.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time> {
    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

//회의실 배정
public class ex_2 {
    static int solution(int cnt, ArrayList<Time> arr) {
        int answer = 0;

        int temp = 0;
        for (Time t : arr) {
            if (t.s >= temp) {
                temp = t.e;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < arrCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr.add(new Time(start, end));
        }
        Collections.sort(arr);

        System.out.println(solution(arrCnt, arr));
    }
}
