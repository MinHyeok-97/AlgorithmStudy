package baekjoon;

import java.io.*;
import java.util.ArrayList;

public class ex_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[1000001];
        ArrayList<Integer> prime = new ArrayList<>();

        //소수 구해서 리스트에 삽입
        check[0] = check[1] = true;
        for (int i = 2; i < check.length - 1; i++) {
            if (check[i] == false) {
                prime.add(i);
                for (int j = i + i; j < check.length - 1; j += i) {
                    check[j] = true;
                }
            }
        }

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }

            for (int i = 0; i < prime.size(); i++) {
                if (!check[num - prime.get(i)]){  // 골드바흐의 추측 n = a(소수) + b(소수) == a(소수) = n - b(소수)
                    System.out.println(num + " = " + prime.get(i) + " + " + (num - prime.get(i)));
                    break;
                }
            }
        }

    }
}
