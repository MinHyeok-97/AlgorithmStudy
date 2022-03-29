package inflearn.string;

import java.io.*;

//특정 문자 뒤집기
public class ex_5 {
    static String solution(String str) {
        String answer = "";

        char[] ch = str.toCharArray();
        int lt = 0, rt = ch.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(ch[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(ch[rt])) {
                rt--;
            } else {
                char temp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(ch);
//        for (int i = 0; i < ch.length; i++) {
//            answer += ch[i];
//        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
