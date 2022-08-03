package programmers.sort;

//k번째수 - 라이브러리 x
public class ex_1_2 {
    static void sort(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int x = arr[(pl + pr) / 2];
        
        do {
            while (arr[pl] < x) pl++;
            while (arr[pr] > x) pr--;
            
            if (pl <= pr) {
                int temp = arr[pl];
                arr[pr] = arr[pl];
                arr[pl] = temp;
                pl++;
                pr--;
            }
        } while (pl <= pr);

        if (left < pr) sort(arr, left, pr);
        if (right > pr) sort(arr, pl, right);
    }

    static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int range = commands[i][1] - commands[i][0] + 1;

            if (range == 1) {
                answer[i] = commands[i][2] - 1;
                break;
            }

            int[] arr = new int[range];
            int k = 0;
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                arr[k++] = array[j];
            }

            sort(arr, 0, range - 1);

            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        //print(answer)
    }
}
