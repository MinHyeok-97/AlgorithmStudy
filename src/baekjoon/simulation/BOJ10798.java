package baekjoon.simulation;

import java.io.*;

//세로 읽기
public class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0') continue;
                sb.append(arr[j][i]);
            }
        }

        System.out.println(sb);
    }
}
