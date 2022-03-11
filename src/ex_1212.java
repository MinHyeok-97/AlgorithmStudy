import java.io.*;

public class ex_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String num = br.readLine();

        for (int i = 0; i < num.length(); i++) {
            int eight = num.charAt(i) - '0';

            if (i == 0 && eight < 4) {
                if (eight < 2) {
                    sb.append(binary[eight].substring(2));
                } else {
                    sb.append(binary[eight].substring(1));
                }
            } else {
                sb.append(binary[eight]);
            }
        }

        System.out.println(sb);
    }
}
