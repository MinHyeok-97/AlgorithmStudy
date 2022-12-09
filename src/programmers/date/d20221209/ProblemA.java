package programmers.date.d20221209;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProblemA {
    static int solution(String str1, String str2) {
        double answer = 0;

        List<String> arrStr1 = new ArrayList<>();
        List<String> arrStr2 = new ArrayList<>();
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length() - 1; i++) {
            char first = str1.charAt(i);
            char second = str1.charAt(i + 1);

            if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') arrStr1.add(first + "" +second);
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char first = str2.charAt(i);
            char second = str2.charAt(i + 1);

            if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') arrStr2.add(first + "" +second);
        }

        for (String str : arrStr1) {
            if (arrStr2.remove(str)) {
                intersection.add(str);
            }
            union.add(str);
        }
        union.addAll(arrStr2);

        if (union.size() == 0) answer = 1;
        else answer = (double) intersection.size() / (double) union.size();

        return (int) (answer * 65536);
    }

    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";
//        String str1 = "handshake";
//        String str2 = "shake hands";

        System.out.println(solution(str1, str2));
    }
}
