import java.io.*;
import java.util.StringTokenizer;

public class ex_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[N + 1];

        for(int i = 2; i <= N; i++) {
            if(prime[i]) continue;

            if(i >= M) sb.append(i).append('\n');

            for(int j = i + i; j <= N; j += i) {
                prime[j] = true;
            }
        }

        System.out.println(sb);
    }
}

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        int num1 = Integer.parseInt(st.nextToken());
//        int num2 = Integer.parseInt(st.nextToken());
//
//        for(int i = num1; i <= num2; i++) {
//            boolean isPrime = true;
//
//            if (i == 1) {
//                continue;
//            }
//            for(int j = 2; j <= Math.sqrt(i); j++){
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                sb.append(i).append("\n");
//            }
//        }
//
//        System.out.println(sb);
//    }