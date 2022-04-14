package inflearn.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//씨름 선수
class body implements Comparable<body> {
    public int h, w;

    public body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(body o) {
        if (this.h == o.h) return o.w - this.w;
        else return o.h - this.h;
    }
}

public class ex_1 {
    static int solution(int cnt, ArrayList<body> arr){
        int answer = 0;

        int max = 0;
        for (body b : arr) {
            if (b.w > max) {
                max = b.w;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arrCnt = Integer.parseInt(br.readLine());
        ArrayList<body> arr = new ArrayList<>();

        for(int i = 0; i < arrCnt ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            arr.add(new body(height, weight));
        }

        Collections.sort(arr);

        System.out.println(solution(arrCnt, arr));
    }
}
