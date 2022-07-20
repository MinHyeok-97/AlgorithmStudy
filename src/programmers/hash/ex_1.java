package programmers.hash;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

//폰켓몬
public class ex_1 {
    static int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int n : nums) {
            hs.add(n);
        }

        if (hs.size() > nums.length / 2) return nums.length / 2;

        return hs.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(arr));
    }
}
