package programmers.greedy;

import java.util.Arrays;

//체육복
public class ex_1 {
    static int solution2(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] student = new int[n];

        for (int l : lost) {
            student[l - 1]--;
        }
        for (int r : reserve) {
            student[r - 1]++;
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] == -1) {
                if (i - 1 >= 0 && student[i - 1] == 1) {
                    student[i]++;
                    student[i - 1]--;
                } else if (i + 1 < student.length && student[i + 1] == 1) {
                    student[i]++;
                    student[i + 1]--;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
