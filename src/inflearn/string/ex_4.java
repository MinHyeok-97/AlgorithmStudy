package inflearn.string;

import java.io.*;

//단어 뒤집기
public class ex_4 {
    static String solution(String str) {
//        String answer = new StringBuilder(str).reverse().toString();
        String answer = "";
        char[] ch = str.toCharArray();
        int lt = 0, rt = ch.length - 1;

        while (lt < rt) {
            char temp = ch[lt];
            ch[lt] = ch[rt];
            ch[rt] = temp;
            lt++;
            rt--;
        }

        for(int i = 0; i < ch.length; i++) {
            answer += String.valueOf(ch[i]);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];

        for (int i = 0; i < num; i++) {
            str[i] = br.readLine();
        }

        for (String s : str) {
            System.out.println(solution(s));
        }
    }
}
