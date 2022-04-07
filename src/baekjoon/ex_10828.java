package baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class ex_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //스택
        Stack<Integer> s = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push":
                    s.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    if (s.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(s.pop() + "\n");
                    }
                    break;
                case "size":
                    bw.write(s.size() + "\n");
                    break;
                case "empty":
                    if (s.empty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "top":
                    if (s.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(s.peek() + "\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
/** 런타임 오류
 public static int[] stack;
 public static int size = 0;

 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 StringBuilder sb = new StringBuilder();

 int num = in.nextInt();

 stack = new int[num];

 for(int i = 0; i < num; i++) {
 String cmd = in.next();

 switch (cmd) {
 case "push":
 push(in.nextInt());
 break;
 case "pop":
 sb.append(pop()).append("\n");
 break;
 case "size":
 sb.append(size()).append("\n");
 break;
 case "empty":
 sb.append(empty()).append("\n");
 break;
 case "top":
 sb.append(top()).append("\n");
 break;
 }
 }
 System.out.println(sb);
 }

 public static void push(int value){
 stack[size] = value;
 size++;
 }

 public static int pop(){
 if(size < 1) {
 return -1;
 } else {
 int popValue = stack[size -1];
 stack[size - 1] = 0;
 size--;
 return popValue;
 }
 }

 public static int size() {
 return size;
 }

 public static int empty() {
 if(size < 1) {
 return -1;
 } else {
 return 0;
 }
 }

 public static int top() {
 return stack[size - 1];
 }*/




