package inflearn.string;

import java.io.*;

//유효한 팰린드롬
public class ex_8 {
    static String solution(String str) {
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();

        if(str.equals(temp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
