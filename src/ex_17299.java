import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class ex_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numCnt = Integer.parseInt(br.readLine());
        int[] numArr = new int[numCnt];
        int[] result = new int[numCnt];
        int[] CntArr = new int[1_000_001];

        Stack<Integer> intStack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numCnt; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
            CntArr[numArr[i]]++;
        }

        for (int i = 0; i < numCnt; i++) {
            while (!intStack.isEmpty() && CntArr[numArr[i]] > CntArr[numArr[intStack.peek()]]) {
                result[intStack.pop()] = numArr[i];
            }

            intStack.push(i);
        }

        while (!intStack.isEmpty()) {
            result[intStack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numCnt; i++) {
            sb.append(result[i]).append(' ');
        }

        System.out.println(sb);

    }
}
