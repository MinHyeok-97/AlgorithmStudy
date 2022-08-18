package baekjoon.simulation;

import java.io.*;
import java.util.StringTokenizer;

//알람 시계
public class BOJ2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m - 45 >= 0) {
            m -= 45;
        } else {
            if (h > 0) h -= 1;
            else h = 23;

            m += 15;
        }

        System.out.println(h + " " + m);
    }
}
