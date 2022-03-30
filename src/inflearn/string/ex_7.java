package inflearn.string;

import java.io.*;

//회문 문자열
public class ex_7 {
    static String solution(String str) {
        String answer = "YES";

        String temp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(temp)) {
            answer = "NO";
        }
//        str = str.toUpperCase();
//
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                answer = "NO";
//            }
//        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
