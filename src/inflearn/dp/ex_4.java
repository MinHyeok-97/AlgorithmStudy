package inflearn.dp;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//가장 높은 탑 쌓기
class Brick implements Comparable<Brick> {
    public int s, h, w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s; //내림차순
    }
}
public class ex_4 {
    static int[] height;

    static int solution(ArrayList<Brick> arr) {
        height[0] = arr.get(0).h;
        int answer = height[0];

        for (int i = 1; i < arr.size(); i++) {
            int max = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i).w < arr.get(j).w && height[j] > max) {
                    max = height[j];
                }
            }
            height[i] = max + arr.get(i).h;

            answer = Math.max(height[i], answer);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int brickCnt = Integer.parseInt(br.readLine());
        ArrayList<Brick> arrBrick = new ArrayList<>();
        height = new int[brickCnt];

        for (int i = 0; i < brickCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            arrBrick.add(new Brick(a, b, c));
        }
        Collections.sort(arrBrick);

        System.out.println(solution(arrBrick));

    }
}
