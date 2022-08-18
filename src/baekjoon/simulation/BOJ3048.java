package baekjoon.simulation;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//개미
public class BOJ3048 {
    static class Ant {
        private final int group;
        private final char order;

        public Ant(int group, char order) {
            this.group = group;
            this.order = order;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력 받기
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        String ant1 = br.readLine();
        String ant2 = br.readLine();

        int t = Integer.parseInt(br.readLine());

        //ants = 개미1(reverse) + 개미2
        ArrayList<Ant> ants = new ArrayList<>();
        for (int i = n1 - 1; i >= 0; i--) ants.add(new Ant(1, ant1.charAt(i)));
        for (int i = 0; i < n2; i++) ants.add(new Ant(2, ant2.charAt(i)));

        //t초 만큼 개미 위치 변경하기
        while (t-- > 0) {
            for (int i = 1; i < ants.size(); i++) {
                Ant originAnt = ants.get(i - 1);
                Ant nextAnt = ants.get(i);

                //위치 변경
                if (originAnt.group != 2 && originAnt.group != nextAnt.group) {
                    ants.set(i - 1, nextAnt);
                    ants.set(i, originAnt);

                    //변경했던 개미 건너뛰기
                    i++;
                }

            }
        }

        ants.stream()
                .map(a -> a.order)
                .forEach(System.out::print);

    }
}
