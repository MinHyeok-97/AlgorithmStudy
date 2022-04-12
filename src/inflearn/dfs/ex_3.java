package inflearn.dfs;

import java.io.*;
import java.util.StringTokenizer;

//최대점수 구하기
public class ex_3 {
    static int arrCnt, total, answer;

    static void dfs(int idx, int sumS, int sumT, int[] arrS, int[] arrT) {
        if (sumT > total) return;
        if (idx == arrCnt) {
            answer = Math.max(sumS, answer);
        } else {
            dfs(idx + 1, sumS + arrS[idx], sumT + arrT[idx], arrS, arrT);
            dfs(idx + 1, sumS, sumT, arrS, arrT);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        arrCnt = Integer.parseInt(st1.nextToken());
        total = Integer.parseInt(st1.nextToken());

        int[] arrScore = new int[arrCnt];
        int[] arrTime = new int[arrCnt];

        for (int i = 0; i < arrCnt; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            arrScore[i] = Integer.parseInt(st2.nextToken());
            arrTime[i] = Integer.parseInt(st2.nextToken());
        }

        dfs(0, 0, 0, arrScore, arrTime);

        System.out.println(answer);
    }
}
