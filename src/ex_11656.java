import java.io.*;
import java.util.Arrays;

public class ex_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String[] result = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            result[i] = word.substring(i, result.length);
        }

        Arrays.sort(result);

        for (int i = 0; i < word.length(); i++) {
            System.out.println(result[i]);
        }

    }
}
