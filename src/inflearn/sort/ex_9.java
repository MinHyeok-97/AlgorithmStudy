package inflearn.sort;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//뮤직비디오(결졍 알고리즘)
public class ex_9 {
    static int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return cnt;
    }

    static int solution(int n, int m, int[] arr) {
        int answer = 0;
//        int lt = Arrays.stream(arr).max().getAsInt();
//        int rt = Arrays.stream(arr).sum();
        int lt = 0, rt = 0;

        for (int i = 0; i < n; i++) {
            lt = Math.max(lt, arr[i]);
            rt += arr[i];
        }

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(n, m, arr));
    }
}
