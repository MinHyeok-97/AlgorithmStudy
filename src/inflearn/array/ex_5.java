package inflearn.array;

import java.io.*;

//소수 개수
public class ex_5 {
    static int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n + 1];

        check[0] = check[1] = true;
        for (int i = 2; i <= n; i++) {
                if(!check[i]) {
                    answer++;
                }
            for (int j = i + i; j <= n; j += i) {
                check[j] = true;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(solution(num));
    }
}
