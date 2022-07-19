package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//국영수
public class B_10825 {
    static class exam implements Comparable<exam> {
        public String name;
        public int korean, english, math;

        public exam(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(exam e) {
            if (this.korean != e.korean) return e.korean - this.korean;
            if (this.english != e.english) return this.english - e.english;
            if (this.math != e.math) return e.math - this.math;
            else return name.compareTo(e.name);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        ArrayList<exam> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            String name = st2.nextToken();
            int korean = Integer.parseInt(st2.nextToken());
            int english = Integer.parseInt(st2.nextToken());
            int math = Integer.parseInt(st2.nextToken());
            arr.add(new exam(name, korean, english, math));
        }

        Collections.sort(arr);

        for (exam e : arr) {
            System.out.println(e.name);
        }
    }
}
