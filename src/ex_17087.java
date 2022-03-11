import java.io.*;
import java.util.StringTokenizer;

public class ex_17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer firstLine = new StringTokenizer(br.readLine());
        StringTokenizer secondLine = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(firstLine.nextToken());
        int S = Integer.parseInt(firstLine.nextToken());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Math.abs(Integer.parseInt(secondLine.nextToken()) - S);
        }

        int gcd = A[0];
        for (int i = 0; i < N - 1; i++) {
            gcd = getGCD(gcd, A[i + 1]);
        }

        System.out.println(gcd);
    }

    static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }
}