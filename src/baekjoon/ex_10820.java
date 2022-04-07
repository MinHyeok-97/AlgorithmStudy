package baekjoon;

import java.io.*;

public class ex_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = "";

        while ((sentence = br.readLine()) != null) {
            int charCount[] = new int[4]; // 0: 소문자, 1: 대문자, 2: 숫자, 3: 공백

            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    charCount[0]++;
                } else if (c >= 'A' && c <= 'Z') {
                    charCount[1]++;
                } else if (c >= '0' && c <= '9') {
                    charCount[2]++;
                } else if (c == ' '){
                    charCount[3]++;
                }
            }

            for (int i : charCount) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
