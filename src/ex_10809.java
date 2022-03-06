import java.io.*;

public class ex_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] seqArr = new int[26];

        for (int i = 0; i < seqArr.length; i++) {
            seqArr[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (seqArr[c - 'a'] == -1) {
                seqArr[c - 'a'] = i;
            }
        }

        for (int value : seqArr) {
            System.out.print(value + " ");
        }
    }
}

