package baekjoon;

import java.util.Deque;
import java.io.*;
import java.util.LinkedList;

public class ex_10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cmdCnt = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < cmdCnt; i++) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push_front" :
                    deque.offerFirst(Integer.parseInt(cmd[1]));
                    break;
                case "push_back" :
                    deque.offerLast(Integer.parseInt(cmd[1]));
                    break;
                case "pop_front" :
                    if (deque.isEmpty()) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(deque.pollFirst() + "\n");
                    }
                    break;
                case "pop_back" :
                    if (deque.isEmpty()) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(deque.pollLast() + "\n");
                    }
                    break;
                case "size" :
                    sb.append(deque.size() + "\n");
                    break;
                case "empty" :
                    if (deque.isEmpty()) {
                        sb.append("1" + "\n");
                    } else {
                        sb.append("0" + "\n");
                    }
                    break;
                case "front" :
                    if (deque.isEmpty()) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(deque.peekFirst() + "\n");
                    }
                    break;
                case "back" :
                    if (deque.isEmpty()) {
                        sb.append("-1" + "\n");
                    } else {
                        sb.append(deque.peekLast() + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
