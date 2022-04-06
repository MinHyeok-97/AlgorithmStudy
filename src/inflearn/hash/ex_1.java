package inflearn.hash;

import java.io.*;
import java.util.HashMap;

//학급 회장
public class ex_1 {
    static char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for (char key : str.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int max = 0;
        for (char key : map.keySet()){
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String result = br.readLine();

        System.out.println(solution(num, result));
    }
}
