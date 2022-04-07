package inflearn.hash;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

//매출액 종류 hashmap, sliding window
public class ex_3 {
    static ArrayList<Integer> solution(int cnt, int range, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < range - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = range - 1; rt < cnt; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int numCnt = Integer.parseInt(st1.nextToken());
        int range = Integer.parseInt(st1.nextToken());
        int[] arrNum = new int[numCnt];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numCnt; i++) {
            arrNum[i] = Integer.parseInt(st2.nextToken());
        }

        for (int a : solution(numCnt, range, arrNum)) {
            System.out.print(a + " ");
        }
    }
}
