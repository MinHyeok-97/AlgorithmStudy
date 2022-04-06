package inflearn.hash;

import java.io.*;
import java.util.HashMap;

//아나그램
public class ex_2 {
    static String solution(String a, String b) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char key : a.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (char key : b.toCharArray()) {
            if (!map.containsKey(key) || map.get(key) == 0) return "NO";

            map.put(key, map.get(key) - 1);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strA = br.readLine();
        String strB = br.readLine();

        System.out.println(solution(strA, strB));
    }
}
