package inflearn.array;

import java.io.*;
import java.util.StringTokenizer;

//멘토링
public class ex_12 {
    static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;

                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int z = 0; z < n; z++) {
                        if (arr[k][z] == i) {
                            pi = z;
                        }
                        if (arr[k][z] == j) {
                            pj = z;
                        }
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        System.out.println(solution(n, m, arr));
    }

}
