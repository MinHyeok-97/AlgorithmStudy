package inflearn.stacknqueue;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//인형 뽑기
public class ex_3 {
    static int solution(int size, int cnt, int[][] board, int[] mv) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int pos : mv) {
            for (int i = 0; i < size; i++) {
                if (board[i][pos - 1] > 0) {
                    if (!basket.empty() && basket.peek() == board[i][pos - 1]) {
                        board[i][pos - 1] = 0;
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(board[i][pos - 1]);
                        board[i][pos - 1] = 0;
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[][] board = new int[size][size];

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < size; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int moveCnt = Integer.parseInt(br.readLine());
        int[] moves = new int[moveCnt];

        StringTokenizer mv = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < moveCnt; i++) {
            moves[i] = Integer.parseInt(mv.nextToken());
        }

        System.out.println(solution(size, moveCnt, board, moves));
    }
}
