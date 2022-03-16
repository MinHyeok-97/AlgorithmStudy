import java.io.*;

public class ex_2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        if (num == 0) {
            System.out.println(0);
        } else {
            while (num != 1) {
                sb.append(Math.abs(num % -2));
                num = (int)Math.ceil((double) num / -2);
            }

            sb.append(num);

            System.out.println(sb.reverse());
        }
    }
}
