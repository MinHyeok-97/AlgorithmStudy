package baekjoon;

import java.io.*;

public class ex_11655 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String sentence = br.readLine();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c <= 'm') {
                    sb.append(c += 13);
                } else {
                    sb.append(c -= 13);
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (c <= 'M') {
                    sb.append(c += 13);
                } else {
                    sb.append(c -= 13);
                }
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb);

    }
}
