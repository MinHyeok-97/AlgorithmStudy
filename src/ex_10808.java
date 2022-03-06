import java.io.*;

public class ex_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] cntArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            //cntArr[(int)s.charAt(i) - 97]++;
            cntArr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < cntArr.length; i++) {
            sb.append(cntArr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
