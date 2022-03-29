package inflearn.string;

import java.io.*;

//대소문자 변환
public class ex_2 {
    static String solution(String str) {
        String answer = "";

        for (char ch : str.toCharArray()){
//            if(ch >= 'A' && ch <= 'Z')
            if (Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            } else {
                answer += Character.toUpperCase(ch);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
