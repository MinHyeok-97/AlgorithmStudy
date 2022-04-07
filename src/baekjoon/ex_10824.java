package baekjoon;

import java.io.*;

public class ex_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] intVal = br.readLine().split(" ");

        long num1 = Long.parseLong(intVal[0] + intVal[1]);
        long num2 = Long.parseLong(intVal[2] + intVal[3]);

        System.out.println(num1 + num2);
    }
}
