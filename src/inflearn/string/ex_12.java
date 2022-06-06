package inflearn.string;

import java.io.*;

//암호
public class ex_12 {
    static String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String code = br.readLine();

        System.out.println(solution(num, code));
    }
}
