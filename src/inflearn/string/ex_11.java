package inflearn.string;

import java.io.*;

//문자열 압축
public class ex_11 {
    static String solution(String s) {
        String answer = "";

        s = s + " ";
        int cnt = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

//        char temp = ' ';
//        int cnt = 0;
//        for (char c : s.toCharArray()) {
//            if (c == temp) {
//                cnt++;
//            } else {
//                if (cnt > 1) answer += cnt;
//                cnt = 1;
//                answer += c;
//            }
//
//            temp = c;
//        }
//        if (cnt > 1) answer += cnt;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
