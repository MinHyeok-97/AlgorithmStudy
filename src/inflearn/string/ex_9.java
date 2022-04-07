package inflearn.string;

import java.io.*;

//숫자만 추출
public class ex_9 {
    static int solution(String str) {
        int answer = 0;

        for (char c : str.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer = (answer * 10) + (c - '0');
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
