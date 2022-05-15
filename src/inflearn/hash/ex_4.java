package inflearn.hash;

import java.io.*;
import java.util.HashMap;

//모든 아나그램 찾기
public class ex_4 {
    static int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for (char key : t.toCharArray()) {
            tMap.put(key, tMap.getOrDefault(key, 0) + 1);
        }

        int length = t.length() - 1;
        for (int i = 0; i < length; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = length; rt < s.length(); rt++) {
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0) + 1);

            if (tMap.equals(sMap)) {
                answer++;
            }

            sMap.put(s.charAt(lt), sMap.get(s.charAt(lt)) - 1);
            if (sMap.get(s.charAt(lt)) == 0) sMap.remove(s.charAt(lt));
            lt++;
        }


        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String t = br.readLine();

        System.out.println(solution(s, t));
    }
}
