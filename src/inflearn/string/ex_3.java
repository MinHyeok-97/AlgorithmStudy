package inflearn.string;

import java.io.*;

//문장 속 단어
public class ex_3 {
    static String solution(String str) {
        String answer = "";

        String[] s = str.split(" ");

        int max = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > max) {
                max = s[i].length();
                answer = s[i];
            }
        }
//        int max = 0, pos;
//        while ((pos = str.indexOf(' ')) != -1) {
//            String temp = str.substring(0, pos);
//
//            if (temp.length() > max) {
//                max = temp.length();
//                answer = temp;
//            }
//
//            str = str.substring(pos + 1);
//        }
//
//        if(str.length() > max) {
//            answer = str;
//        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(br.readLine()));
    }
}
