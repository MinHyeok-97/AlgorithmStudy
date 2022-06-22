package inflearn.hash;

import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

//K번째 큰 수
public class ex_5 {
    static int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    treeSet.add(arr[i] + arr[j] + arr[z]);
                }
            }
        }

        int cnt = 0;
        for (int t : treeSet) {
            cnt++;
            if (cnt == k) return t;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(n, k, arr));

    }
}
