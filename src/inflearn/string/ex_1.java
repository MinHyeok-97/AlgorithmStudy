package inflearn.string;

import java.io.*;

//1. 문자 찾기
public class ex_1 {
    static int solution(String s, char c) {
        int count = 0;

        s = s.toUpperCase();
        c = Character.toUpperCase(c);

        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().charAt(0);

        System.out.println(solution(str, c));
    }
}
