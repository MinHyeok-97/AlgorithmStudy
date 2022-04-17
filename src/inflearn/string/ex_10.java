package inflearn.string;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

//가장 짧은 문자 거리
public class ex_10 {
    static int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        char[] arrChar = s.toCharArray();
        int pos = 100;

        pos = 100;
        for (int i = 0; i < arrChar.length; i++) {
            if (arrChar[i] == t) {
                pos = 0;
                answer[i] = pos;
            } else {
                pos++;
                answer[i] = pos;
            }
        }

        pos = 100;
        for (int i = arrChar.length - 1; i >= 0; i--) {
            if (arrChar[i] == t) {
                pos = 0;
                answer[i] = pos;
            } else {
                pos++;
                answer[i] = Math.min(answer[i], pos);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s = st.nextToken();
        char t = st.nextToken().charAt(0);

        for (int a : solution(s, t)) {
            System.out.print(a + " ");
        }
    }
}
