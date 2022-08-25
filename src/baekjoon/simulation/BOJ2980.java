package baekjoon.simulation;

import java.io.*;
import java.util.StringTokenizer;

//도로와 신호등
public class BOJ2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int pos = 0, time = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            time += d - pos;
            pos = d;

            int gap = time % (r + g);
            if (gap < r) {
                time += r - gap;
            }
        }

        time += l - pos;

        System.out.println(time);
    }
}
